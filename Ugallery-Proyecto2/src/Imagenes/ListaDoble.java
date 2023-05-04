package Imagenes;

import javax.swing.JOptionPane;
import proyecto2.EstructuraDeDatos;

public class ListaDoble extends EstructuraDeDatos {

    private NodoImagen comienzo;
    private NodoImagen recorrido;

    public ListaDoble() {
        this.index = 0;
        this.comienzo = null;
        this.nombre = "";
        this.recorrido = null;

    }

    private void Primero(NodoImagen NuevoNodo) {
        NuevoNodo.setSigAn(NuevoNodo, NuevoNodo);
        comienzo = NuevoNodo;
        this.index++;
    }

    @Override
    public void add(Object e) {
        NodoImagen NuevoNodo = (NodoImagen) e;

        if (find(NuevoNodo.getImagen()) == null) {
            if (this.index == 0) {
                Primero(NuevoNodo);
            } else {
                NuevoNodo.setSigAn(comienzo.getAnterior().getSiguiente(), comienzo.getAnterior());
                if (index == 1) {
                    comienzo.setSigAn(NuevoNodo, NuevoNodo);
                } else {
                    comienzo.getAnterior().setSiguiente(NuevoNodo);
                    comienzo.setAnterior(NuevoNodo);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta imagen ya existe");
        }
    }

    @Override
    public Object peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object e) {
        String nombre = (String) e;
        NodoImagen actual = comienzo;
        for (int i = 0; i < index; i++) {
            if (actual.getImagen().equals(nombre)) {
                return actual;
            } else {
                actual = actual.getSiguiente();
            }
        }
        return null;
    }

    @Override
    public Object getNext() {
        if (recorrido == null) {
            recorrido = comienzo;
        }
        recorrido = recorrido.getSiguiente();
        return recorrido;
    }

    public Object getBack() {
        if (recorrido == null) {
            recorrido = comienzo;
        }
        recorrido = recorrido.getAnterior();
        return recorrido;
    }

    @Override
    public int getSize() {
        return this.index;
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
        Object eliminar = find(e);
        if (eliminar != null) {
            NodoImagen img = (NodoImagen)eliminar;
            if (index==1) {
                comienzo=null;
            }else{
                img.getAnterior().setSiguiente(img.getSiguiente());
                img.getSiguiente().setAnterior(img.getAnterior());
            }
            index--;
        }else{
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }
    
    public void actualizar(String nombre, String ruta){
        Object eliminar = find(nombre);
        if (eliminar != null) {
            NodoImagen actual = (NodoImagen)eliminar;
            actual.setRuta(ruta);
        }
    }

}
