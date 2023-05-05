package Imagenes;

import handlers.ImageHandler;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CopiaImg extends ImageHandler {

    String nombre;
    String nombre2; //Nombre de la copia convertida de bmp a jpeg
    BufferedImage jpg;
    BufferedImage jpg2; //Copia
    BufferedImage jpg3; //Convercion a jpeg
    BufferedImage bmp;
    BufferedImage bmp2;
    BufferedImage bmp3;
    File archivo;
    File archivoCopia;
    File archivoConversion;

    public CopiaImg(String filename) {
        super(filename);
        this.jpg = null;
        this.jpg2 = null; //Copia
        this.bmp = null;
        this.bmp2 = null; //Copia
        this.archivo = new File(getFileName());
        this.archivoCopia = new File(getFileName());
        this.nombre = filename;
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        nombre = new File(nombre).getName();
        jpg = ImageIO.read(file);
        archivo = new File("./Temp/BMP_" + nombre + ".bmp");
        ImageIO.write(jpg, "bmp", archivo);
        bmp = ImageIO.read(archivo);

        jpg2 = ImageIO.read(file);
        archivoCopia = new File("./Temp/Copia_BMP_" + nombre + ".bmp");
        ImageIO.write(jpg2, "bmp", archivoCopia);
        bmp2 = ImageIO.read(archivoCopia);

        nombre2 = archivoCopia.getName();
        jpg3 = ImageIO.read(file);
        archivoConversion = new File("./Temp/Copia_BMP_" + nombre2 + ".jpeg");
        ImageIO.write(jpg3, "bmp", archivoConversion);
        bmp3 = ImageIO.read(archivoConversion);

    }

    @Override
    public void generateFiles() throws Exception {
    }

}
