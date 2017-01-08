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
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero, para calcularmos a fatorial: ");
        int num = leia.nextInt();
        System.out.print(num+"! = " + num);
        int total = num;
        num--;
        while (num > 0) {
            System.out.print(" x " + (num));
            total *= num;
            num--;
        }
        System.out.print(" = " + total);
    }
}