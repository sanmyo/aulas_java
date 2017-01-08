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
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu salário");
        double salario = leia.nextDouble();
        double salarionovo;
        if (salario <= 280) {
            salarionovo = salario + (salario * 0.2);
            System.out.println("Salario atual: " + salario);
            System.out.println("Aumento de: " + (salario * 0.2) + " (20%)");
            System.out.println("novo salario: " + salarionovo);
        } else if ((salario > 280) && (salario <= 700)) {
            salarionovo = salario + (salario * 0.15);
            System.out.println("Salario atual: " + salario);
            System.out.println("Aumento de: " + (salario * 0.15) + " (15%)");
            System.out.println("novo salario: " + salarionovo);
        } else if ((salario > 700) && (salario <= 1500)) {
            salarionovo = salario + (salario * 0.10);
            System.out.println("Salario atual: " + salario);
            System.out.println("Aumento de: " + (salario * 0.10) + " (10%)");
            System.out.println("novo salario: " + salarionovo);
        } else {
            salarionovo = salario + (salario * 0.05);
            System.out.println("Salario atual: " + salario);
            System.out.println("Aumento de: " + (salario * 0.05) + " (5%)");
            System.out.println("novo salario: " + salarionovo);
        }
    }
}