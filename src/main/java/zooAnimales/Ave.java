package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    Ave(){super();listado.add(this);}
    Ave (String nombre, int edad, String habitad, String genero, String colorPlumas){
        super(nombre, edad, habitad, genero);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){

    }
    public void movimiento(){

    }

    public static Ave crearHalcon(){

    }
    public static Ave crearAguila(){

    }


}
