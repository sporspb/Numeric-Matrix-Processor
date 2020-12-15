import java.util.function.LongBinaryOperator;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> {
        long prod = 1;
        for (long i = x; i <= y; i++) {
            prod *= i;
        }
        return prod;
    };
}

    /* by stream
    public static LongBinaryOperator binaryOperator = (x, y) -> LongStream
            .rangeClosed(x, y)
            .reduce((a, b) -> a * b)
            .orElse(0);*/