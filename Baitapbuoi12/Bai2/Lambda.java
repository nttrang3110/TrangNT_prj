package Baitapbuoi12.Bai2;

import Baitapbuoi12.Bai2.MathOperation;

public class Lambda {
        public static void main(String[] args) {
            MathOperation add = (a, b) -> a + b;
            MathOperation sub = (a, b) -> a - b;
            MathOperation mul = (a, b) -> a * b;
            MathOperation div = (a, b) -> b == 0 ? 0 : a / b;

            System.out.println("Add: " + add.operate(15, 5));
            System.out.println("Sub: " + sub.operate(15, 5));
            System.out.println("Mul: " + mul.operate(15, 5));
            System.out.println("Div: " + div.operate(15, 5));
        }
    }


