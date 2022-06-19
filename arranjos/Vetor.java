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
public class Vetor {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+1 +"° numero digitado = " + numeros[i]);
        }

    }

}
