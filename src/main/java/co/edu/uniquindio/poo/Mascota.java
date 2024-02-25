package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie, String raza, Byte edad, String color, String peso) {

    public Mascota {
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert edad != null;
        assert color != null;
        assert peso != null;
        assert edad >= 0;
        assert nombre != ("47");

    }

}
