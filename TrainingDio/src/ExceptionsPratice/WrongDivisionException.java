package ExceptionsPratice;

public class WrongDivisionException extends Exception {

    private int numerator;
    private int denominator;

    public WrongDivisionException(String message, int numerator, int denominator) {
        super(message);
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
