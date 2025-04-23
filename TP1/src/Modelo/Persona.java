package Modelo;

import Interfaces.ILista;
import Interfaces.IPersona;
import Interfaces.IVehiculo;

public class Persona implements IPersona {
    private String nombre;
    private ILista vehiculos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new Lista();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ILista getVehiculos() {
        return vehiculos;
    }

    @Override
    public void agregarVehiculo(IVehiculo vehiculo) {
        vehiculos.agregarUltimo(vehiculo.getId());
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", vehiculos=" + vehiculos + "]";
    }
}