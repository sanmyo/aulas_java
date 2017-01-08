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
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int i = 1;
        System.out.print("Produto " + i+" : R$ ");
        double val = leia.nextDouble();
        double total = val;
        
        while (val != 0) {
            System.out.print("Produto " + (i+1)+" : R$ ");
            val = leia.nextDouble();
            total += val;
            i++;
        }
        System.out.println("Total : R$ "+total);
        System.out.print("Dinheiro : R$ ");
        double paga = leia.nextDouble();
        
        if (paga == total) {
            System.out.println("Obrigado pela preferencia, volte sempre");
        }else if (paga < total) {
            System.out.println("Desculpe, mas ainda falta dinheiro para o seu pagamento");
            System.out.println("Falta : R$ "+(total-paga));
            System.out.print("Pague o restante : R$ ");
            double comp = leia.nextDouble();
            paga += comp;
            while (paga < total) {
                System.out.print("Ainda está faltando dinheiro R$ : ");
                comp = leia.nextDouble();
                paga += comp;
            }
            if (paga == total) {
                System.out.println("Obrigado pela preferencia, volte sempre");
            } else {
                System.out.println("Troco : R$ "+(paga-total));
                System.out.println("Obrigado pela preferencia, volte sempre");
            }
        } else if (paga > total) {
            System.out.println("Troco : R$ "+(paga-total));
            System.out.println("Obrigado pela preferencia, volte sempre");
        }
    }
}
