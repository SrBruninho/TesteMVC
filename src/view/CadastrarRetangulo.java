package view;

import model.Retangulo;

public class CadastrarRetangulo implements IRenderizavel{

    private Retangulo retangulo;

    @Override
    public void renderizar() {
        System.out.println( "Retângulo cadastrado ! " );
    }
}
