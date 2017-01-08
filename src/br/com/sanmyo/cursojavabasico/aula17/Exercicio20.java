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
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("QUantas pessoas: ");
        int tot = leia.nextInt();
        double idade;
        double total=0;
        for (int i = 0; i< tot ; i++) {
            System.out.print("Digite sua idade");
            idade = leia.nextDouble();
            total += idade;
        }
        if ((total/tot >= 0) && (total/tot <= 25)) {
            System.out.println("A turma é jovem!");
        } else if ((total/tot >=26) && (total/tot <=60)) {
            System.out.println("A turma é adulta");
        } else {
            System.out.println("A turma é velha");
        }
    }
}