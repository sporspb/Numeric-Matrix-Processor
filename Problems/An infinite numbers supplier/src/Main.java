import java.util.function.Supplier;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        return new Supplier<Integer>() {
            int anInt = 0;

            @Override
            public Integer get() {
                return anInt++;
            }
        };
    }

    /*by stream
    public static Supplier<Integer> getInfiniteRange() {
        return IntStream.iterate(0, i -> i + 1).iterator()::next;
    }*/
}