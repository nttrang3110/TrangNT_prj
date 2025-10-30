import java.util.Optional;

public class NullPointerException {
    public static void main(String[] args) {
        String maybeNull = null;
        Optional<String> name = Optional.ofNullable(maybeNull);

        name.ifPresentOrElse(
                n -> System.out.println("Tên là: " + n),
                () -> System.out.println("N/A")
        );
    }
}
