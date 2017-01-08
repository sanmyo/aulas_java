/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sanmyo.cursojavabasico.aula17;

import java.util.Scanner;

/**
 *
 * @author sanmyo
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int num1 = leia.nextInt();
        System.out.println("Digite outro numero");
        int num2 = leia.nextInt();
        
        int soma = 0;
        
        for (int i=num1; i<=num2; i++) {
            soma = soma + i;
        }
        System.out.println("A soma: " + soma);
    }
}