package Usuarios;

import proyecto2.EstructuraDeDatos;

public class ListaUsuarios extends EstructuraDeDatos {

    private Nodo inicio;
    public int tamaño;

    public ListaUsuarios() {
        this.inicio = null;
        this.tamaño = 0;
    }

    public void Mostrar() {
        Nodo Temporal = inicio;

        while (Temporal != null) {
            System.out.println("El nombre de usuario es: " + Temporal.getUsuario());
            Temporal = Temporal.getSiguiente();
        }
    }

    public boolean Comprobar(String usuario) {
        Nodo actual = inicio;

        while (actual != null) {
            if (actual.getUsuario().equals(usuario)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public void add(Object e) {
        Nodo NuevoNodo = new Nodo((String) e);
        if (inicio == null) {
            inicio = NuevoNodo;
        } else {
            Nodo Temporal = inicio;
            while (Temporal.getSiguiente() != null) {
                Temporal = Temporal.getSiguiente();
            }
            Temporal.setSiguiente(NuevoNodo);
        }
        tamaño++;
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
