package com.mycompany.poo.aula10.aula11;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //Modifica o valor
        pessoa.setNome("Vitor");
        pessoa.setIdade(17);

        //Acessar o valor
        System.out.printf("%s tem %d anos de idade\n",
        pessoa.getNome(), pessoa.getIdade());
    }
}
