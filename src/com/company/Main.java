package com.company;
import java.util.Scanner;
public class  Main {

    public static void main(String[] args) {
        double summ = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи n: ");
        int n = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введи x");
        int x = scan2.nextInt();
        for (int i = 1; i<n; i++){
            int c = (2*i-1);
            int r = (2*i*(2*i + 1));
            double h = Math.pow(x,(2*i+1));
            double task = ((c*h)/r);
            summ = summ +task;
        }
        System.out.println("Результат");
        System.out.println(x+summ);


    }
}
