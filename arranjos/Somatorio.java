/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.arranjos;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Somatorio {

    public static void main(String[] args) {
        int acumulador=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos valores deseja somar? ");
        int quantidade = entrada.nextInt();
        int numeros[] = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número");
            numeros[i] = entrada.nextInt();
            acumulador+=numeros[i];
            
        }
        
        System.out.println("A soma de todos os valores é "+acumulador);

    }

}
