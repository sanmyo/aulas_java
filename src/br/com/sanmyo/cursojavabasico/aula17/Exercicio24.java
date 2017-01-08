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
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Valor do pão: R$ ");
        double valor = leia.nextDouble();
        
        System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
        for (int i=1; i<=50; i++) {
            System.out.println(i+" = "+ (i*valor));
        }
    }
}