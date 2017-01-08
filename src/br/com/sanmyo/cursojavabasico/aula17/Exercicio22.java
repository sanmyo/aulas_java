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
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de CD da sua coleção");
        int qtdeCD = leia.nextInt();
        double valCD;
        double totValCD = 0;
        
        for (int i=0;i<qtdeCD;i++) {
            System.out.println("Digite o valor de compra do CD " + (i+1));
            valCD = leia.nextDouble();
            totValCD += valCD;
        }
        
        System.out.println("Eu tenho "+qtdeCD+" de CDs na minha coleção,"
                + "gastei em média R$ "+(totValCD/qtdeCD) + " por CD");
    }
}