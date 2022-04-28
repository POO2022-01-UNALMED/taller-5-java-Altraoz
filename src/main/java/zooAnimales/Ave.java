package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){super();listado.add(this);}
    public Ave (String nombre, int edad, String habitad, String genero, String colorPlumas){
        super(nombre, edad, habitad, genero);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){return listado.size();}
    public String movimiento(){return "volar";}

    public static Ave crearHalcon(String nombre, int  edad, String sexo ) {
        Ave nuevoAnimal = new Ave(nombre, edad, "montanas", sexo, "cafe glorioso");
        listado.add(nuevoAnimal);
        halcones++;
        return nuevoAnimal;
    }

    public static Ave crearAguila (String nombre, int  edad, String sexo ) {
        Ave nuevoAnimal = new Ave(nombre, edad, "montanas", sexo, "blanco y amarillo");
        listado.add(nuevoAnimal);
        aguilas++;
        return nuevoAnimal;
    }

    public String getColorPlumas(){
        return this.colorPlumas;
    }


}
