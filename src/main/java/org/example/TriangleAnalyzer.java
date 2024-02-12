package org.example;

import java.util.Scanner;

public class TriangleAnalyzer {
    public static void main(String[] args) {
        // Ввод трех целых чисел с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число c: ");
        int c = scanner.nextInt();

        // Проверка условий
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("a, b и c не являются сторонами треугольника");
        } else if (a == b && b == c) {
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        } else if (a == b || b == c || c == a) {
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        } else {
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
    }
}