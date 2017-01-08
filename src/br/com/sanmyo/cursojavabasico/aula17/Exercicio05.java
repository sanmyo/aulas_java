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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //pais a = 80000 + 3% ano 
        //pais b = 200000 + 1,5% ano
        System.out.println("Digite a população do pais A: ");
        double popA = leia.nextDouble();
        System.out.println("Qual a taxa de crescimento anual do pais A?");
        double taxA = leia.nextDouble();
        System.out.println("Digite a população do país B: ");
        double popB = leia.nextDouble();
        System.out.println("Qual a taxa de crescimento anual do pais B?");
        double taxB = leia.nextDouble();
        int ano = 0;
        while (popA < popB) {
            popA = popA + (popA * (taxA/100));
            popB = popB + (popB * (taxB/100));
            ano++;
        }
        
        System.out.println("População A : " + popA);
        System.out.println("População B : " + popB);
        
        System.out.println(ano);
    }
}