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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Vamos calcula as potencias");
        System.out.println("Digite a base: ");
        int num1 = leia.nextInt();
        System.out.println("Digite o expoente: ");
        int num2 = leia.nextInt();
        int res = 1;
        
        for (int i = 0 ; i < num2 ; i++) {
            res = res * num1;
        }
        System.out.println("Resultado " + res);
    }
}