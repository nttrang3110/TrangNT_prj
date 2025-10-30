package Baitapbuoi12;

public class Lambda {
        public static void main(String[] args) {
            MathOperation add = (a, b) -> a + b;
            MathOperation sub = (a, b) -> a - b;
            MathOperation mul = (a, b) -> a * b;
            MathOperation div = (a, b) -> b == 0 ? 0 : a / b;

            System.out.println("Add: " + add.operate(10, 5));
            System.out.println("Sub: " + sub.operate(10, 5));
            System.out.println("Mul: " + mul.operate(10, 5));
            System.out.println("Div: " + div.operate(10, 5));
        }
    }


