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
public class Exercicio06 {
   public static void main (String[] args) {
       Scanner leia = new Scanner(System.in);
       
       int num1,num2,num3;
       System.out.print("Digite o primeiro numero ");
       num1 = leia.nextInt();
       System.out.print("Digite o segundo numero ");
       num2 = leia.nextInt();
       System.out.print("Digite o terceiro numero ");
       num3 = leia.nextInt();
       
       if ((num1 > num2) && (num1 > num3)) {
           System.out.println("O maior numero foi: " + num1);
       } else if ((num1 < num2) && (num3 < num2)) {
           System.out.println("O maior numero foi: " + num2);
       } else {
           System.out.println("O maior numero foi: " + num3);
       }
   }
}