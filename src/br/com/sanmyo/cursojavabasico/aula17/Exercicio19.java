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
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("QUantas notas voce vai informar? ");
        int tot = leia.nextInt();
        double nota;
        double med = 0;
        for (int i=0; i< tot; i++) {
            System.out.println("Digite a nota n " + (i+1));
            nota = leia.nextDouble();
            med += nota;
        }
        
        System.out.println("A media é : " + (med/tot));
    }
}