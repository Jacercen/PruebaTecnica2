package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FiltroVuelo {
    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, Optional<LocalDate> fechaInicio, Optional<LocalDate> fechaFin) {
        validarRango(fechaInicio, fechaFin);

        return vuelos.stream()
                .filter(v -> validarFechaInicio(v, fechaInicio))
                .filter(v -> validarFechaFin(v, fechaFin))
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .toList();
        // .collect(Collectors.toList()); Si queremos modificarla habría que usar esta expresión al final en vez de el .toList()
    }
        // Si fechaInicio es null pasan todos los vuelos y si fechaInicio tiene valor pasan los vuelos cuya fechaSalida sea posterior o igual
    private static boolean validarFechaInicio(Vuelo vuelo, Optional<LocalDate> fechaInicio) {
        return fechaInicio
                .map(f -> !vuelo.getFechaSalida().isBefore(f))
                .orElse(true);
    }

    // Si fechaFin es null pasan todos los vuelos y si fechaFin tiene valor pasan los vuelos cuya fechaSalida sea anterior o igual
    private static boolean validarFechaFin(Vuelo vuelo, Optional<LocalDate> fechaFin) {
        return fechaFin
                .map(f-> !vuelo.getFechaSalida().isAfter(f))
                .orElse(true);
    }

    private static void validarRango(Optional<LocalDate> fechaInicio, Optional<LocalDate> fechaFin) {
        if(fechaInicio.isPresent() && fechaFin.isPresent() && fechaInicio.get().isAfter(fechaFin.get())) {
            throw new IllegalArgumentException("La fechaInicio no puede ser mayor que la fechaFin");
        }
    }
}
