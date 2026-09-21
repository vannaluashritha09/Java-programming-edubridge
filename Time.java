public class Time {
        int seconds;

        // Constructor with seconds
        Time(int s) {
            seconds = s;
        }

        // Constructor with minutes and seconds
        Time(int m, int s) {
            seconds = (m * 60) + s;
        }

        // Constructor with hours, minutes and seconds
        Time(int h, int m, int s) {
            seconds = (h * 3600) + (m * 60) + s;
        }

        void display() {
            System.out.println("Time in seconds = " + seconds);
            System.out.println("Time in minutes = " + (seconds / 60.0));
            System.out.println("Time in hours = " + (seconds / 3600.0));
            System.out.println();
        }

        public static void main(String[] args) {

            // Calling different constructors
            Time t1 = new Time(120);
            Time t2 = new Time(2, 30);
            Time t3 = new Time(1, 30, 20);

            t1.display();
            t2.display();
            t3.display();
        }
    }

