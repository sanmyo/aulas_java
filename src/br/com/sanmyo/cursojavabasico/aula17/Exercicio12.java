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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero para construirmos uma tabela: ");
        int num = leia.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(i + " x " + num + " = " + (i*num));
        }
    }
}