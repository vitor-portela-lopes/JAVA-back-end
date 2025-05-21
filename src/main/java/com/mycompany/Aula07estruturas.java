package com.mycompany;

import java.util.Arrays;

public class Aula07estruturas {

   public static void main(String[] args){
    System.out.println("-------- Array --------");

    int numeros[] = new int[5];//declara uma lista vazia de 5 posições [0,1,2,3,4]
    System.out.println(numeros);//Retorna o valor no indice 0

    numeros[0] = 5;

    System.out.println(numeros);
    System.out.println(Arrays.toString(numeros));

    int numeros2[] = { 2, 3, 5, 7 };
    System.out.println(numeros2[2]);

    System.out.println("-------- matriz --------");

    int matriz[][] = new int[3][4];

    matriz[0][1] = 2;

    int matriz2[][] = {
        {1,2,3},
        {3,2,1}
    };

    System.out.println(Arrays.deepToString(matriz2));


   }
}