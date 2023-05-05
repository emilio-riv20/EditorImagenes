package Imagenes;

import handlers.ImageHandler;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author lemil
 */
public class Modificar extends ImageHandler {

    String nombre;
    BufferedImage jpg;
    BufferedImage volteo;
    File archivo;

    public Modificar(String filename) {
        super(filename);
        this.nombre = filename;
        this.jpg = jpg;
        this.volteo = volteo;
        this.archivo = new File(getFileName());
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        nombre = new File(nombre).getName();
        AffineTransform voltear = new AffineTransform();
        voltear.rotate(Math.PI, jpg.getWidth() / 2, jpg.getHeight() / 2);
        BufferedImage imagenRotada = new BufferedImage(jpg.getWidth(), jpg.getHeight(), BufferedImage.TYPE_INT_RGB);
        archivo = new File("./Temp/BMP_" + nombre + ".bmp");
        ImageIO.write(imagenRotada, "jpg", archivo);
    }

    @Override
    public void generateFiles() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
