
package punto83;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JButton botonCilindro;
    private JButton botonEsfera;
    private JButton botonPiramide;
    private JButton botonCubo;
    private JButton botonPrisma;

    public VentanaPrincipal() {
        setTitle("Figuras geometricas");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel titulo = new JLabel(
                "Selecciona una figura geometrica",
                SwingConstants.CENTER
        );

        JPanel panelBotones = new JPanel(new GridLayout(5, 1, 8, 8));
        panelBotones.setBorder(
                BorderFactory.createEmptyBorder(10, 30, 15, 30)
        );

        botonCilindro = new JButton("Cilindro");
        botonEsfera = new JButton("Esfera");
        botonPiramide = new JButton("Piramide");
        botonCubo = new JButton("Cubo");
        botonPrisma = new JButton("Prisma");

        panelBotones.add(botonCilindro);
        panelBotones.add(botonEsfera);
        panelBotones.add(botonPiramide);
        panelBotones.add(botonCubo);
        panelBotones.add(botonPrisma);

        add(titulo, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);

        botonCilindro.addActionListener(e -> {
            new VentanaCilindro().setVisible(true);
        });

        botonEsfera.addActionListener(e -> {
            new VentanaEsfera().setVisible(true);
        });

        botonPiramide.addActionListener(e -> {
            new VentanaPiramide().setVisible(true);
        });

        botonCubo.addActionListener(e -> {
            new VentanaCubo().setVisible(true);
        });

        botonPrisma.addActionListener(e -> {
            new VentanaPrisma().setVisible(true);
        });
    }
}
