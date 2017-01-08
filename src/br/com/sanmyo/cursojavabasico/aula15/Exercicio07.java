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
public class Exercicio07 {
   public static void main (String[] args) {
       Scanner leia = new Scanner(System.in);
       
       System.out.print("Digite o primeiro numero ");
       int num1 = leia.nextInt();
       System.out.print("Digite o segundo numero ");
       int num2 = leia.nextInt();
       System.out.print("Digite o terceiro numero ");
       int num3 = leia.nextInt();
       
       int menor, maior;
       
       if (num1 < num2) {
           menor = num1;
           maior = num2;
       } else {
           menor = num2;
           maior = num1;
       }
       
       if (maior < num3) {
           maior = num3;
       } else if (menor > num3){
           menor = num3;
       }
       
       System.out.println("maior" + maior);
       System.out.println("manor" + menor);
   }
}