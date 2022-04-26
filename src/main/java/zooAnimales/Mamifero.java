package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    Mamifero(){super();listado.add(this);}
    Mamifero(String nombre, int edad, String habitad, String genero, Boolean pelaje, int patas){
        super(nombre,edad,habitad,genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static void cantidadMamiferos(){

    }
    public static Mamifero crearCaballo(){

    }

    public static Mamifero crearLeon(){

    }
}
