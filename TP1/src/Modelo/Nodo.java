package Modelo;

import Interfaces.INodo;

public class Nodo implements INodo {
    private int dato;
    private INodo siguiente;
    private INodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Nodo(int dato, INodo siguiente, INodo anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    @Override
    public int getDato() {
        return dato;
    }

    @Override
    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public INodo getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(INodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public INodo getAnterior() {
        return anterior;
    }

    @Override
    public void setAnterior(INodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + "]";
    }
}
