package services;

import entities.Vuelo;
import utils.FiltroVuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class VueloServicio {
    public static void addVuelo(Map<Integer, Vuelo> vuelos, Vuelo vuelo) {
        vuelos.put(vuelo.getId(), vuelo);
    }
    // muestra los vuelos si son Map
    public static void mostrarVuelos(Map<Integer, Vuelo> vuelos) {
        System.out.printf("%-3s | %-8s | %-10s | %-20s | %-20s | %-12s | %-12s%n",
                "ID", "VUELO", "EMPRESA", "SALIDA", "DESTINO", "F.SALIDA", "F.LLEGADA");

        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Vuelo v : vuelos.values()) {
            System.out.println(v);
        }
    }
    // muestra los vuelos si son List
    public static void mostrarVuelos(List<Vuelo> vuelos) {
        System.out.printf("%-3s | %-8s | %-10s | %-20s | %-20s | %-12s | %-12s%n",
                "ID", "VUELO", "EMPRESA", "SALIDA", "DESTINO", "F.SALIDA", "F.LLEGADA");

        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Vuelo v : vuelos) {
            System.out.println(v);
        }
    }
    // pasamos el map a una list y lo metemos al filtro de vuelos que tenemos
    public static List<Vuelo> filtrarVuelos(Map<Integer, Vuelo> vuelos, Optional<LocalDate> fechaInicio, Optional<LocalDate> fechaFin) {
        List<Vuelo> listaVuelos = new ArrayList<>(vuelos.values());
        return FiltroVuelo.filtrarVuelos(listaVuelos, fechaInicio, fechaFin);
    }


}

