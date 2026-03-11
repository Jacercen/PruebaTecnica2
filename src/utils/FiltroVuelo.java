package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FiltroVuelo {
    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, Optional<LocalDate> fechaInicio, Optional<LocalDate> fechaFin) {
        return vuelos.stream()
                .filter(v -> fechaInicio
                        // si existe fechaInicio, comprueba que la fechaSalida del vuelo sea mayor o igual que fechaInicio
                        // si fechaInicio está vacío, el filtro devuelve true y pasan los vuelos de la lista
                        .map(f -> !v.getFechaSalida().isBefore(f))
                        .orElse(true))
                .filter(v -> fechaFin
                        // si existe fechaFin, comprueba que la fechaSalida del vuelo sea menor o igual que fechaFin
                        // si fechaFin está vacío, el filtro devuelve true y pasan los vuelos de la lista
                        .map(f -> !v.getFechaSalida().isAfter(f))
                        .orElse(true))
                // ordeno los vuelos por fecha de salida
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .toList();
        // .collect(Collectors.toList()); Si queremos modificarla habría que usar esta expresión al final en vez de el .toList()
    }
}
