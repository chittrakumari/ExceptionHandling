/**
 * User: Chittra Kumari
 * Date: 26-02-2022
 * IDE: IntelliJ IDEA
 * File: ChainedException.Main.java
 * JDK: Oracle JDK 17
 */

package ChainedException;

public class Main {
    public static void processA() throws ArithmeticException {
        System.out.println("strive harder");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            processA();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
