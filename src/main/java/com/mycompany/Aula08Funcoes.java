package com.mycompany;

public class Aula08Funcoes {

    public static void main (String[] args){
      int numero = 5;

      System.out.println("--- Tabuada do " + numero + "---");
      
      for(int i = 1; i <= 10; i++){
        System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
      }
      System.out.println(fatorial(numero));
    }

    /*não podemos declarar funções dentro de outra função
     * 
     * 
     * toda função dve ter um retorno, quando nao há retorno utilizamos um void
     * 
     * uma função pode não ter parametros, ou ter 1 ou mais. 
     */
    public static int multiplicacao(int num, int num2) {
        return num * num2;
    }

    /*funções recursivas
     * 
     * uma função reclusiva faz chamada para ela propria
     * 
     * porem toda recursividade deve ter um ponto de parada
     * caso contrario pode resultar em um loop infinito
     */
    public static int fatorial(int n) {
      if (n !=0){
        return n * fatorial(n - 1);
      } else {
        return 1;
      }
    }
}