/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arifmetika;

/**
 *
 * @author Слава
 */
public class Arifmetika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int result = a + b;
    System.out.println("Сумма: " + result);
    result = a - b;
    System.out.println("Разность: " + result);
    result = a * b;
    System.out.println("Произведение: " + result);
    result = a / b;
    System.out.println("Деление: " + result);
    Double d = (double) a / b;
    System.out.println("Деление: " + d);
    result = 7 % 3;
    System.out.println("Остаток от деление: " + result);
    a++; // a += 1; a = a + 1; 
    b--; // b+=1; a=a+1; 
    System.out.println("Инкремент: " + a);
    System.out.println("Дикремент: " + b);
    a = a + b;
    System.out.println("а: " + a);
    a += b;
    System.out.println("а: " + a);
    
    double e = 5.2;
    double f = 7.2; 
    double itog;
    itog = e + f;
    System.out.println("Сумма: " + itog);
    itog = e - f;
    System.out.println("Вычитание: " + itog);
    itog = e * f;
    System.out.println("Умножение: " + itog);
    itog = e / f;
    System.out.println("Деление: " + itog);
    e++;
    System.out.println("Инкремент: " + e);
    e--;
    System.out.println("Динкремент: " + e);
    e = e + 5;
    System.out.println("Динкремент: " + e);
    e += 5;
    System.out.println("Динкремент: " + e);
    int r = 8;
    int ostatok = r / 3;
    System.out.println("Остаток от деления: " + ostatok);
    }
 
   
}
