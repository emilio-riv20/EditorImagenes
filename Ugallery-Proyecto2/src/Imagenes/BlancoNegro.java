package Imagenes;

import java.awt.Color;

public class BlancoNegro extends NodoColores {

    public BlancoNegro(String filename) {
        super(filename);
    }

    @Override
    public void repintar(int i, int j, Color color) {
        int promedio = (color.getBlue() + color.getGreen() + color.getRed()) / 3;
        Color NewColor = new Color(promedio, promedio, promedio);
        bmp.setRGB(i, j, NewColor.getRGB());
    }

}
