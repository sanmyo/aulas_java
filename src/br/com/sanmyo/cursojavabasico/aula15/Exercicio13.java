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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        
        int dia = leia.nextInt();
        
        switch (dia){
            case 1:
                System.out.print("1 - Domingo");
                break;
            case 2:
                System.out.print("2 - Segunda");
                break;
            case 3:
                System.out.print("3 - Terça");
                break;
            case 4:
                System.out.print("4 - Quarta");
                break;
            case 5:
                System.out.print("5 - Quinta");
                break;
            case 6:
                System.out.print("6 - Sexta");
                break;
            case 7:
                System.out.print("7 - Sabado");
                break;
            default:
                System.out.print("Valor Inválido");
                break;
        }
    }
}
