package Modelo;

import Interfaces.IVehiculo;

public class Vehiculo implements IVehiculo {
    private int id;

    public Vehiculo(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehiculo [id=" + id + "]";
    }
}
