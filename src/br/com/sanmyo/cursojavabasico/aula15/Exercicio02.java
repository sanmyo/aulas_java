
package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            System.out.print("Digite um numero para vermos se é negativo ou"
                    + "positivo: ");
            int num = leia.nextInt();
            
            while (num == 0) {
                System.out.print("nao digite o numero 0 ");
                num = leia.nextInt();
            }
            if (num > 0) {
                System.out.println("O numero e positivo");
            } else {
                System.out.println("O numero e negativo");
            }
        }
}