package Interfaces;

import Interfaces.ILista;

public interface IPersona {
    String getNombre();
    void setNombre(String nombre);
    ILista getVehiculos();
    void agregarVehiculo(IVehiculo vehiculo);
    String toString();
}
