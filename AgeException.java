class AgeValidator {
    public void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        } else {
            System.out.println("Valid Age");
        }
    }
}

public class AgeException {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        try {
            validator.validateAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception:" + e.getMessage());
        }
    }
}
