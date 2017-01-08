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
public class Exercicio19 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("O que você quer fazer"
                + "\n P - numero par ou impar"
                + "\n A - positivo ou negativo");
        
        String opcao = leia.next();
        
        if (opcao.equalsIgnoreCase("a")) {
            System.out.print("Digite um numero para vermos se é impar ou par: ");
            int num = leia.nextInt();
        
            if (num % 2 == 0) {
                System.out.println("numero par");
            } else {
                System.out.println("numero ímpar");
            }
        } else if (opcao.equalsIgnoreCase("p")){
            System.out.print("Digite um numero para vermos se é negativo ou "
                    + "positivo: ");
            int num = leia.nextInt();
            
            while (num == 0) {
                System.out.print("nao digite o numero 0 ");
                num = leia.nextInt();
            }
            if (num > 0) {
                System.out.println("O numero e positivo");
            } else {
                System.out.println("O numero e negativo");
            }
        } else {
            System.out.println("Opção Inválida!");
        }
    }
}