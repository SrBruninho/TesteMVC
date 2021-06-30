package view;

import controller.FormaController;
import model.Retangulo;

import java.util.Scanner;

public class Principal {
    public static FormaController formaController = new FormaController();
    public static CadastrarRetangulo cadastrarRetangulo = new CadastrarRetangulo();
    public static ListarRetangulos listarRetangulos = new ListarRetangulos();
    public static void main(String[]args){

        Scanner l_scanner = new Scanner( System.in );

        int l_opcao = 0;

        System.out.println("---------MENU---------");
        System.out.println("1 - Cadastrar Retângulo");
        System.out.println("2 - Cadastrar Triângulo");
        System.out.println("3 - Cadastrar Círculo");
        System.out.println("4 - Listar todos");
        System.out.println("5 - Listar Retângulo");
        System.out.println("6 - Listar Triângulo");
        System.out.println("7 - Listar Círculo");
        l_opcao = l_scanner.nextInt();
        while(true){
        switch (l_opcao ) {
            case 1:
                Retangulo retangulo = new Retangulo();

                System.out.println("Digite a altura");
                int altura = l_scanner.nextInt();
                retangulo.setAltura(altura);

                System.out.println("Digite a base");
                int largura = l_scanner.nextInt();
                retangulo.setLargura(largura);

                formaController.cadastrar( retangulo );
                cadastrarRetangulo.renderizar();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                formaController.listar();
                break;
            case 5:
                formaController.listarRetangulos();
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                throw new RuntimeException("Não é uma opção válida");
        }

    }}
}
