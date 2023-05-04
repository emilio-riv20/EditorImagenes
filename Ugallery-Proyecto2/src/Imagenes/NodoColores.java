package Imagenes;

import handlers.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public abstract class NodoColores extends ImageHandler {

    BufferedImage jpg;
    BufferedImage bmp;
    File archivo;
    String nombre;

    public NodoColores(String filename) {
        super(filename);
        this.jpg = null;
        this.bmp = null;
        this.archivo = new File(getFileName());
        this.nombre = filename;
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        nombre = new File(nombre).getName();
        jpg = ImageIO.read(file);
        archivo = new File("./Temp/btmTemp"+nombre);
        ImageIO.write(jpg, "bmp", archivo);
        bmp = ImageIO.read(archivo);
    }
    
    public abstract void repintar(int i, int j, Color color);
    
     @Override
    public void generateFiles() throws Exception {
        for (int i = 0; i < bmp.getWidth(); i++) {
            for (int j = 0; j < bmp.getHeight(); j++) {
                Color color = new Color(bmp.getRGB(i, j));
                repintar(i, j, color);
            }
        }
        nombre = new File(nombre).getName();
        ImageIO.write(bmp, "jpg", new File("./Temp/BlancoNegro_"+nombre));
    }
}
