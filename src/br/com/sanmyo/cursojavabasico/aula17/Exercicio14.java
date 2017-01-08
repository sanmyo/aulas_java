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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int num,par,impar;
        par = 0;
        impar = 0;
        for (int i=0; i< 10; i++) {
            System.out.print("Digite o numero " + (i+1) + " : ");
            num = leia.nextInt();
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        
        System.out.println("Numeros pares " + par);
        System.out.println("Numeros impares " + impar);
    }
}