package org.example;

public class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

class Validator {
    public void validateAge(int age) throws InvalidUserException {
        if (age < 0) {
            throw new InvalidUserException("Age cannot be negative");
        }
        if (age < 18) {
            throw new InvalidUserException("User must be at least 18 years old");
        }
    }

    public void validateUsername(String username) throws InvalidUserException {
        if (username == null) {
            throw new InvalidUserException("Username cannot be null");
        }

        String trimmed = username.trim();
        if (trimmed.length() < 5) {
            throw new  InvalidUserException("Username must be at least 5 characters long");
        }

        if (username.contains(" ")) {
            throw new InvalidUserException("Username cannot contain spaces");
        }
    }

    public void validateEmail(String email) throws InvalidUserException {
        if (email == null) {
            throw new InvalidUserException("Email cannot be null");
        }

        if (!email.contains("@")) {
            throw new InvalidUserException("Email address must contain an email address");
        }

        if (!email.substring(email.indexOf("@")).contains(".")) {
            throw new InvalidUserException("Email address must contain an email address");
        }
    }

    public void validateUser(String username, String email, int age) throws InvalidUserException {
        validateUsername(username);
        validateEmail(email);
        validateAge(age);

        System.out.println("User is valid: " + username);
    }

    public static void main(String[] args) {
        Validator validator = new Validator();

        try {
            validator.validateUser("merjem123", "merjem.alic@stu.ibu.edu.ba", 21);
        } catch (InvalidUserException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            validator.validateUser("ali", "ali.com", 10000);
        } catch (InvalidUserException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
