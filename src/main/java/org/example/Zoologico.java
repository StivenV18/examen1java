package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal( "Cebra", 180.0);
        animal1.setNombre("Cebra");
        animal1.setGenero("F");

        Animal animal2 = new Animal("Caballo", 200.0);
        animal2.setNombre("Caballo");
        animal2.setGenero("M");


        animal1.encontrarPareja(animal1.getPareja());
        animal2.encontrarPareja(animal2.getPareja());


        Familia familia = new Familia(animal2,animal1);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();




    }
}