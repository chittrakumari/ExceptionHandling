/**
 * User: Chittra Kumari
 * Date: 27-02-2022
 * IDE: IntelliJ IDEA
 * File: ChainedException.InitMethod.java
 * JDK: Oracle JDK 17
 */

package ChainedException;

public class InitMethod {


    public static void main(String[] args) throws ArithmeticException, NullPointerException {

        try {
            NullPointerException nullPointerException = new NullPointerException();
            nullPointerException.initCause(new ArithmeticException("cause"));
            throw nullPointerException;
        } catch (Exception exception) {
            System.out.println(exception.getCause());
        }

    }
}
