package Usuarios;

import javax.swing.JOptionPane;
import proyecto2.EstructuraDeDatos;

public class ListaUsuarios extends EstructuraDeDatos {

    private Nodo inicio;
    public int tamaño;

    public ListaUsuarios() {
        this.inicio = null;
        this.tamaño = 0;
        this.index = 0;
    }

    public void Mostrar() {
        Nodo Temporal = inicio;

        while (Temporal != null) {
            System.out.println("El nombre de usuario es: " + Temporal.getUsuario());
            Temporal = Temporal.getSiguiente();
        }
    }

    private void Primero(Nodo NuevoNodo) {
        NuevoNodo.setSiguiente(NuevoNodo);
        inicio = NuevoNodo;
        this.index++;
    }

    @Override
    public void add(Object e) {

        Nodo NuevoNodo = new Nodo((String) e);

        if (find(NuevoNodo.getUsuario()) == null) {
            if (this.index == 0) {
                Primero(NuevoNodo);
            } else {
                NuevoNodo.setSiguiente(inicio.getSiguiente());
                if (index == 1) {
                    inicio.setSiguiente(NuevoNodo);
                } else {
                    inicio.getSiguiente().setSiguiente(NuevoNodo);
                    inicio.setSiguiente(NuevoNodo);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario ya existe");
        }
        /*if (find(NuevoNodo.getUsuario())==null) {
            if (this.index==0) {
                Primero(NuevoNodo);
            }
            //inicio = NuevoNodo;
        } else {
            Nodo Temporal = inicio;
            while (Temporal.getSiguiente() != null) {
                Temporal = Temporal.getSiguiente();
            }
            Temporal.setSiguiente(NuevoNodo);
        }
        index++;*/
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        String nombre = (String) e;
        Nodo actual = inicio;
        for (int i = 0; i < index; i++) {
            if (actual.getUsuario().equals(nombre)) {
                return actual;
            } else {
                actual = actual.getSiguiente();
            }
        }
        return null;
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
