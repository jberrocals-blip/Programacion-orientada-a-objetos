
package punto83;

import javax.swing.*;
import java.awt.*;

public class PanelFigura extends JPanel {

    private final String figura;

    public PanelFigura(String figura) {
        this.figura = figura.toLowerCase();
        setPreferredSize(new Dimension(180, 160));
        setMinimumSize(new Dimension(140, 120));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        int w = getWidth();
        int h = getHeight();
        g2.translate(w / 2, h / 2);

        switch (figura) {
            case "cilindro":
                dibujarCilindro(g2);
                break;
            case "esfera":
                dibujarEsfera(g2);
                break;
            case "piramide":
                dibujarPiramide(g2);
                break;
            case "cubo":
                dibujarCubo(g2);
                break;
            case "prisma":
                dibujarPrisma(g2);
                break;
        }

        g2.dispose();
    }

    private void dibujarCilindro(Graphics2D g) {
        g.setColor(new Color(80, 170, 240));
        g.fillRect(-42, -35, 84, 80);
        g.fillOval(-42, -55, 84, 35);
        g.fillOval(-42, 27, 84, 35);

        g.setColor(Color.BLACK);
        g.drawLine(-42, -38, -42, 43);
        g.drawLine(42, -38, 42, 43);
        g.drawOval(-42, -55, 84, 35);
        g.drawArc(-42, 27, 84, 35, 180, 180);
        g.drawArc(-42, 27, 84, 35, 0, 180);
    }

    private void dibujarEsfera(Graphics2D g) {
        g.setColor(new Color(235, 75, 75));
        g.fillOval(-48, -48, 96, 96);

        g.setColor(new Color(150, 25, 25));
        g.drawOval(-48, -48, 96, 96);
        g.drawOval(-48, -15, 96, 30);
        g.drawArc(-48, -15, 96, 30, 0, 180);

        g.setColor(new Color(255, 180, 180));
        g.fillOval(-25, -30, 25, 20);
    }

    
private void dibujarPiramide(Graphics2D g) {

  
    int[] x = {0, -55, 0, 55};
    int[] y = {-58, 22, 48, 22};

  
    Polygon caraIzquierda = new Polygon(
            new int[]{x[0], x[1], x[2]},
            new int[]{y[0], y[1], y[2]}, 3);

   
    Polygon caraDerecha = new Polygon(
            new int[]{x[0], x[2], x[3]},
            new int[]{y[0], y[2], y[3]}, 3);

   
    Polygon base = new Polygon(
            new int[]{x[1], x[2], x[3], 0},
            new int[]{y[1], y[2], y[3], 48}, 4);

    g.setColor(new Color(190, 140, 240));
    g.fillPolygon(caraIzquierda);

    g.setColor(new Color(155, 95, 220));
    g.fillPolygon(caraDerecha);

    g.setColor(new Color(215, 185, 250));
    g.fillPolygon(base);

    g.setColor(Color.BLACK);
    g.setStroke(new BasicStroke(1.5f));

    g.drawPolygon(caraIzquierda);
    g.drawPolygon(caraDerecha);
    g.drawPolygon(base);

    
    g.drawLine(0, -58, -55, 22);
    g.drawLine(0, -58, 0, 48);
    g.drawLine(0, -58, 55, 22);
}


    private void dibujarCubo(Graphics2D g) {
        Polygon superior = new Polygon(
                new int[]{-40, -10, 40, 10},
                new int[]{-25, -50, -25, 0}, 4);

        Polygon lateral = new Polygon(
                new int[]{10, 40, 40, 10},
                new int[]{0, -25, 30, 55}, 4);

        Polygon frontal = new Polygon(
                new int[]{-40, 10, 10, -40},
                new int[]{-25, 0, 55, 30}, 4);

        g.setColor(new Color(130, 225, 130));
        g.fillPolygon(frontal);
        g.setColor(new Color(65, 180, 75));
        g.fillPolygon(lateral);
        g.setColor(new Color(170, 245, 160));
        g.fillPolygon(superior);

        g.setColor(Color.BLACK);
        g.drawPolygon(frontal);
        g.drawPolygon(lateral);
        g.drawPolygon(superior);
    }

    private void dibujarPrisma(Graphics2D g) {
        Polygon superior = new Polygon(
                new int[]{-55, -20, 55, 20},
                new int[]{-15, -40, -40, -15}, 4);

        Polygon lateral = new Polygon(
                new int[]{20, 55, 55, 20},
                new int[]{-15, -40, 25, 50}, 4);

        Polygon frontal = new Polygon(
                new int[]{-55, 20, 20, -55},
                new int[]{-15, -15, 50, 50}, 4);

        g.setColor(new Color(255, 190, 65));
        g.fillPolygon(frontal);
        g.setColor(new Color(230, 145, 20));
        g.fillPolygon(lateral);
        g.setColor(new Color(255, 215, 110));
        g.fillPolygon(superior);

        g.setColor(Color.BLACK);
        g.drawPolygon(frontal);
        g.drawPolygon(lateral);
        g.drawPolygon(superior);
    }

    public static Icon crearIcono(String figura) {
        return new Icon() {
            @Override
            public int getIconWidth() {
                return 45;
            }

            @Override
            public int getIconHeight() {
                return 45;
            }

            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.translate(x + 22, y + 22);
                g2.scale(0.38, 0.38);

                PanelFigura dibujo = new PanelFigura(figura);
                dibujo.setSize(120, 120);
                dibujo.paint(g2);

                g2.dispose();
            }
        };
    }
}
