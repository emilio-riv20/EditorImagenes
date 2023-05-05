package Imagenes;

import handlers.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Convertidor extends ImageHandler {

    String nombre;
    BufferedImage jpg;
    BufferedImage bmp;
    File archivo;

    public Convertidor(String filename) {
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
        archivo = new File("./Temp/Converted_" + nombre +".bmp");
        ImageIO.write(jpg, "bmp", archivo);
        bmp = ImageIO.read(archivo);
    }

    @Override
    public void generateFiles() throws Exception {
    }

}
