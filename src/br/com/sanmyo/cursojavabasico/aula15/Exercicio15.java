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
public class Exercicio15 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o lado 1 do triangulo");
        int lado1= leia.nextInt();
        System.out.print("Digite o lado 2 do triangulo");
        int lado2 = leia.nextInt();
        System.out.print("Digite o lado 3 do triangulo");
        int lado3 = leia.nextInt();
        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
            if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
                System.out.print("triangulo equilatero");
            } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                System.out.print("triangulo isoceles");
            } else {
                System.out.print("triangulo escaleno");
            }
        } else {
            System.out.print("nao formam um triangulo");
        }
    }
}