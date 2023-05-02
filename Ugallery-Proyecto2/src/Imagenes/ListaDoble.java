package Imagenes;

import proyecto2.EstructuraDeDatos;

public class ListaDoble extends EstructuraDeDatos {

    private NodoImagen inicio;

    public ListaDoble() {
        this.inicio = null;
    }

    public void agregar(String imagen) {

    }

    public void MostrarDelante() {
        NodoImagen temporal = this.inicio;
        while (temporal != null) {

            temporal = temporal.getSiguiente();
        }
    }

    public void mostrarAtras() {
        NodoImagen temporal = this.inicio;
        while (temporal != null) {
            temporal = temporal.getSiguiente();
        }
        while (temporal != null) {
            temporal.getImagen();
            temporal = temporal.getAnterior();
        }
    }

    @Override
    public void add(Object e) {
        NodoImagen NuevoNodo = new NodoImagen((String) e);

        if (this.inicio == null) {
            this.inicio = NuevoNodo;
        } else {
            NodoImagen temporal = this.inicio;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(NuevoNodo);
            temporal.setAnterior(temporal);
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
