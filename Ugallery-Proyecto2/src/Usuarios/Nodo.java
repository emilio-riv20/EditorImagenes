package Usuarios;

public class Nodo {
    private String usuario;
    private Nodo siguiente;

    public Nodo(String usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
