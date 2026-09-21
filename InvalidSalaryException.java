class InvalidSalaryException extends Exception {

    InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee {

    static void checkSalary(double salary) throws InvalidSalaryException {

        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }

        System.out.println("Valid Salary: " + salary);
    }

    public static void main(String[] args) {

        double salary = -5000;

        try {
            checkSalary(salary);
        }
        catch (InvalidSalaryException e) {
            System.out.println("Salary entered: " + salary);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
