/**
 * User: Chittra Kumari
 * Date: 26-02-2022
 * IDE: IntelliJ IDEA
 * File: PACKAGE_NAME.Main.java
 * JDK: Oracle JDK 17
 */

public class Main {
    public static void main(String[] args) {
        try {
            int result = 20 / 0;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);

        }
    }
}
