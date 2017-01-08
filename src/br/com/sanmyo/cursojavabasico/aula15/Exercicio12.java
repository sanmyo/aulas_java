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
public class Exercicio12 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu valor da sua hora de trabalho");
        double valorHoras = leia.nextDouble();
        
        System.out.println("Digite quantas horas trabalhou nesse mes");
        double QtdHoras = leia.nextDouble();
        
        double ir, sindicato, inss,fgts, salario;
        
        salario = valorHoras * QtdHoras;
        
        if (salario <= 900) {
            ir = 0;
            sindicato = salario * 0.03;
            inss = salario * 0.10;
            fgts = salario * 0.11;
            System.out.println("Salário bruto (" + valorHoras + " * " + QtdHoras + ") : R$ " + salario);
            System.out.println("(-) IR (0%)                 : R$ " + ir);
            System.out.println("(-) InSS (10%)              : R$ " + inss);
            System.out.println("FGTS (11%)                  : R$ " + fgts);
            System.out.println("Total de Descontos          : R$ " + (ir + inss));
            System.out.println("Salario Liquido             : R$ " + (salario - (ir + inss)));
        } else if (salario <= 1500) {
            ir = salario * 0.05;
            sindicato = salario * 0.03;
            inss = salario * 0.10;
            fgts = salario * 0.11;
            System.out.println("Salário bruto (" + valorHoras + " * " + QtdHoras + ") : R$ " + salario);
            System.out.println("(-) IR (5%)                 : R$ " + ir);
            System.out.println("(-) InSS (10%)              : R$ " + inss);
            System.out.println("FGTS (11%)                  : R$ " + fgts);
            System.out.println("Total de Descontos          : R$ " + (ir + inss));
            System.out.println("Salario Liquido             : R$ " + (salario - (ir + inss)));
        } else if (salario <= 2500) {
            ir = salario * 0.10;
            sindicato = salario * 0.03;
            inss = salario * 0.10;
            fgts = salario * 0.11;
            System.out.println("Salário bruto (" + valorHoras + " * " + QtdHoras + ") : R$ " + salario);
            System.out.println("(-) IR (10%)                : R$ " + ir);
            System.out.println("(-) InSS (10%)              : R$ " + inss);
            System.out.println("FGTS (11%)                  : R$ " + fgts);
            System.out.println("Total de Descontos          : R$ " + (ir + inss));
            System.out.println("Salario Liquido             : R$ " + (salario - (ir + inss)));
        } else if (salario > 2500) {
            ir = salario * 0.15;
            sindicato = salario * 0.03;
            inss = salario * 0.10;
            fgts = salario * 0.11;
            System.out.println("Salário bruto (" + valorHoras + " * " + QtdHoras + ") : R$ " + salario);
            System.out.println("(-) IR (15%)                : R$ " + ir);
            System.out.println("(-) InSS (10%)              : R$ " + inss);
            System.out.println("FGTS (11%)                  : R$ " + fgts);
            System.out.println("Total de Descontos          : R$ " + (ir + inss));
            System.out.println("Salario Liquido             : R$ " + (salario - (ir + inss)));
        } 
    }
}