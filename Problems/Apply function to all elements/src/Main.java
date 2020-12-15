import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;


public class Main {

    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        Arrays.setAll(array, i -> func.apply(array[i]));
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim : String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}