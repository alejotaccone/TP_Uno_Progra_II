package Test;

import Modelo.Persona;
import Modelo.Vehiculo;
import Interfaces.ILista;

public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona("Juan");

        // Crear vehículos
        Vehiculo v1 = new Vehiculo(1);
        Vehiculo v2 = new Vehiculo(2);
        Vehiculo v3 = new Vehiculo(3);
        Vehiculo v4 = new Vehiculo(4);

        // Agregar vehículos a la lista
        System.out.println("Agregando vehículos...");
        persona.agregarVehiculo(v1);
        persona.agregarVehiculo(v2);
        persona.agregarVehiculo(v3);
        persona.getVehiculos().agregarPrimero(v4.getId());
        persona.getVehiculos().mostrarLista();

        // Cantidad de elementos
        System.out.println("Cantidad de vehículos: " + persona.getVehiculos().cantidadElementos());

        // Búsqueda lineal
        System.out.println("Posición del vehículo con id 102: " + persona.getVehiculos().busquedaLineal(102));

        // Pbtener el primero y último
        System.out.println("Primer vehículo: " + persona.getVehiculos().obtenerPrimero());
        System.out.println("Último vehículo: " + persona.getVehiculos().obtenerUltimo());

        // Obtener un generico
        System.out.println("Vehículo en posición 1: " + persona.getVehiculos().obtenerGenerico(1));

        // Agregar un genérico
        System.out.println("Agregar vehículo con id 105 en posición 2");
        persona.getVehiculos().agregarGenerico(105, 2);
        persona.getVehiculos().mostrarLista();

        // Eliminar el primero
        System.out.println("Eliminar primer vehículo: " + persona.getVehiculos().eliminarPrimero());
        persona.getVehiculos().mostrarLista();

        // Eliminar el último
        System.out.println("Eliminar último vehículo: " + persona.getVehiculos().eliminarUltimo());
        persona.getVehiculos().mostrarLista();

        // Eliminar una posición
        System.out.println("Eliminar vehículo en posición 2: " + persona.getVehiculos().eliminar(2));
        persona.getVehiculos().mostrarLista();
    }
}