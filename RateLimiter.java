import java.util.*;

public class RateLimiter {
    // Maximum requests allowed in the given time window
    private final int limit;
    // Time window converted into milliseconds
    private final long windowMillis;
    // Stores request timestamps for each user
    // Key   -> User ID
    // Value -> Queue of request timestamps
    private Map<String, Queue<Long>> map = new HashMap<>();

    public RateLimiter(int limit, int windowSeconds) {
        this.limit = limit;
        this.windowMillis = windowSeconds * 1000L;
    }

    public boolean allow(String userId) {
         // Current request timestamp

        long now = System.currentTimeMillis();

        // Create a queue for the user if it doesn't exist
        map.putIfAbsent(userId, new LinkedList<>());
        Queue<Long> q = map.get(userId);

        
        // Remove all expired requests
        // Requests older than the configured window are discarded
        while (!q.isEmpty() && now - q.peek() >= windowMillis) {
            q.poll();
        }

        // Allow request if user has not exceeded the limit
        if (q.size() < limit) {
            
            // Store current request timestamp
            q.add(now);
            return true;
        }

        return false;
    }
}
