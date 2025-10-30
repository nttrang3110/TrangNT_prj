package Baitapbuoi12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

            // Lấy danh sách số chẵn
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println("Số chẵn " + evenNumbers);

            // Tạo danh sách bình phương các số > 3
            List<Integer> squares = numbers.stream()
                    .filter(n -> n > 3)
                    .map(n -> n * n)
                    .collect(Collectors.toList());
            System.out.println("Bình phương các số >3: " + squares);
        }
    }


