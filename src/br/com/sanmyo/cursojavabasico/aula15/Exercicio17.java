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
public class Exercicio17 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um ano : ");
        int ano = leia.nextInt();
        
        if (ano % 4 == 0) {
            System.out.println("esse ano é bissexto");
        } else {
            System.out.println("esse ano não é bissexto");
        }
    }
}
