package Modelo;

import Interfaces.ILista;
import Interfaces.INodo;

public class Lista implements ILista {
    private INodo primero;
    private INodo ultimo;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }

    @Override
    public boolean estaVacia() {
        return primero == null;
    }

    @Override
    public void agregarPrimero(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (estaVacia()) {
            primero = ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        }
    }

    @Override
    public void agregarUltimo(int d) {
        Nodo nuevoNodo = new Nodo(d);
        if (estaVacia()) {
            primero = ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
    }

    @Override
    public void agregarGenerico(int d, int pos) {
        if (pos < 0 || pos > cantidadElementos()) {
            System.out.println("¡Posición inválida!");
            return;
        }
        if (pos == 0) {
            agregarPrimero(d);
            return;
        }
        if (pos == cantidadElementos()) {
            agregarUltimo(d);
            return;
        }
        Nodo nuevoNodo = new Nodo(d);
        INodo actual = primero;
        for (int i = 0; i < pos; i++) {
            actual = actual.getSiguiente();
        }
        nuevoNodo.setSiguiente(actual);
        nuevoNodo.setAnterior(actual.getAnterior());
        actual.getAnterior().setSiguiente(nuevoNodo);
        actual.setAnterior(nuevoNodo);
    }

    @Override
    public int eliminarPrimero() {
        if (estaVacia()) {
            System.out.println("¡Lista vacía!");
            return -1;
        }
        int dato = primero.getDato();
        primero = primero.getSiguiente();
        if (primero == null) {
            ultimo = null;
        } else {
            primero.setAnterior(null);
        }
        return dato;
    }

    @Override
    public int eliminarUltimo() {
        if (estaVacia()) {
            System.out.println("¡Lista vacía!");
            return -1;
        }
        int dato = ultimo.getDato();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) {
            primero = null;
        } else {
            ultimo.setSiguiente(null);
        }
        return dato;
    }

    @Override
    public int eliminar(int pos) {
        if (estaVacia() || pos < 0 || pos >= cantidadElementos()) {
            System.out.println("¡Posición inválida o lista vacía!");
            return -1;
        }
        if (pos == 0) {
            return eliminarPrimero();
        }
        if (pos == cantidadElementos() - 1) {
            return eliminarUltimo();
        }
        INodo actual = primero;
        for (int i = 0; i < pos; i++) {
            actual = actual.getSiguiente();
        }
        int dato = actual.getDato();
        actual.getAnterior().setSiguiente(actual.getSiguiente());
        actual.getSiguiente().setAnterior(actual.getAnterior());
        return dato;
    }

    @Override
    public int obtenerPrimero() {
        if (estaVacia()) {
            System.out.println("¡Lista vacía!");
            return -1;
        }
        return primero.getDato();
    }

    @Override
    public int obtenerUltimo() {
        if (estaVacia()) {
            System.out.println("¡Lista vacía!");
            return -1;
        }
        return ultimo.getDato();
    }

    @Override
    public int obtenerGenerico(int pos) {
        if (estaVacia() || pos < 0 || pos >= cantidadElementos()) {
            System.out.println("¡Posición inválida o lista vacía!");
            return -1;
        }
        INodo actual = primero;
        for (int i = 0; i < pos; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    @Override
    public int busquedaLineal(int d) {
        if (estaVacia()) {
            System.out.println("¡Lista vacía!");
            return -1;
        }
        int pos = 0;
        INodo actual = primero;
        while (actual != null) {
            if (actual.getDato() == d) {
                return pos;
            }
            actual = actual.getSiguiente();
            pos++;
        }
        System.out.println("¡No lo encontré!");
        return -1;
    }

    @Override
    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("¡Lista vacía!");
            return;
        }
        INodo actual = primero;
        System.out.print("Lista: ");
        while (actual != null) {
            System.out.print(actual.getDato() + " <-> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    @Override
    public int cantidadElementos() {
        int count = 0;
        INodo actual = primero;
        while (actual != null) {
            count++;
            actual = actual.getSiguiente();
        }
        return count;
    }
}
