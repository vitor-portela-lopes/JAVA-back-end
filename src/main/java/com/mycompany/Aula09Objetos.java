package com.mycompany;

public class Aula09Objetos {

    public static void main(String[] args) {
        /*
         * Em java, toda classe ou tipo abstrato é um objeto, pois possuem
         * caracteristicas
         * e funcionalidades.
         * 
         * Eles herdam funções da classe mãe java.lang.Object, é correto afirmar que
         * java.lang.Object é uma super classe
         * de qualquer outra classe ou tipo abstrato.
         */
        Integer numero = 10; // Tipo abstrato
        int numero2 = 10; // Tipo primitivo

        // Retorna se a variável/classe é uma instância de outra classe
        System.out.println(numero instanceof Object);

        // Método compareTo pertence ao tipo abstrato Integer
        numero.compareTo(numero2);
    }

    /*
     * Criando uma classe dentro de outra classe
     *
     * é necessário utilizar a instrução static
     * entre public e class
     */
    public static class Carro {
        // Atributos da classe
        String modelo;
        String marca;
        int ano;
        int quilometragem = 0;

        /**
         * Método construtor
         *
         * ele é chamado quando criamos uma nova instância
         * da classe.
         */
        public Carro(String modelo, String marca) {
            this.modelo = modelo;
            this.marca = marca;
        }

    }
}