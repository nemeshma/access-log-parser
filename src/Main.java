import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        int quotient = firstNumber + secondNumber;
        System.out.println("Сумма: " + quotient);
        int quotient2 = firstNumber - secondNumber;
        System.out.println("Разность: " + quotient2);
        int quotient3 = firstNumber * secondNumber;
        System.out.println("Произведение: " + quotient3);
        double quotient4 = (double) firstNumber / secondNumber;
        System.out.println("Частное: " + quotient4);
    }
}