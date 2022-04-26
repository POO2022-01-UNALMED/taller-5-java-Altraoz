package zooAnimales;
import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitad;
    private String genero;
    private Zona zona;

    Animal (String nombre, int edad, String habitad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitad = habitad;
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
                ", habitad='" + habitad + '\'' +
                ", genero='" + genero + '\'' +
                ", zona=" + zona +
                '}';
    }
}
