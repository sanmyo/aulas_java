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
public class Exercicio03 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu nome, o nome de ter mais de 3 letras");
        String nome = leia.next();
        
        while (nome.length()<4) {
            System.out.println("Por favor, o nome deve ter mais de 3 letras");
            nome = leia.next();
        }
        
        System.out.println("Digite sua idade");
        int idade = leia.nextInt();
        
        while ((idade <= 0) || (idade >= 150)){
            System.out.println("Seja consciente, digite sua idade correta");
            idade = leia.nextInt();
        }
        
        System.out.println("QUal o seu salário");
        double sal = leia.nextDouble();
        
        while (sal <= 0) {
            System.out.println("Você não pode ganhar menos de ZERO");
            sal = leia.nextDouble();
        }
        
        System.out.println("Qual o seu sexo (F ou M)?");
        String sex = leia.next();
        
        while (!sex.equalsIgnoreCase("f") && !sex.equalsIgnoreCase("m")) {
            System.out.println("Por favor, digite apenas F ou M");
            sex = leia.next();
        }
        
        System.out.println("Qual seu estado civil? S-Solteiro C-Casado V-Viuvo D-Divorciado");
        String estado = leia.next();
        
        while (!estado.equalsIgnoreCase("s") && !estado.equalsIgnoreCase("c") && !estado.equalsIgnoreCase("v") && !estado.equalsIgnoreCase("d")) {
            System.out.println("Apenas S, C, V ou D");
            estado = leia.next();
        }
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sal);
        System.out.println(sex);
        System.out.println(estado);
                
    }
}