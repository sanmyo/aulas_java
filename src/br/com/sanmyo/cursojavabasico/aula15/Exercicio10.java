/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sanmyo.cursojavabasico.aula15;

import java.util.Scanner;

/**
 *
 * @author sanmyo
 */
public class Exercicio10 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
         System.out.println("Digite M-matutino, V-Vespertino ou n-noturo");
         String turno = leia.next();
        
        if (turno.equalsIgnoreCase("v")) {
            System.out.println("boa tarde");
        } else if (turno.equalsIgnoreCase("m")) {
            System.out.println("bom dia");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("boa noite");
        } else {
            System.out.println("valor invalido");
        }
    }
}
