package dz2;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
//        1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
//        приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
        System.out.println(request());

//        2. Дан следующий код, исправьте его там, где требуется

//        try {
//            int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//        3. Дан следующий код, исправьте его там, где требуется
//        public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(null, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//        4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
//        System.out.println(inputString());

    }
        public static void printSum(Integer a, Integer b) throws NullPointerException {
            System.out.println(a + b);
        }


    private static Float request() {
        float y;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(("double y: "));
            y = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Некорректное значение. Попробуйте еще раз.");
            if (e.getMessage()==null) {
                request();
            }
            y = scanner.nextFloat();
        } finally {
            scanner.close();
        }
        return y;
    }
    public static int inputString() {
        String str;
        Scanner scanner = new Scanner(System.in);
            System.out.println(("Введите непустую строку: "));
            str = scanner.nextLine();
            if (str.length() == 0) {
                throw new RuntimeException("Пустая строка!");
            }
        return str.length();
    }
}
