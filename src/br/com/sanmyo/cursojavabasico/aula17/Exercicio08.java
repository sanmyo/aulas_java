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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int num;
        int cont = 0;
        int total = 0;
        while (cont < 5) {
            System.out.println("Digite um numero");
            num = leia.nextInt();
            total = total + num;
            cont++;
        }
        
        System.out.println("A soma é " + total);
        System.out.println("A média é " + (total/5));
    }
}