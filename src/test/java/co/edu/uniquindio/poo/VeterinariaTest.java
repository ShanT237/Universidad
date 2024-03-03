package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(Veterinaria.class.getName());
    private Veterinaria lista;


    @Test
    public void datosCompletos(){
        LOG.info("Iniciando test de datos completos");

        var mascota = new Mascota("Amoroso", 371, "Loro", "Cacatua", (byte) 11, "Gris", "1 kg");

        assertEquals("Amoroso", mascota.nombre());
        assertEquals(371, mascota.identificacion());
        assertEquals("Loro", mascota.especie());
        assertEquals("Cacatua", mascota.raza());
        assertEquals((byte) 11, mascota.edad());
        assertEquals("Gris", mascota.color());
        assertEquals("1 kg", mascota.peso());

        LOG.info("Finalizando test de datos completos");
    }
    @Test
    public void agregarMascota(){
        LOG.info("Iniciando test agregar mascota");
        var lista = new Veterinaria("Amigos peludos");
        var mascota = new Mascota("Cris P Bacon", 547, "Lechon", "Pietran", (byte) 5, "Negro", "400 kg");

        lista.nuevaMascota(mascota);

        assertTrue(lista.getMascotas().contains(mascota));
        assertEquals(1, lista.getMascotas().size());

        
        LOG.info("Finalizando test agregar mascota");

    }
    @Test
    public void agregarMascotaNula(){
        LOG.info("Iniciando test agregar mascota  nula");
        assertThrows(Throwable.class, () -> new Mascota(null, 0, null, null, (byte) 0, null, null));
        LOG.info("Finalizando test agregar mascota nula");

    }
    @Test
    public void mascotaRepetida(){
        LOG.info("Iniciando test mascota repetida");
        var lista = new Veterinaria("Amigos peludos");
        var mascota1 = new Mascota("Copito", 322, "Gato", "British", (byte) 2, "Blanco", "4 kg");
        var mascota2 = new Mascota("Rocky", 322, "Perro", "Labrador", (byte) 1, "Dorado", "50 kg");

        lista.nuevaMascota(mascota1);
        assertThrows(Throwable.class, () -> lista.nuevaMascota(mascota2));
        LOG.info("Finalizando test mascota repetida");

    }



}