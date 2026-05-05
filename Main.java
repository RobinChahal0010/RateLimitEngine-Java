import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== RATE LIMITER SYSTEM =====");

        System.out.print("Enter User ID: ");
        String user = sc.nextLine();

        System.out.print("Enter Limit (requests): ");
        int limit = sc.nextInt();

        System.out.print("Enter Time Window (seconds): ");
        int window = sc.nextInt();

        System.out.print("Enter number of requests to simulate: ");
        int requests = sc.nextInt();

        RateLimiter rl = new RateLimiter(limit, window);

        System.out.println("\n===== PROCESSING REQUESTS =====");

        for (int i = 1; i <= requests; i++) {

            boolean allowed = rl.allow(user);

            if (allowed) {
                System.out.println("Request " + i + " → ALLOWED");
            } else {
                System.out.println("Request " + i + " → BLOCKED");
            }

            Thread.sleep(1000); 
        }

        sc.close();
    }
}