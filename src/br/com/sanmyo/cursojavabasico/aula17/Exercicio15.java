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
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o último termo da série de fibonacci: ");
        int num = leia.nextInt();
        int atu = 1;
        int pro = 1;
        int ant = 0;
        
        for (int i = 1 ; i < num ; i++) {
            System.out.print(pro + " ");
            pro = atu + ant;
            ant = atu;
            atu = pro;
        }
    }
}