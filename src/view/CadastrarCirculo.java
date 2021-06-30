package view;

import model.Circulo;

public class CadastrarCirculo implements IRenderizavel{

    private Circulo circulo;

    @Override
    public void renderizar() {
        System.out.println( "Círculo foi cadastrado !! " );

    }
}
