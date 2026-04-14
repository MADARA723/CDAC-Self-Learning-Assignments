package AssignmentQ12;

// Checked Exception
class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

// Unchecked Exception
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Exceptions {

    // Method with checked exception
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100");
        } else {
            System.out.println("Valid Marks: " + marks);
        }
    }

    // Method with unchecked exception
    static void checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }

    public static void main(String[] args) {

        // Checked Exception handling
        try {
            checkMarks(120); // invalid
        } catch (InvalidMarksException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }

        // Unchecked Exception (optional handling)
        try {
            checkAge(15); // invalid
        } catch (InvalidAgeException e) {
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}