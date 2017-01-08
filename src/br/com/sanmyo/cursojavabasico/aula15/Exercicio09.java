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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o numero 1: ");
        int num1 = leia.nextInt();
        
        System.out.print("Digite o numero 2: ");
        int num2 = leia.nextInt();
        
        System.out.print("Digite o numero 3: ");
        int num3 = leia.nextInt();
        
        int maior,menor,meio;
        
        if ((num1>num2)&&(num1>num3)) {
            maior = num1;
            if (num2>num3) {
                menor = num3;
                meio = num2;
            } else {
                menor = num2;
                meio = num3;
            }
        } else if ((num2>num1)&&(num2>num3)){
            maior = num2;
            if (num1>num3) {
                menor = num3;
                meio = num1;
            } else {
                menor = num1;
                meio = num3;
            }
        } else {
            maior = num3;
            if (num1>num2) {
                menor = num2;
                meio = num1;
            } else {
                menor = num1;
                meio = num2;
            }
        }
        
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }
}
