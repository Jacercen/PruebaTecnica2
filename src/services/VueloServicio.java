package services;

import entities.Vuelo;
import utils.FiltroVuelo;

import java.time.LocalDate;
import java.util.*;


public class VueloServicio {
    public static void addVuelo(Map<Integer, Vuelo> vuelos, Vuelo vuelo) {
        vuelos.put(vuelo.getId(), vuelo);
    }

    // mediante Collection utilizamos podemos anilazar tanto maps como list
    public static void mostrarVuelos(Collection<Vuelo> vuelos) {
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

