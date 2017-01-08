package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

public class Exercicio03 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            
            System.out.print("Digite F ou M, para vermos o sexo: ");
            
            String sexo = leia.next();
            
            while ((!sexo.equalsIgnoreCase("m")) && (!sexo.equalsIgnoreCase("f"))) {
                System.out.print("Só aceitamos F ou M: ");
                sexo = leia.next();
            }
            
            if (sexo.equalsIgnoreCase("f")) {
                System.out.println("Feminino");
            } else if (sexo.equalsIgnoreCase("m")) {
                System.out.println("Masculino");
            }
        }
}