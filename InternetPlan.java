public class InternetPlan {
        String planName;
        int data;
        int price;

        // Constructor 1
        InternetPlan() {
            this("Basic", 10, 199);
        }

        // Constructor 2
        InternetPlan(String planName) {
            this(planName, 20, 299);
        }

        // Constructor 3
        InternetPlan(String planName, int data, int price) {
            this.planName = planName;
            this.data = data;
            this.price = price;
        }

        // Method to display plan details
        void display() {
            System.out.println("Plan Name: " + planName);
            System.out.println("Data: " + data + " GB");
            System.out.println("Price: Rs." + price);
            System.out.println();
        }

        public static void main(String[] args) {
            InternetPlan p1 = new InternetPlan();
            InternetPlan p2 = new InternetPlan("Premium");
            InternetPlan p3 = new InternetPlan("Unlimited", 50, 499);

            p1.display();
            p2.display();
            p3.display();
        }
}
