package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

public class Exercicio05 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            
            double nota1, nota2, nota3, nota4, media;
            
            System.out.println("Digite as 4 notas do aluno");
            System.out.print("Digite a primeira nota: ");
            nota1 = leia.nextDouble();
            System.out.print("Digite a segunda nota: ");
            nota2 = leia.nextDouble();
            System.out.print("Digite a terceira nota: ");
            nota3 = leia.nextDouble();
            System.out.print("Digite a quarta nota: ");
            nota4 = leia.nextDouble();
            
            media = (nota1+nota2+nota3+nota4)/4;
            if ((media >= 7) && (media < 10)) {
                System.out.println("Sua media foi " + media + "\nVocê está Aprovado");
            } else if (media < 7) {
                System.out.println("Sua media foi " + media + "\nVocê está Reprovado");
            } else {
                System.out.println("Sua media foi " + media + "\nVocê está Aprovado com Louvor");
            }
        }
}