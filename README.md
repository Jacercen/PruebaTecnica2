# PruebaTecnica2
Prueba Técnica - Curso 2
Segunda Prueba técnica del curso.
Este proyecto es un programa en Java para filtrar vuelos según un rango de fechas.

El sistema simula un pequeño gestor de vuelos (inspirado en plataformas como Amadeus) donde los vuelos ya están cargados por defecto 
y el usuario puede filtrarlos según su fecha de salida.

## Descripción del proyecto
El programa contiene una lista de vuelos predefinidos y permite filtrarlos utilizando dos fechas:
  - fechaInicio
  - fechaFin

El sistema creado compara estas fechas con la fecha de salida del vuelo y muestra únicamente los vuelos que se encuentran 
dentro de ese rango de fechas.

El resultado se muestra mediante salida por consola.

## Estructura del proyecto
El proyecto está organizado en varias clases para separar responsabilidades y mejorar la reutilización del código.
  - Main.java
    * Clase principal del programa.
    * Ejecuta el programa
    * Crea los vuelos de ejemplo
    * Llama al filtro de vuelos
    * Muestra los resultados por consola

  - entities/Vuelo.java
    * Clase que contiene los atributos del vuelo:
        - Identificador del vuelo
        - Origen
        - Destino
        - Fecha de salida
      También incluye sus constructores, getters y setters.

  - services/VueloServicio.java
    * Clase que contiene los métodos reutilizables relacionados con la gestión de vuelos, como pueden ser el mostrar los
      vuelos por pantalla y gestionar la colección de vuelos.
      
  - utils/FiltroVuelo.java
    * Clase utilitaria encargada de filtrar los vuelos según el rango de fechas introducido.
      Compara la fechaInicio y fechaFin las cuales pueden ser igual a null con la fechaSalida de la clase Vuelo.java.

  ## Cómo ejecutar el programa
  1. Clonar el repositorio:
      Mediante el siguiente comando podremos clonar el repositorio en nuestra máquina local:
     
       git clone https://github.com/Jacercen/PruebaTecnica2.git
  
  2. Abrir el proyecto en un IDE, como podría ser IntelliJ IDEA.
     
  4. Compilar y ejecutar la clase Main.java

  5. El resultado se mostrará en la consola, mostrando los vuelos ordenados por fecha que el programa habrá filtrado.

     
      
