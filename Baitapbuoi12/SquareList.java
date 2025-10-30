package Baitapbuoi12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    class MathUtils {
        public static int square(int n) {
            return n * n;
        }
    }

    public class SquareList {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            List<Integer> squares = numbers.stream()
                    .map(MathUtils::square)
                    .collect(Collectors.toList());

            System.out.println("Squared numbers: " + squares);
        }
    }


