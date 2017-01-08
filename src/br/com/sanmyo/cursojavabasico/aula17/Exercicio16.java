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
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int atu = 1;
        int pro = 1;
        int ant = 0;
        
        for (int i = 1 ; pro < 500 ; i++) {
            System.out.print(pro + " ");
            pro = atu + ant;
            ant = atu;
            atu = pro;
        }
    }
}