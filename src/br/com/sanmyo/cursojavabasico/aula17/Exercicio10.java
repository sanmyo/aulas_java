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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o inicio");
        int ini = leia.nextInt();
        System.out.println("Digite o final");
        int fim = leia.nextInt();
        
        while (ini <= fim) {
            System.out.println(ini);
            ini++;
        }
        
        
    }
}