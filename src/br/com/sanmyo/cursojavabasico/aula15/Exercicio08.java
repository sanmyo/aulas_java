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
public class Exercicio08 {
       public static void main (String[] args) {
            Scanner leia = new Scanner(System.in);
            
            System.out.println("Digite o preço do item 1 ");
            double preco1 = leia.nextDouble();
            System.out.println("Digite o preço do item 2 ");
            double preco2 = leia.nextDouble();
            System.out.println("Digite o preço do item 3 ");
            double preco3 = leia.nextDouble();
            
            if ((preco1 < preco2) && (preco1 < preco3)) {
                System.out.println("Menor preço " + preco1);
            } else if ((preco1 > preco2) && (preco2 < preco3)) {
                System.out.println("Menor preço " + preco2);
            } else {
                System.out.println("Menor preço " + preco3);
            }
       }
}