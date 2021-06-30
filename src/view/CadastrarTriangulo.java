package view;

import model.Triangulo;

public class CadastrarTriangulo implements IRenderizavel{

    private Triangulo triangulo;

    @Override
    public void renderizar() {
        System.out.println( "Triângulo cadastrado ! " );
    }
}
