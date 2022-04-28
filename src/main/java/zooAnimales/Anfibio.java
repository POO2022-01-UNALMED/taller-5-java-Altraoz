package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(){super();listado.add(this);}
    public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, Boolean venenoso){
        super(nombre,edad,habitad,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){return listado.size();}

    @Override
    public String movimiento(){return "saltar";}

    public static Anfibio crearRana(String nombre, int  edad, String sexo ) {
        Anfibio nuevoAnimal = new Anfibio(nombre, edad, "selva", sexo, "rojo", true);
        listado.add(nuevoAnimal);
        ranas++;
        return nuevoAnimal;
    }

    public static Anfibio crearSalamandra (String nombre, int  edad, String sexo ) {
        Anfibio nuevoAnimal = new Anfibio(nombre, edad, "selva", sexo, "negro amarillo", false  );
        listado.add(nuevoAnimal);
        salamandras++;
        return nuevoAnimal;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }
    public Boolean isVenenoso(){
        return this.venenoso;
    }
}
