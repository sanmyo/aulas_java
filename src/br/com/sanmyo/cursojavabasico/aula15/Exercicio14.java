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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua nota 1");
        double num1 = leia.nextDouble();
        System.out.println("Digite sua nota 2");
        double num2 = leia.nextDouble();
        
        double media = (num1+num2)/2;
        if ((media > 9) && (media <=10)) {
            System.out.println("nota 1    : " + num1);
            System.out.println("nota 2    : " + num2);
            System.out.println("A media   : " + media);
            System.out.println("Conceito  : a");
            System.out.println("      APROVADO");
        } else if ((media > 7.5) && (media <=9)) {
            System.out.println("nota 1    : " + num1);
            System.out.println("nota 2    : " + num2);
            System.out.println("A media   : " + media);
            System.out.println("Conceito  : b");
            System.out.println("      APROVADO");
        } else if ((media > 6) && (media <=7.5)) {
            System.out.println("nota 1    : " + num1);
            System.out.println("nota 2    : " + num2);
            System.out.println("A media   : " + media);
            System.out.println("Conceito  : c");
            System.out.println("      APROVADO");
        } else if ((media > 4) && (media <=6)) {
            System.out.println("nota 1    : " + num1);
            System.out.println("nota 2    : " + num2);
            System.out.println("A media   : " + media);
            System.out.println("Conceito  : d");
            System.out.println("     REPROVADO");
        } else if ((media >= 0) && (media <=4)) {
            System.out.println("nota 1    : " + num1);
            System.out.println("nota 2    : " + num2);
            System.out.println("A media   : " + media);
            System.out.println("Conceito  : e");
            System.out.println("     REPROVADO");
        }
    }
}