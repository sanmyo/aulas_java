/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

/**
 *
 * @author sanmyo
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Vamos calcular uma equação do 2 grau");
        System.out.print("Digite o valor de A ");
        int a = leia.nextInt();
        if (a != 0) {
            System.out.print("Digite o valor de b ");
            int b = leia.nextInt();
            System.out.print("Digite o valor de C ");
            int c = leia.nextInt();
            double delta = Math.pow(b,2) - 4 * a * c;
            if (delta > 0) {
                System.out.println("delta : " + delta);
                double x1 = ((-b + Math.sqrt(delta))/(2*a));
                double x2 = ((-b - Math.sqrt(delta))/(2*a));
                System.out.println();
                System.out.println("Delta maior que Zero");
                System.out.println("Apenas 2 raizes reais");
                System.out.println();
                System.out.println("x1 : " + x1);
                System.out.println("x2 : " + x2);
                System.out.println();
                System.out.println("Programa Encerrado!");
                //double x = (-b + Math.sqrt(delta))/2 * a;
            } else if (delta == 0){
                System.out.println("delta : " + delta);
                double x1 = ((-b + Math.sqrt(delta))/(2*a));
                System.out.println();
                System.out.println("Delta igual a Zero");
                System.out.println("Apenas 1 raiz real");
                System.out.println();
                System.out.println("x1 : " + x1);
                System.out.println();
                System.out.println("Programa Encerrado!");
            } else {
                System.out.println("delta : " + delta);
                System.out.println();
                System.out.println("Delta menor que Zero");
                System.out.println("não possui raizes reais");
                System.out.println("Programa Encerrado!");
            }
        } else {
            System.out.println();
            System.out.println("Programa Encerrado!");
        }
    }
}
