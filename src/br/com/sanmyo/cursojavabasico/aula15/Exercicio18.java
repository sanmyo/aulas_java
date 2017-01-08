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
public class Exercicio18 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um numero para vermos se é impar ou par: ");
        int num = leia.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero ímpar");
        }
    }
}
