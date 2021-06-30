package controller;

import model.Circulo;
import model.Forma;
import model.Retangulo;
import model.Triangulo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FormaController {

    private ArrayList<Forma> formaArrayList;

    public void cadastrar(Forma p_forma ){
        formaArrayList = new ArrayList<>();
        formaArrayList.add( p_forma );
    }

    public ArrayList<Forma> listar(){
        return formaArrayList.stream()
                .collect( Collectors.toCollection( ArrayList::new ) );
    }

    public ArrayList<Retangulo> listarRetangulos(){
        return formaArrayList.stream()
                .filter( f -> f instanceof Retangulo )
                .map( f -> (Retangulo) f)
                .collect( Collectors.toCollection( ArrayList::new ) );
    }

    public ArrayList<Circulo> listarCirculos(){
        return formaArrayList.stream()
                .filter( f -> f instanceof Circulo )
                .map( f -> (Circulo) f)
                .collect( Collectors.toCollection( ArrayList::new ) );
    }

    public ArrayList<Triangulo> listarTriangulos(){
        return formaArrayList.stream()
                .filter( f -> f instanceof Triangulo )
                .map( f -> (Triangulo) f)
                .collect( Collectors.toCollection( ArrayList::new ) );
    }

    public ArrayList<Forma> getFormaArrayList() {
        return formaArrayList;
    }

    public void setFormaArrayList(ArrayList<Forma> formaArrayList) {
        this.formaArrayList = formaArrayList;
    }
}
