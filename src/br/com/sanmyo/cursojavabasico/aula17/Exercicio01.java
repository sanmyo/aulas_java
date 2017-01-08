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
public class Exercicio01 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite uma nota, entre zero (0) e dez (10)");
        
        int nota = leia.nextInt();
        
        while ((nota < 0) || (nota > 10)) {
            System.out.println("Digite de 0 a 10, nem menor nem maior");
            nota = leia.nextInt();
        }
        
        System.out.println("A nota digitada foi: " + nota);
    }
}