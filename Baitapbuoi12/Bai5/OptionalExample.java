package Baitapbuoi12.Bai5;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String inputName = null;
        Optional<String> name = Optional.ofNullable(inputName);

        if (name.isPresent()) {
            System.out.println("Tên: " + name.get());
        } else {
            System.out.println("Không có tên");
        }
        

    }
}

