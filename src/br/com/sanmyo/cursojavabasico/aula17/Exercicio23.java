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
public class Exercicio23 {
    public static void main(String[] args) {
        System.out.println("  Lojas Quase Dois");
        System.out.println(" Qtde         Valor");
        System.out.println("Peças        a Pagar");
        
        for (int i=1; i<=50; i++) {
            System.out.println("  "+i+"     "+(i*1.99));
        }
    }
}