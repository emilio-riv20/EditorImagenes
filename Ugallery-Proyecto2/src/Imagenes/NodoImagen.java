package Imagenes;

import java.awt.image.BufferedImage;

public class NodoImagen {

    private String imagen;
    private String ruta;
    private NodoImagen siguiente;
    private NodoImagen anterior;

    public NodoImagen(String imagen, String ruta) {
        this.imagen = imagen;
        this.siguiente = null;
        this.anterior = null;
        this.ruta=ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public NodoImagen getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoImagen siguiente) {
        this.siguiente = siguiente;
    }

    public NodoImagen getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoImagen anterior) {
        this.anterior = anterior;
    }

    public void setSigAn(NodoImagen siguiente, NodoImagen anterior) {
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

}
