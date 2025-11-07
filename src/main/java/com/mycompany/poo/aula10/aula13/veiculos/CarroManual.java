package com.mycompany.aula13.veiculos;

public class CarroManual implements Veiculo {

    @Override
    public void estacionar() {
        // TODO Auto-generated method stub
        System.out.println("Manobrar o veículo na vaga, pisar na embreagem, colocar na 1° e puxar o freio de mão");
        
    }

    @Override
    public void seguirEmFrente() {
        // TODO Auto-generated method stub
        System.out.println("Pisar na embreagem colocar na 1° e acelerar...");
        
        
    }

    @Override
    public void re() {
        // TODO Auto-generated method stub
        System.out.println("Pisar na embreagem e colocar na marcha ré");
    }
}