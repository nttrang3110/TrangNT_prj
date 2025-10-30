package Baitapbuoi12.Bai4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(MathUtils::square)
                .collect(Collectors.toList());

        System.out.println("Squared numbers: " + squares);
    }
}


