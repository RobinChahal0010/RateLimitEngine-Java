import java.util.*;

public class RateLimiter {
    // Maximum requests allowed in the given time window
    private final int limit;
    // Time window converted into milliseconds
    private final long windowMillis;
    // Stores request timestamps for each user

    private Map<String, Queue<Long>> map = new HashMap<>();

    public RateLimiter(int limit, int windowSeconds) {
        this.limit = limit;
        this.windowMillis = windowSeconds * 1000L;
    }

    public boolean allow(String userId) {

        long now = System.currentTimeMillis();

        map.putIfAbsent(userId, new LinkedList<>());
        Queue<Long> q = map.get(userId);

        
        while (!q.isEmpty() && now - q.peek() >= windowMillis) {
            q.poll();
        }

        if (q.size() < limit) {
            q.add(now);
            return true;
        }

        return false;
    }
}
