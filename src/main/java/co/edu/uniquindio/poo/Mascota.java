package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public record Mascota(String nombre , int identificacion , String especie , String raza , Byte edad , String color , String peso ) {

    public Mascota {
        assert nombre != null: "El nombre debe ser diferente de null";
        assert especie != null : "La especie debe ser diferente a null";
        assert raza != null : "La raza debe ser diferente a null";
        assert color != null : "El color debe ser diferente a null";
        assert peso != null && peso.contains("kg") : "El peso debe contener kg";
        assert edad > 0 : "La edad debe ser mayor a cero";
        assert nombre != ("47");

    }
}
