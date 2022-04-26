package zooAnimales;
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal (){totalAnimales++;}
    public Animal (String nombre, int edad, String habitad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitad;
        this.genero = genero;
    }

    public void movimiento(){

    }

    public int totalPorTipo(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "totalAnimales=" + totalAnimales +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", habitad='" + habitat + '\'' +
                ", genero='" + genero + '\'' +
                ", zona=" + zona +
                '}';
    }

    public String getNombre(){return this.nombre;}
    public int getEdad(){return this.edad;}
    public String getHabitat(){return this.habitat;}
    public String getGenero(){return this.genero;}
}
