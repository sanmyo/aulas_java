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
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Quantos kg de morango vc quer ");
        int mor = leia.nextInt();
        System.out.print("Quantos kg de maçã vc quer ");
        int mac = leia.nextInt();
        
        double totMor, totMac, desc;
        
        if (mor < 5) {
            totMor = mor * 2.5;
        } else {
            totMor = mor * 2.2;
        }
        
        if (mac < 5) {
            totMac = mac * 2.2;
        } else {
            totMac = mac * 1.5;
        }
        
        if ((mor + mac > 8 ) || (totMac + totMor > 25)) {
            desc = (totMor + totMac)*0.1;
            System.out.println("Voce comprou " + mor + "kg de morango "
                    + "\nVoce paga R$ " + totMor
                    + "\nVoce comprou " + mac + "kg de mac "
                    + "\nVoce paga R$ " + totMac
                    + "\nDesconto de R$ " + desc
                    + "\nValor Total R$ " + (totMor + totMac - desc));
        } else {
            System.out.println("Voce comprou " + mor + "kg de morango "
                    + "\nVoce paga R$ " + totMor
                    + "\nVoce comprou " + mac + "kg de maçã "
                    + "\nVoce paga R$ " + totMac
                    + "\nDesconto de R$ 0.00"
                    + "\nValor Total R$ " + (totMor + totMac));
        }
    }
}