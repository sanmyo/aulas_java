package br.com.sanmyo.cursojavabasico.aula13;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("1 - Escreva um programa que mostre a mensagem \"Alo Mundo\" na tela");
        System.out.println("Alô Mundo!");
        
        System.out.println();
        
        System.out.println("2 - Faça um programa que peça um número e então mostre a mensagem: O número informado foi [número]");
        
        
        Scanner leia = new Scanner(System.in);
        
        int numero = leia.nextInt();
        System.out.println("O número digitado foi " + numero);
        
        System.out.println();
        
        System.out.println("3 - Faça um programa que peça dois numeros e imprima a soma");
        int num1, num2;
        System.out.print("Digite o numero 1: ");
        num1 = leia.nextInt();
        System.out.print("Digite o numero 2: ");
        num2 = leia.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos numeros " + num1 + " + " + num2 + "foi igual a " + soma);
        
        System.out.println();
        
        System.out.println("Faça um programa que peça as 4 notas bimestrais e mostre a média");
        double nota1, nota2, nota3, nota4, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = leia.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = leia.nextDouble();        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A media das 4 notas bimestrai foi: " + media);
        
        System.out.println();
        
        System.out.println("5 - Faça um programa que converta metros para centímetros");
        System.out.print("Digite os metros para transformar em centímetos: ");
        double metro;
        metro = leia.nextDouble();
        double centi;
        centi = metro * 100;
        System.out.println("O número " + metro + " em centímetros é: " + centi);
        
        System.out.println();
        
        System.out.println("6 - Faça um programa que peça o raio de círculo, calcule e mostre sua área");
        double raio;
        System.out.print("Digite o raio do círculo para calcular a sua área ");
        raio = leia.nextDouble();
        double area;
        area = 3.14 * (raio * raio);
        //area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo foi calculada e é: " + area + "m²");
        
        System.out.println();
        
        System.out.println("7 - Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro dessa área para o usuário");
        System.out.print("Digite a medida do lado do quadrado: ");
        double lado = leia.nextDouble();
        //double areaQ = lado * lado;
        double areaQ = Math.pow(lado, 2);
        double dobroAreaQ = areaQ * 2;
        System.out.println("A área do quadrado é: " + areaQ + " e o seu dobro é: " + dobroAreaQ);
        
        System.out.println();
        
        System.out.println("8 - Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.");
        System.out.print("Qual o valor da sua hora trabalhada: ");
        double valorHora = leia.nextDouble();
        System.out.print("Quantas horas voce trabalhou nesse mes? ");
        double horaTrab = leia.nextDouble();
        double salario = valorHora * horaTrab;
        System.out.println("O seu salário nesse mes foi de " + salario);
        
        System.out.println();
        
        System.out.println("9 - Faça um programa que peça a temperatura em graus"
                + "Farenheit, transforme e mostre a temperatura em graus Celsius");
        System.out.println("Digite a temperatura em Farenheit");
        double tempFar = leia.nextDouble();
        double tempCel = (5 * (tempFar - 32) / 9);
        double tempCel1 = (tempFar - 32) / 1.8;
        System.out.println("A temperatura de " + tempFar + " graus Farenheit"
                + " tranformada em " + tempCel + " graus Celsius");
        
        System.out.println();
        
        System.out.println("10 - Faça um programa que peça a temperatura em graus Celsius "
                + "transforme e mostre em farenheit");
        System.out.print("Digite o valor da temperatura em Celsius ");
        double celsius = leia.nextDouble();
        double farenheit = (celsius * 1.8) + 32;
        double farenheit1 = 32 + (9 * celsius / 5);
        System.out.println("A temperatura de " + celsius + "ºC transformada em "
                + farenheit + "ºF");
        
        System.out.println();
        
        System.out.println("11 - Faça um programa que peça 2 números inteiros e um numero real.");
        System.out.println("Calcule e mostre:");
        System.out.println("a. O produto do dobro do primeiro com a metade do segundo");
        System.out.println("b. A soma do triplo do primeiro com o terceiro");
        System.out.println("c. O terceiro elevado ao cubo");
        System.out.print("Digite o primeiro numero inteiro: ");
        int pri = leia.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        int seg = leia.nextInt();
        System.out.print("Digite o terceiro numero real: ");
        double ter = leia.nextDouble();
        System.out.println("Resposta do item a: " + ((pri * 2)+(seg/2)));
        System.out.println("Resposta do item b: " + ((pri * 3)+ter));
        System.out.println("Resposta do item c: " + (Math.pow(ter, 3)));
        
        System.out.println();
        
        System.out.println("12 - Tendo como dados de entrada a altura de uma"
                + "pessoa, construa um algoritmo que calcule seu peso ideal"
                + ", usando a seguinte fórmula (72,7*altura)-58");
        System.out.print("Digite a sua altura para vermos qual o seu peso ideal: ");
        double altura = leia.nextDouble();
        System.out.println("O peso ideal para sua altura será " + ((72.7*altura)-58));
        
        System.out.println();
        
        System.out.println("Faça um programa que pergunte quanto você ganha por"
                + "hora e o número de horas trabalhadas por mês. Calcule e mostre"
                + "o total do seu salário no referido mês, sabendo-se que são "
                + "descontados 11% para o Imposto de renda, 8% para o INSS e 5%"
                + "para o sindicato, faça um programa que nos dê:");
        System.out.println("a. salário bruto");
        System.out.println("b. quanto pagou ao INSS");
        System.out.println("c. quanto pagou ao sindicato");
        System.out.println("d. calcule os decontos e o salário líquido, conforme"
                + "a tabela abaixo");
        System.out.println("+ Salario Bruto : R$ - IR(11%) : R$ - INSS(8%)"
                + " : R$ - Sindicato(5%) : R$ = Salário Liquido : R$");
        System.out.print("Digite o quanto você ganha por hora: ");
        double valor = leia.nextDouble();
        System.out.print("Digite quantos horas vocês trabalhou nesse mes: ");
        double horas = leia.nextDouble();
        double salarioBruto = valor * horas;
        double IR = salarioBruto * 0.11;
        double INSS = salarioBruto * 0.08;
        double Sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - IR - INSS - Sindicato;
        System.out.println("Salário Bruto " + salarioBruto);
        System.out.println("IR " + IR);
        System.out.println("INSS " + INSS);
        System.out.println("Sindicato " + Sindicato);
        System.out.println("Salario Liquido " + salarioLiquido);
        
        System.out.println();
        
        System.out.println("14 - Faça um programa que peça o tamanho de um "
                + "arquivo para download(em MB) e a velocidade de um link "
                + "de internet(em Mbps), calcule e informe o tempo aproximado"
                + "de download do arquivo usando este link(em minutos)");
        System.out.print("Qual o tamanho do arquivo? ");
        int arquivo = leia.nextInt();
        System.out.print("Qual a velocidade do seu link de internet? ");
        int link = leia.nextInt();
        double tempo = arquivo / link;
        System.out.println(tempo);
        
    }   
}