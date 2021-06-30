package view;

import controller.FormaController;
import model.Retangulo;

public class ListarRetangulos implements IRenderizavel{
    @Override
    public void renderizar() {
        FormaController formaController = new FormaController();

                formaController.listarRetangulos().forEach(System.out::println); ;
    }
}
