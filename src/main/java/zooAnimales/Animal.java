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

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo(){
        return "Mamiferos: "+(Mamifero.cantidadMamiferos())+"\n"+
                "Aves: "+Ave.cantidadAves()+"\n" +
                "Reptiles: "+Reptil.cantidadReptiles()+"\n" +
                "Peces: "+Pez.cantidadPeces()+"\n" +
                "Anfibios: "+Anfibio.cantidadAnfibios();
    }

    @Override
    public String toString() {
        return "“Mi nombre es "+this.nombre+" ,"+this.genero+
                ", la zona en la que me ubico es "+this.zona+
                ", en el zoo";

    }

    public String getNombre(){return this.nombre;}
    public int getEdad(){return this.edad;}
    public String getHabitat(){return this.habitat;}
    public String getGenero(){return this.genero;}
}
