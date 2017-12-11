package net.lafox.demo.knapsack.exception;

public class APIException extends RuntimeException {
    public APIException() {
        super();
    }

    public APIException(String s) {
        super(s);
    }

    public APIException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
