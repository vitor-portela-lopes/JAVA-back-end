package com.mycompany;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Cálculo de IMC");
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("\nDigite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.print("\nSeu IMC é " + imc + ", ");
        if (imc < 16) {
            System.out.println("Você está com Magreza Grau III");
        } else if (imc < 17) {
            System.out.println("Você está com Magreza Grau II");
        } else if (imc < 18.5) {
            System.out.println("Você está com Magreza Grau I");
        } else if (imc < 25) {
            System.out.println("Você está com Peso Ideal");
        } else if (imc < 30) {
            System.out.println("você esta com sobrepeso");
        } else if (imc < 35) {
            System.out.println("você está com obesidade grau 1");
        } else if (imc < 40) {
            System.out.println("você está com obesidade grau 2");
        } else if (imc < 45) {
            System.out.println("GORDO PRA CARALHO");
        } else if (imc < 50) {
            System.out.println("Perão");
        }

        scanner.close();
    }
}