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
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int cont = 1;
        int num;
        
        System.out.println("Digite um numero:");
        int maior = leia.nextInt();
        while (cont < 5) {
            System.out.println("Digite um numero");
            num = leia.nextInt();
            if (num > maior) {
                maior = num;
            }
            cont++;
        }
        
        System.out.println("O maior numero digitado foi " + maior);
    }
}