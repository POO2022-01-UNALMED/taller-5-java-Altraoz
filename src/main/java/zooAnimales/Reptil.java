package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        super();
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitad, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles() {
        return Reptil.listado.size()+1;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil.iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil.serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public int getLargoCola() {
        return this.largoCola;
    }
}
