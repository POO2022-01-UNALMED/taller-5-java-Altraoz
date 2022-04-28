package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(){super();listado.add(this);}
    public Mamifero(String nombre, int edad, String habitad, String genero, Boolean pelaje, int patas){
        super(nombre,edad,habitad,genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        return listado.size()+1;
    }
    public static Mamifero crearCaballo(String nombre, int  edad, String sexo ) {
        Mamifero nuevoAnimal = new Mamifero(nombre, edad, "pradera", sexo, true, 4);
        listado.add(nuevoAnimal);
        caballos++;
        return nuevoAnimal;
    }

    public static Mamifero crearLeon(String nombre, int  edad, String sexo ) {
        Mamifero nuevoAnimal = new Mamifero(nombre, edad, "selva", sexo, true, 4);
        listado.add(nuevoAnimal);
        leones++;
        return nuevoAnimal;
    }

    public Boolean isPelaje(){
        return this.pelaje;
    }
    public int getPatas(){
        return this.patas;
    }
}
