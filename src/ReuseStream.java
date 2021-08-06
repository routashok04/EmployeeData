import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
    public static void main(String[] args) {
        String[] inputarray={"Ashok","Sam","khan","Sudeep","Kohli"};
        Supplier<Stream<String>> inputStream = () -> Stream.of(inputarray);
        inputStream.get().forEach(ex-> System.out.println(ex));
        long count = inputStream.get().filter(x -> "s ".equals(x)).count();
        System.out.println(count);

    }
}
