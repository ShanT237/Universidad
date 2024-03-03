package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> mascotas;


    ///Metodo constructor 
    public Veterinaria(String nombre) {
        assert nombre != null: "El nombre no puede ser nulo";
        this.nombre = nombre;
        mascotas = new  LinkedList<>();
    }

    public String getNombre(){
        return nombre;
    }

    // Metodo para comparar la identificacion de la nueva mascota con las mascotas registradas
    public Mascota getMascota(int identificacion){
        Mascota mascotaSelccion = null;

        for (Mascota mascota : mascotas){
            if (mascota.identificacion() == (identificacion)){
                mascotaSelccion = mascota;
            }
        }
        return mascotaSelccion;
        
    }
    public Collection<Mascota> getMascotas(){
        return Collections.unmodifiableCollection(mascotas);
    }

    /// Metodo construtor: estamos coomparando que la identificación de la mascota
    /// no se repita///
    public void nuevaMascota(Mascota mascota) {
        assert verificarNumeroId(mascota.identificacion()) == false : "El numero de identificación ya existe";
        mascotas.add(mascota);

    }

    private boolean verificarNumeroId(int identificacion){
        boolean exist = false;

        for (Mascota mascota : mascotas){
            if (mascota.identificacion() == identificacion){
                exist = true;
            }

        }
        return exist;
    }
    
    // Método para obtener la lista de mascotas que tienen 10 años de edad
    public Collection<Mascota> getMascotasDe10() {
        List<Mascota> mascotasDe10 = new ArrayList<>();
        
        for (Mascota mascota : mascotas) {
            if (mascota.edad() == 10) {
                mascotasDe10.add(mascota);
            }
        }
        
        return mascotasDe10;
    }

    public static void main(String[] args) {
        var lista = new Veterinaria("Amigos peludos");
        var mascota1 = new Mascota("Blanca nubia", 251200, "Gato", "Angora", (byte) 10, "Blanco", "4 kg");
        var mascota2 = new Mascota("Sherlock", 0047, "Perro", "Danes", (byte) 10, "Gris", "50 kg");
        var mascota3 = new Mascota("Wolgang", 1945, "Perro", "Tibetano", (byte) 9, "Cafe", "90 kg");
        var mascota4 = new Mascota("Pops", 1986, "Gato", "Siberian", (byte) 10, "Gris", "5 kg");
        var mascota5 = new Mascota("Pluto", 1917, "Perro", "Husky", (byte) 3, "Negro", "50 kg");
        var mascota6 = new Mascota("Abbey", 1967, "Loro", "Periquito", (byte) 10, "Amarillo", "1 kg");
        var mascota7 = new Mascota("Black Sabbath", 1897, "Lechon", "British", (byte) 8, "Rosa", "200 kg");
        var mascota8 = new Mascota("Tom", 1643, "Tortuga", "Peruana", (byte) 200, "Gris", "7 kg");
        
        lista.nuevaMascota(mascota1);
        lista.nuevaMascota(mascota2);
        lista.nuevaMascota(mascota3);
        lista.nuevaMascota(mascota4);
        lista.nuevaMascota(mascota5);
        lista.nuevaMascota(mascota6);
        lista.nuevaMascota(mascota7);
        lista.nuevaMascota(mascota8);

        // Obtener las mascotas de 10 años de edad
        Collection<Mascota> mascotasDe10 = lista.getMascotasDe10();
        for(Mascota mascota: mascotasDe10){
            System.out.println("Mascota de 10 años: " + mascota);
        }
    }



}