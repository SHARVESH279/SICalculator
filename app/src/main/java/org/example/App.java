package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("SIMPLE INTEREST CALCULATOR\n");
        double P,r,t;
        System.out.print("Enter principal amount: ");
        P = 1000;
        //P = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        r = 10;
        //r = sc.nextDouble();
        System.out.print("Enter time period: ");
        t = 3;
        //t = sc.nextDouble();
        double si = (P*r*t)/100;
        System.out.format("Simple Interest = %.2f", si);
        sc.close();
    }
}