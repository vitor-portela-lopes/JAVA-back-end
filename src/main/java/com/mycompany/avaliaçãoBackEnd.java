package com.mycompany;

public class avaliaçãoBackEnd {
//atividade 01
    public static void main(String[] args) {
      int pai = 46;
      int mae = 45;
      int filho = 20;
      int filha = 9;
    
      int totalIdades = pai + mae + filho + filha;
      int numeroFamilia = 4;
    
      int mediaIdade = (int) totalIdades / numeroFamilia;
     
       System.out.println("A média de idade da família é: " + mediaIdade + " anos.");
  }




  //atividade02

  
     double raio = 25.0;
     double area = Math.PI * Math.pow(raio,2);
    System.out.println("A área do círculo com raio de " + raio + area, raio, area);


 //atividade03
     double precoOriginal = 1200.00;
     double percentualReajuste = 15.0;

     double valorReajuste = (percentualReajuste / 100) * precoOriginal;
     double precoFinal = precoOriginal + valorReajuste;

    System.out.println("O preço final do produto após o reajuste é: R$ " + precoFinal);


//atividade04


     double precoProduto = 850.00;
  
     double percentualDesconto = 0.30;


     double desconto = precoProduto * percentualDesconto;
     double precoComDesconto = precoProduto - desconto;

   
    System.out.printf("Preço original: R$ %.2f%n", precoProduto);
    System.out.printf("Desconto: R$ %.2f%n", desconto);
    System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);


}
