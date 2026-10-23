

package punto83;

import javax.swing.*;
import java.awt.*;

public class VentanaPrisma extends JFrame {

    private JTextField campoLargo;
    private JTextField campoAncho;
    private JTextField campoAltura;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    public VentanaPrisma() {
        setTitle("Calcular prisma rectangular");
        setSize(580, 310);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenido = new JPanel(new BorderLayout(10, 10));
        contenido.setBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12));

        // Imagen del prisma rectangular
        PanelFigura dibujo = new PanelFigura("prisma");
        contenido.add(dibujo, BorderLayout.WEST);

        // Formulario
        JPanel formulario = new JPanel(new GridLayout(6, 2, 8, 8));

        campoLargo = new JTextField();
        campoAncho = new JTextField();
        campoAltura = new JTextField();

        resultadoVolumen = new JLabel("-");
        resultadoSuperficie = new JLabel("-");

        formulario.add(new JLabel("Largo (cm):"));
        formulario.add(campoLargo);

        formulario.add(new JLabel("Ancho (cm):"));
        formulario.add(campoAncho);

        formulario.add(new JLabel("Altura (cm):"));
        formulario.add(campoAltura);

        JButton calcular = new JButton("Calcular");
        JButton limpiar = new JButton("Limpiar");

        formulario.add(calcular);
        formulario.add(limpiar);

        formulario.add(new JLabel("Volumen (cm³):"));
        formulario.add(resultadoVolumen);

        formulario.add(new JLabel("Superficie (cm²):"));
        formulario.add(resultadoSuperficie);

        contenido.add(formulario, BorderLayout.CENTER);
        add(contenido);

        calcular.addActionListener(e -> calcular());
        limpiar.addActionListener(e -> limpiar());
    }

    private void calcular() {
        try {
            double largo = Double.parseDouble(
                    campoLargo.getText().trim().replace(',', '.'));

            double ancho = Double.parseDouble(
                    campoAncho.getText().trim().replace(',', '.'));

            double altura = Double.parseDouble(
                    campoAltura.getText().trim().replace(',', '.'));

            if (!Double.isFinite(largo)
                    || !Double.isFinite(ancho)
                    || !Double.isFinite(altura)
                    || largo <= 0 || ancho <= 0 || altura <= 0) {
                throw new NumberFormatException();
            }

            Prisma prisma = new Prisma(largo, ancho, altura);

            resultadoVolumen.setText(
                    String.format("%.4f", prisma.getVolumen()));

            resultadoSuperficie.setText(
                    String.format("%.4f", prisma.getSuperficie()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingresa valores numericos mayores que cero.",
                    "Dato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        campoLargo.setText("");
        campoAncho.setText("");
        campoAltura.setText("");

        resultadoVolumen.setText("-");
        resultadoSuperficie.setText("-");
    }
}
