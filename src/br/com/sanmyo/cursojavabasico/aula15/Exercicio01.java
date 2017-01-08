
package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

public class Exercicio01 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            
            int num1, num2;
            
            System.out.print("Digite o primeiro numero: ");
            num1 = leia.nextInt();
            System.out.print("Digite o primeiro numero: ");
            num2 = leia.nextInt();
            
            while (num1 == num2) {
                System.out.print("Voce digitou o segundo numero igual ao "
                        + "primeiro, digite novamete o segundo numero ");
                num2 = leia.nextInt();
            }
            
            if (num1 < num2) {
                System.out.println("O maior numero é " + num2);
            } else {
                System.out.println("O maior numero é " + num1);
            }
        }
}