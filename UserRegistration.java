class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class UserRegistration {
    public void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older for registration");
        }
        System.out.println("User Registered Succesfully.");
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.validateAge(18);
        } catch (AgeException e) {
            System.out.println("Registration failed:" + e.getMessage());
        }
    }
}