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
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Calculando o Fatorial, digite um numero: ");
        int num = leia.nextInt();
        
        for (int i = num-1 ; i > 1 ; i--) {
            num = num * i;
        }
        System.out.println(num);
    }
}