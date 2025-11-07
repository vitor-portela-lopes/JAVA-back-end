package com.mycompany.aula13.veiculos;

public class CarroAutomatico implements Veiculo {

@Override
    public void estacionar() {
        // TODO Auto-generated method stub
        System.out.println("Manobrar o veículo na vaga, colocar em P e estacionar");
        
    }

    @Override
    public void seguirEmFrente() {
        // TODO Auto-generated method stub
        System.out.println("Colocar em D e acelerar");
    }

    @Override
    public void re() {
        // TODO Auto-generated method stub
        System.out.println("Colocar em R");
    }
}