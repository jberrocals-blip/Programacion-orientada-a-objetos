
package punto82;

import javax.swing.*;
import java.awt.*;

public class VentanaNotas extends JFrame {

    private JTextField[] camposNotas;
    private JTextArea resultados;

    public VentanaNotas() {
        setTitle("Punto 8.2 - Analisis de notas");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        camposNotas = new JTextField[5];

        for (int i = 0; i < 5; i++) {
            panel.add(new JLabel("Nota del estudiante " + (i + 1) + ":"));
            camposNotas[i] = new JTextField();
            panel.add(camposNotas[i]);
        }

        JButton botonCalcular = new JButton("Calcular");
        panel.add(botonCalcular);

        JButton botonLimpiar = new JButton("Limpiar");
        panel.add(botonLimpiar);

        resultados = new JTextArea(5, 25);
        resultados.setEditable(false);
        resultados.setFont(new Font("Arial", Font.PLAIN, 14));

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultados), BorderLayout.CENTER);

        botonCalcular.addActionListener(e -> calcularNotas());
        botonLimpiar.addActionListener(e -> limpiarCampos());
    }

    private void calcularNotas() {
        double[] notas = new double[5];

        try {
            for (int i = 0; i < 5; i++) {
                String texto = camposNotas[i].getText().trim();

                if (texto.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Debes ingresar las cinco notas.",
                            "Dato faltante",
                            JOptionPane.WARNING_MESSAGE
                    );
                    camposNotas[i].requestFocus();
                    return;
                }

                notas[i] = Double.parseDouble(texto);

                if (notas[i] < 0 || notas[i] > 5) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Las notas deben estar entre 0 y 5.",
                            "Nota no valida",
                            JOptionPane.WARNING_MESSAGE
                    );
                    camposNotas[i].requestFocus();
                    return;
                }
            }

            Notas calculo = new Notas(notas);

            resultados.setText(
                    String.format(
                            "Promedio: %.2f%n"
                            + "Desviacion estandar: %.2f%n"
                            + "Nota mayor: %.2f%n"
                            + "Nota menor: %.2f",
                            calculo.calcularPromedio(),
                            calculo.calcularDesviacionEstandar(),
                            calculo.calcularMayor(),
                            calculo.calcularMenor()
                    )
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Todas las notas deben ser numeros validos.",
                    "Error de entrada",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void limpiarCampos() {
        for (int i = 0; i < 5; i++) {
            camposNotas[i].setText("");
        }

        resultados.setText("");
        camposNotas[0].requestFocus();
    }
}
