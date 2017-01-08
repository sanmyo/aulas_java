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
public class Exercicio09 {
    public static void main(String[] args) {
        int num = 1;
        
        while (num<=50) {
            if (num % 2 > 0) {
                System.out.println(num);    
            }
            num++;
        }
    }
}