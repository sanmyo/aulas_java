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
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de turmas: ");
        int turmas = leia.nextInt();
        int alunos;
        int totalAlunos=0;
        
        for (int i = 0; i<turmas ; i++) {
            System.out.println("Digite a quantidade de alunos da turma " + (i+1));
            alunos = leia.nextInt();
            if (alunos > 40) {
                System.out.println("No maximo 40 alunos por turma");
                alunos = leia.nextInt();
            }
            totalAlunos += alunos;
        }
        
        System.out.println("Temos "+turmas+" turmas com uma media de "+(totalAlunos/turmas) + " alunos por turma");
        
    }
}