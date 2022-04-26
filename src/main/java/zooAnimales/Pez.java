package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    Pez(){super();listado.add(this);}
    Pez(String nombre, int edad, String habitad, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitad,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces(){

    }
    public void movimiento(){

    }
    public static Pez crearSalmon(){

    }
    public static Pez crearBacalao(){

    }
}
