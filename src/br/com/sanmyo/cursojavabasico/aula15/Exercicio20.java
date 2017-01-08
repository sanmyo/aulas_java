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
public class Exercicio20 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        
        
        System.out.println("Voce telefonou para a vitima");
        String tel = leia.next();
        int sus=0;
        while (!tel.equalsIgnoreCase("sim") && !tel.equalsIgnoreCase("nao")) {
            System.out.println("Digite apenas sim ou nao");
            tel = leia.next();
        }
        if (tel.equalsIgnoreCase("sim")) {
            sus++;
        }
        
        System.out.println("Esteve no local do crime");
        String loc = leia.next();
        while (!loc.equalsIgnoreCase("sim") && !loc.equalsIgnoreCase("nao")) {
            System.out.println("Digite apenas sim ou nao");
            loc = leia.next();
        }
        if (loc.equalsIgnoreCase("sim")) {
            sus++;
        }
        
        System.out.println("Mora perto da vitima");
        String mor = leia.next();
        while (!mor.equalsIgnoreCase("sim") && !mor.equalsIgnoreCase("nao")) {
            System.out.println("Digite apenas sim ou nao");
            mor = leia.next();
        }
        if (mor.equalsIgnoreCase("sim")) {
            sus++;
        }
        
        System.out.println("Devia para a vitima");
        String dev = leia.next();
        while (!dev.equalsIgnoreCase("sim") && !dev.equalsIgnoreCase("nao")) {
            System.out.println("Digite apenas sim ou nao");
            dev = leia.next();
        }
        if (dev.equalsIgnoreCase("sim")) {
            sus++;
        }
        
        System.out.println("Ja trabalhou com a vitima");
        String tra = leia.next();
        while (!tra.equalsIgnoreCase("sim") && !tra.equalsIgnoreCase("nao")) {
            System.out.println("Digite apenas sim ou nao");
            tra = leia.next();
        }
        if (tra.equalsIgnoreCase("sim")) {
            sus++;
        }
        
        switch(sus) {
            case 1:
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}