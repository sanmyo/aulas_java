package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            
            System.out.println("Digite uma letra, para vermos se é vogal ou consoante: ");
            
            String letra = leia.next();
            
            String letraMin = letra.toLowerCase();
            
            switch (letraMin) {
                case "a":
                    System.out.println("Vogal");
                    break;
                case "e":
                    System.out.println("Vogal");
                    break;
                case "i":
                    System.out.println("Vogal");
                    break;
                case "o":
                    System.out.println("Vogal");
                    break;
                case "u":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
                    break;
            }
        }
}