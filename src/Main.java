import entities.Vuelo;
import services.VueloServicio;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class Main {
    public static final LocalDate fechaInicio = LocalDate.of(2026, 5, 5);
    public static final LocalDate fechaFin = LocalDate.of(2026, 5, 20);
//    public static final LocalDate fechaFin = null;
//    public static final LocalDate fechaInicio = null;

    public static void main(String[] args) {
        Map<Integer, Vuelo> vuelos = new HashMap<>();
        // Vuelo(id,nombreVuelo,empresa,lugarSalida,lugarLlegada.fechaSalida,fechaEntrada)
        VueloServicio.addVuelo(vuelos, new Vuelo("RYR258", "Ryanair", "Madrid", "Berlin",
                LocalDate.of(2026, 5, 5), LocalDate.of(2026, 5, 5)));

        VueloServicio.addVuelo(vuelos, new Vuelo("IB1931", "Iberia", "Madrid", "Nueva York",
                LocalDate.of(2026, 5, 6), LocalDate.of(2026, 7, 5)));

        VueloServicio.addVuelo(vuelos, new Vuelo("RYR280", "Ryanair", "Londres", "Paris",
                LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 10)));

        VueloServicio.addVuelo(vuelos, new Vuelo("RYR290", "Ryanair", "Madrid", "Barcelona",
                LocalDate.of(2026, 5, 15), LocalDate.of(2026, 5, 15)));

        VueloServicio.addVuelo(vuelos, new Vuelo("RYR358", "Ryanair", "Rio de Janeiro", "Miami",
                LocalDate.of(2026, 5, 5), LocalDate.of(2026, 5, 6)));

        VueloServicio.addVuelo(vuelos, new Vuelo("RYR448", "Ryanair", "Tokio", "Dubai",
                LocalDate.of(2026, 5, 5), LocalDate.of(2026, 5, 5)));

        VueloServicio.addVuelo(vuelos, new Vuelo("RYR357", "Ryanair", "Madrid", "Sevilla",
                LocalDate.of(2026, 5, 8), LocalDate.of(2026, 5, 8)));

        VueloServicio.addVuelo(vuelos, new Vuelo("RYR258", "Ryanair", "Alicante", "Valencia",
                LocalDate.of(2026, 5, 2), LocalDate.of(2026, 5, 2)));

        VueloServicio.addVuelo(vuelos, new Vuelo("IB1932", "Iberia", "Valencia", "Tenerife",
                LocalDate.of(2026, 5, 1), LocalDate.of(2026, 5, 1)));

        VueloServicio.addVuelo(vuelos, new Vuelo("V0254", "Vueling", "Madrid", "Berlin",
                LocalDate.of(2026, 5, 5), LocalDate.of(2026, 5, 5)));

        System.out.println("TODOS LOS VUELOS");
        // Al utilizar collections y querer usar mostrarVuelos con un map, le tenemos que dar el .values()
        VueloServicio.mostrarVuelos(vuelos.values());

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("VUELOS FILTRADOS");
        // Para usar el filtro necesitamos que los vuelos sean una lista
        List<Vuelo> vuelosFiltrados = VueloServicio.filtrarVuelos(vuelos, Optional.ofNullable(fechaInicio), Optional.ofNullable(fechaFin));
        VueloServicio.mostrarVuelos(vuelosFiltrados);
    }
}
