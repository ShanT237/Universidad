package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciando test datos completos");
        Mascota mascota1 = new Mascota("George", 500, "Hamster", "Ruso", (byte) 1, "Cafe", "50 kg");

        assertEquals("George", mascota1.nombre());
        assertEquals("Hamster", mascota1.especie());
        assertEquals("Ruso", mascota1.raza());
        assertEquals((byte) 1, mascota1.edad().byteValue());
        assertEquals("Cafe", mascota1.color());
        assertEquals("50 kg", mascota1.peso());

        LOG.info("Finalizando test datos completos");

    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciando Test datos nulos");

        assertThrows(Throwable.class, () -> new Mascota(null, 500, null, null, (byte) 1, null, null));

        LOG.info("Finalizando Test datos nulos");

    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciando Test datos vacios");

        Mascota mascota = new Mascota("", 0, "", "", (byte) 1, "", "kg");

        assertTrue(mascota.nombre().isEmpty());
        assertTrue(mascota.especie().isEmpty());
        assertTrue(mascota.raza().isEmpty());
        assertTrue(mascota.color().isEmpty());

        LOG.info("Finalizando Test datos vacios");
    }

    @Test
    public void edadNegativa() {
        LOG.info("Iniciando Test edad negativa");
        assertThrows(Throwable.class, () -> new Mascota("George", 0, "Hamster", "Ruso", (byte) -1, "Cafe", "50 kg"));

        LOG.info("Iniciando Test edad negativa");
    }

    @Test
    public void nombreInvalido() {
        LOG.info("Iniciando Test nombre invalido");
        assertThrows(Throwable.class, () -> {
            new Mascota("47", 0, "Hamster", "Ruso", (byte) 1, "Cafe", "50 kg");

            LOG.info("Iniciando Test nombre invalido");
        });
    }

}
