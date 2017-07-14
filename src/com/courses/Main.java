package com.courses;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.println("Решение уравнения вида: a*x^3 + b*x = 0.\nВведите a: ");
        double a, b;
        double x;
        double koren1 , koren2;
        a = in.nextInt();
        System.out.println("и b: ");
        b = in.nextInt();
        System.out.println("Один X выносить за скобки. \n Получаем вид х ("+a+" * x^2 + "+b+") = 0\nОдин из корней сразу Х=0 и переходим к поиску второго коря");
        System.out.println(a+" * x^2 +"+b+" = 0\n"+a+" * x^2 ="+b*(-1)+"\nx^2 = "+(-1)*(b/a));
        System.out.println("Так как после возведения в квадрат мы не получим отрицательное число опускаем этот момент.");
    }
}
