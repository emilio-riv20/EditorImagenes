package Imagenes;

import handlers.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CambiarColores extends ImageHandler {

    BufferedImage jpg;
    BufferedImage Rojo;
    BufferedImage jpgV;
    BufferedImage Verde;
    BufferedImage jpgA;
    BufferedImage Azul;
    BufferedImage jpgS;
    BufferedImage Sepia;

    File archivoR;
    File archivoV;
    File archivoA;
    File archivoS;

    String NombreRojo;
    String NombreAzul;
    String NombreVerde;
    String NombreSepia;

    public CambiarColores(String filename) {
        super(filename);
        this.jpg = null;
        this.Rojo = null;
        this.jpgV = null;
        this.Verde = null;
        this.jpgA = null;
        this.Azul = null;
        this.Sepia = null;
        this.jpgS = null;
        
        this.archivoR = new File(getFileName());
        this.archivoV = new File(getFileName());
        this.archivoA = new File(getFileName());
        this.archivoS = new File(getFileName());
        
        this.NombreRojo = filename;
        this.NombreAzul = filename;
        this.NombreVerde = filename;
        this.NombreSepia = filename;
    }

    @Override
    public void readFile() throws Exception {
        //Para rojo
        File file = new File(getFileName());
        NombreRojo = new File(NombreRojo).getName();
        jpg = ImageIO.read(file);
        ImageIO.write(jpg, "jpg", archivoR);
        Rojo = ImageIO.read(archivoR);

        //Para Verde
        File fileV = new File(getFileName());
        NombreVerde = new File(NombreVerde).getName();
        jpgV = ImageIO.read(fileV);
        ImageIO.write(jpgV, "jpg", archivoV);
        Verde = ImageIO.read(archivoV);

        //Para azul
        File fileA = new File(getFileName());
        NombreAzul = new File(NombreAzul).getName();
        jpgA = ImageIO.read(fileA);
        ImageIO.write(jpgA, "jpg", archivoA);
        Azul = ImageIO.read(archivoA);

        //Para sepia
        File fileS = new File(getFileName());
        NombreSepia = new File(NombreSepia).getName();
        jpgS = ImageIO.read(fileS);
        ImageIO.write(jpgS, "jpg", archivoS);
        Sepia = ImageIO.read(archivoS);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int i = 0; i < Rojo.getWidth(); i++) {
            for (int j = 0; j < Rojo.getHeight(); j++) {
                Color color = new Color(Rojo.getRGB(i, j));
                //Para rojo
                int rojo = color.getRed();
                int verde = 0;
                int azul = 0;
                int ColorRojo = new Color(rojo, verde, azul).getRGB();
                Rojo.setRGB(i, j, ColorRojo);

                //Para verde
                int rojo2 = 0;
                int verde2 = color.getGreen();
                int azul2 = 0;
                int ColorVerde = new Color(rojo2, verde2, azul2).getRGB();
                Verde.setRGB(i, j, ColorVerde);

                //Para azul
                int rojo3 = 0;
                int verde3 = 0;
                int azul3 = color.getBlue();
                int ColorAzul = new Color(rojo3, verde3, azul3).getRGB();
                Azul.setRGB(i, j, ColorAzul);

                //Para sepia
                int rgb = Sepia.getRGB(i, j);
                int rojo4 = (rgb >> 16) & 0xff;
                int verde4 = (rgb >> 8) & 0xff;
                int azul4 = rgb & 0xff;

                int tr = (int) (0.393 * rojo4 + 0.769 * verde4 + 0.189 * azul4);
                int tg = (int) (0.349 * rojo4 + 0.686 * verde4 + 0.168 * azul4);
                int tb = (int) (0.272 * rojo4 + 0.534 * verde4 + 0.131 * azul4);

                rojo4 = tr < 255 ? tr : 255;
                verde4 = tg < 255 ? tg : 255;
                azul4 = tb < 255 ? tb : 255;

                Color colorSepia = new Color(rojo4, verde4, azul4);
                Sepia.setRGB(i, j, colorSepia.getRGB());
            }
        }
        //Para rojo
        NombreRojo = new File(NombreRojo).getName();
        ImageIO.write(Rojo, "jpg", new File("./Temp/Rojo_" + NombreRojo));

        //Para verde
        NombreVerde = new File(NombreVerde).getName();
        ImageIO.write(Verde, "jpg", new File("./Temp/Verde_" + NombreVerde));

        //Para azul
        NombreAzul = new File(NombreAzul).getName();
        ImageIO.write(Azul, "jpg", new File("./Temp/Azul_" + NombreAzul));

        //Para sepia
        NombreSepia = new File(NombreSepia).getName();
        ImageIO.write(Sepia, "jpg", new File("./Temp/Sepia_" + NombreSepia));
    }

}
