package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){super();listado.add(this);}
    public Pez(String nombre, int edad, String habitad, String genero, String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitad,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces (){return listado.size()+1;}
    public String movimiento(){return "nadar";}

    public static Pez crearSalmon(String nombre, int  edad, String sexo ) {
        Pez nuevoAnimal = new Pez(nombre, edad, "oceano", sexo, "rojo", 6);
        listado.add(nuevoAnimal);
        salmones++;
        return nuevoAnimal;
    }

    public static Pez crearBacalao(String nombre, int  edad, String sexo ) {
        Pez nuevoAnimal = new Pez(nombre, edad, "oceano", sexo, "gris", 6);
        listado.add(nuevoAnimal);
        bacalaos++;
        return nuevoAnimal;
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
}
