package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    Reptil(){super();listado.add(this);}
    Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitad,genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){

    }
    public void movimiento(){

    }
    public static Reptil crearIguana(){

    }

    public static Reptil crearSerpiente
}
