package Interfaces;

public interface ILista {
    void agregarPrimero(int d);
    void agregarUltimo(int d);
    void agregarGenerico(int d, int pos);
    int eliminarPrimero();
    int eliminarUltimo();
    int eliminar(int pos);
    int obtenerPrimero();
    int obtenerUltimo();
    int obtenerGenerico(int pos);
    int busquedaLineal(int d);
    void mostrarLista();
    int cantidadElementos();
    boolean estaVacia();
}
