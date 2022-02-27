/**
 * User: Chittra Kumari
 * Date: 27-02-2022
 * IDE: IntelliJ IDEA
 * File: PACKAGE_NAME.CustomException.java
 * JDK: Oracle JDK 17
 */

public class CustomException extends RuntimeException {
    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new CustomException("bhaiya custom exception ayi h");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
