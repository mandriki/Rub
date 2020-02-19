package Rub.all;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа склонение \"Рубль\"");
                System.out.print("Введите число и нажмите enter: ");
        int i = sc.nextInt();
        if (i % 10 == 0 || i % 10 >= 5 || i % 100 >= 10 && i % 100 <= 20)
            System.out.println(i + " Рублей");
        else
            if (i > 1 && i < 5 || i % 10 > 1 && i % 10 < 5)
                System.out.println(i + " Рубля");
            else
                System.out.println(i + " Рубль");
    }
}
