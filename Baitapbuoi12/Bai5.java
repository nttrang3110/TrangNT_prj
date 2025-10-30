import java.util.Optional;

public class Bai5 {
    public static void main(String[] args) {
        // Trường hợp có giá trị
        Optional<String> name = Optional.of("Trang");
        name.ifPresentOrElse(
                n -> System.out.println("Name: " + n),
                () -> System.out.println("Không có tên")
        );

        // Trường hợp biến có thể null
        String maybeNull = null;
        Optional<String> optName = Optional.ofNullable(maybeNull);

        // Dùng orElse() để trả về giá trị mặc định
        String finalName = optName.orElse("N/A");
        System.out.println("Final name: " + finalName);
    }
}
