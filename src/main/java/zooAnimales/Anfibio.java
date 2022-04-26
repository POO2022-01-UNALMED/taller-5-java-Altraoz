package zooAnimales;

public class Anfibio extends Animal{
    private static Anfibio listado[];
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, Boolean venenoso){
        super(nombre,edad,habitad,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){

    }
    public void movimiento(){

    }
    public static Anfibio crearRana(){

    }
    public static Anfibio crearSalamandra(){

    }
}
