package Imagenes;

import handlers.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CambiarColores extends ImageHandler {

    BufferedImage jpg;
    BufferedImage bmp;
    BufferedImage jpgV;
    BufferedImage bmpV;
    BufferedImage jpgA;
    BufferedImage bmpA;
    File archivoR;
    File archivoV;
    File archivoA;
    String NombreRojo;
    String NombreAzul;
    String NombreVerde;

    public CambiarColores(String filename) {
        super(filename);
        this.jpg = null;
        this.bmp = null;
        this.jpgV = null;
        this.bmpV = null;
        this.jpgA = null;
        this.bmpA = null;
        this.archivoR = new File(getFileName());
        this.archivoV = new File(getFileName());
        this.NombreRojo = filename;
        this.NombreAzul = filename;
        this.NombreVerde = filename;
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        NombreRojo = new File(NombreRojo).getName();
        jpg = ImageIO.read(file);
        ImageIO.write(jpg, "jpg", archivoR);
        bmp = ImageIO.read(archivoR);

        File fileV = new File(getFileName());
        NombreVerde = new File(NombreVerde).getName();
        jpgV = ImageIO.read(fileV);
        ImageIO.write(jpg, "jpg", archivoV);
        bmpV = ImageIO.read(archivoV);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int i = 0; i < bmp.getWidth(); i++) {
            for (int j = 0; j < bmp.getHeight(); j++) {
                Color color = new Color(bmp.getRGB(i, j));
                int rojo = color.getRed();
                int verde = 0;
                int azul = 0;
                int ColorRojo = new Color(rojo, verde, azul).getRGB();
                bmp.setRGB(i, j, ColorRojo);

                //Para verde
                int rojo2 = 0;
                int verde2 = color.getGreen();
                int azul2 = 0;
                int ColorVerde = new Color(rojo2, verde2, azul2).getRGB();
                bmpV.setRGB(i, j, ColorVerde);
            }
        }
        //Para rojo
        NombreRojo = new File(NombreRojo).getName();
        ImageIO.write(bmp, "jpg", new File("./Temp/Rojo_" + NombreRojo));

        //Para verde
        NombreVerde = new File(NombreVerde).getName();
        ImageIO.write(bmpV, "jpg", new File("./Temp/Verde_" + NombreVerde));
    }

}
