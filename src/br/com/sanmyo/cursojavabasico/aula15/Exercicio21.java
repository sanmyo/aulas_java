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
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Alcool"
                + "\na. Até 20 litros, desconto de 3% por litro"
                + "\nb. Acima de 20 litros, desconto de 5% por litro"
                + "\n"
                + "\nGasolina"
                + "\nc. Até 20 litros, desconto de 4% por litro"
                + "\nd. Acima de 20 litros, desconto de 6% por litro"
                + "\n"
                + "\nA-Alcool ou G-Gasolina (utilize apenas a primeira letra");
        String com = leia.next();
        if (com.equalsIgnoreCase("a")) {
            System.out.println("Quantos litros de alcool comprou");
            int litros = leia.nextInt();
            double prAlc = 1.9;
            if (litros < 20) {
                double desc = (litros * prAlc)*0.03;
                double valFi = (litros * prAlc) - desc;
                System.out.println(""
                        + "Você comprou " + litros + " litros de ALCOOL à " + prAlc + ""
                        + "\nvoce deveria pagar     : " + (litros * prAlc) + ""
                        + "\nvoce vai pagar         : " + valFi + ""
                        + "\nteve um desconto de 3% : " + desc);
            } else {
                double desc = (litros * prAlc)*0.05;
                double valFi = (litros * prAlc) - desc;
                System.out.println(""
                        + "Você comprou " + litros + " litros de ALCOOL à " + prAlc + ""
                        + "\nvoce deveria pagar     : " + (litros * prAlc) + ""
                        + "\nvoce vai pagar         : " + valFi + ""
                        + "\nteve um desconto de 5% : " + desc);
            }
        } else if (com.equalsIgnoreCase("g")) {
            System.out.println("Quantos litros de gasolina comprou");
            int litros = leia.nextInt();
            double prGas = 2.5;
            if (litros < 20) {
                double desc = (litros * prGas)*0.04;
                double valFi = (litros * prGas) - desc;
                System.out.println(""
                        + "Você comprou " + litros + " litros de Gasolina à " + prGas + ""
                        + "\nvoce deveria pagar     : " + (litros * prGas) + ""
                        + "\nvoce vai pagar         : " + valFi + ""
                        + "\nteve um desconto de 4% : " + desc);
            } else {
                double desc = (litros * prGas)*0.06;
                double valFi = (litros * prGas) - desc;
                System.out.println(""
                        + "Você comprou " + litros + " litros de Gasolina à " + prGas + ""
                        + "\nvoce deveria pagar     : " + (litros * prGas) + ""
                        + "\nvoce vai pagar         : " + valFi + ""
                        + "\nteve um desconto de 6% : " + desc);
            }
        } else {
            System.out.println("Opção Invalida!");
        }
    }
}
