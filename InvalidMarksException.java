class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    static void checkMarks(String name, int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        System.out.println("Valid marks");
    }

    public static void main(String[] args) {

        String name = "Rahul";
        int marks = 105;

        try {
            checkMarks(name, marks);
        }
        catch (InvalidMarksException e) {
            System.out.println("Student: " + name);
            System.out.println("Marks entered: " + marks);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
