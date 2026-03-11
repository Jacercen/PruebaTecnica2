package entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Vuelo {
    private static int contador = 1;
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaSalida;
    private LocalDate fechaEntrada;

    public Vuelo(String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaSalida, LocalDate fechaEntrada) {
        this.id = contador++;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;

    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%-3d | %-8s | %-10s | %-20s | %-20s | %-12s | %-12s",
                id, nombreVuelo, empresa, lugarSalida, lugarLlegada, fechaSalida, fechaEntrada);
    }

}
