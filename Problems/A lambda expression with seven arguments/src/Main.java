import java.util.Locale;

class Seven {

    public static MultipleArgumentsLambda.SeptenaryStringFunction fun = (a, b, c, d, e, f, g) -> String
            .join("", a, b, c, d, e, f, g).toUpperCase(Locale.ROOT);
}