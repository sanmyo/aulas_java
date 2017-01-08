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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o nome do usuário");
        String nome = leia.next();
        
        System.out.println("Digite a senha do usuário, lembre-se que a senha não"
                + " pode ser igual ao nome do usuário");
        String senha = leia.next();
        
        while (nome.equalsIgnoreCase(senha)) {
            System.out.println("Digite ums senha diferente do nome");
            
            senha = leia.next();
        }
    }
}
