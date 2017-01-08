/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sanmyo.cursojavabasico.aula17;

/**
 *
 * @author sanmyo
 */
public class Exercicio04 {
    public static void main(String[] args) {
        //Scanner leia = new Scanner(System.in);
        
        //pais a = 80000 + 3% ano 
        //pais b = 200000 + 1,5% ano
        double popA = 80000;
        double popB = 200000;
        int ano = 0;
        while (popA < popB) {
            popA = popA + (popA * 0.03);
            popB = popB + (popB * 0.015);
            ano++;
        }
        
        System.out.println("População A : " + popA);
        System.out.println("População B : " + popB);
        
        System.out.println(ano);
    }
}