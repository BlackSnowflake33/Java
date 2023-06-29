package Lesson.WH.WH1;
// Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    static int getSum(int a, int b) {
        return a + b;
    }

    static int getSubtraction(int a, int b) {
        return a - b;
    }

    static int getProduct(int a, int b) {
        return a * b;
    }

    static double getDivision(int a, int b) {
        return (double) a / (double) b;
    }

    static void printResultOfOperation(int a, int b, String signOperation) {
        switch (signOperation) {
        case "+":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, getSum(a, b));
            break;
        case "-":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, getSubtraction(a, b));
            break;
        case "*":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, getProduct(a, b));
            break;
        case "/":
            if (b != 0) {
                System.out.printf("%d %s %d = %.4f \n", a, signOperation, b, getDivision(a, b));
            } else {
                System.out.println("ERROR: division by zero!!!");
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = 0;
        if (!scn.hasNextInt()) {
            System.out.println("Вы ввели неправильное число!!!");
        } else {
            a = scn.nextInt();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Введите оператор:: +, -, *, / \n");
            String signOperation = "";
            if (sc.hasNextLine()) {
                signOperation = sc.nextLine();
            }
            if (signOperation.equals("+") || signOperation.equals("-") || signOperation.equals("*")
                    || signOperation.equals("/")) {
                int b = 0;
                System.out.printf("Введите второе число: ");
                if (!scn.hasNextInt()) {
                    System.out.println("Вы ввели неправильное число!!!");
                } else {
                    b = scn.nextInt();
                    printResultOfOperation(a, b, signOperation);
                }
            } else {
                System.out.println("Вы ввели неправильную операцию!!!");
            }
            scn.close();
            sc.close();
        }
    }
    
}
