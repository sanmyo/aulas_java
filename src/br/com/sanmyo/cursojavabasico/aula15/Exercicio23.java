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
public class Exercicio23 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a carne você deseja"
                + "\nLemre-se que você só pode escolher um tipo de carne"
                + "\n\n- (1) Filé Duplo"
                + "\n- (2) Alcatra"
                + "\n- (3) Picanha"
                + "\n");
        
        System.out.print("Escolha pelo numero: ");
        int tipo = leia.nextInt();
        String carne = "";
        double preco = 0;
        double totPre = 0;
        int qtde = 0;
                
        if (tipo == 1) {
            System.out.print("Quantos quilos você quer: ");
            carne = "Filé Duplo";
            qtde = leia.nextInt();
            if (qtde < 4.9) {
                preco = 4.9;
                totPre = qtde * preco;
            } else {
                preco = 5.8;
                totPre = qtde * preco;
            }
        } else if (tipo == 2) {
            carne = "Alcatra";
            System.out.print("Quantos quilos você quer: ");
            qtde = leia.nextInt();
            if (qtde < 5.9) {
                preco = 5.9;
                totPre = qtde * preco;
            } else {
                preco = 6.8;
                totPre = qtde * preco;
            }
        } else if (tipo == 3) {
            carne = "Picanha";
            System.out.print("Quantos quilos você quer: ");
            qtde = leia.nextInt();
            if (qtde < 6.9) {
                preco = 4.9;
                totPre = qtde * preco;
            } else {
                preco = 7.8;
                totPre = qtde * preco;
            }
        } else {
            System.out.println("Opção Errada");
        }
        
        System.out.println("Escolha o tipo de pagamento"
                + "\n1 - Dinheiro"
                + "\n2 - Cartão");
        
        int pag = leia.nextInt();
        
        switch (pag) {
            case 1:
                System.out.println(""
                        + "          CUPOM FISCAL          "
                        + "\n"
                        + "\n"
                        + "Qtde     tipo       Vl Kg      Vl Total"
                        + "\n " + qtde + "   " + carne + "     " + preco + "         " + totPre
                        + "\n"
                        + "\nPagamento em dinheiro s/ desconto...");
                break;
            case 2:
                System.out.println(""
                        + "          CUPOM FISCAL          "
                        + "\n"
                        + "\n"
                        + "Qtde     tipo       Vl Kg      Vl Total"
                        + "\n " + qtde + "   " + carne + "     " + preco + "         " + totPre
                        + "\n"
                        + "\nPagamento com Cartão"
                        + "\n"
                        + "\nDesconto        " + (totPre*0.1)
                        + "\n"
                        + "\nTotal à Pagar : " + (totPre-(totPre*0.1)));
                break;
            default:
                break;
        }
    }
}