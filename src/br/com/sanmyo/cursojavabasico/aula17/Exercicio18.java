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
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero ");
        int num = leia.nextInt();
        int pri = 0;
        for (int i=1; i <=num ; i++) {
            if ( num % i == 0) {
                pri++;
            }
        }
        if (pri > 2) {
            System.out.println("O numero digitado não é primo");
        } else {
            System.out.println("O numero digitado é primo");
        }
    }
}