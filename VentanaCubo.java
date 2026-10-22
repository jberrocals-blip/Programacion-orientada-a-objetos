

package punto83;

import javax.swing.*;
import java.awt.*;

public class VentanaCubo extends JFrame {

    private JTextField campoLado;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    public VentanaCubo() {
        setTitle("Calcular cubo");
        setSize(520, 270);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenido = new JPanel(new BorderLayout(10, 10));
        contenido.setBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12));

        // Imagen del cubo
        PanelFigura dibujo = new PanelFigura("cubo");
        contenido.add(dibujo, BorderLayout.WEST);

        // Formulario
        JPanel formulario = new JPanel(new GridLayout(4, 2, 8, 8));

        campoLado = new JTextField();
        resultadoVolumen = new JLabel("-");
        resultadoSuperficie = new JLabel("-");

        formulario.add(new JLabel("Lado (cm):"));
        formulario.add(campoLado);

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
            double lado = Double.parseDouble(
                    campoLado.getText().trim().replace(',', '.'));

            if (!Double.isFinite(lado) || lado <= 0) {
                throw new NumberFormatException();
            }

            Cubo cubo = new Cubo(lado);

            resultadoVolumen.setText(
                    String.format("%.4f", cubo.getVolumen()));

            resultadoSuperficie.setText(
                    String.format("%.4f", cubo.getSuperficie()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingresa un lado numerico mayor que cero.",
                    "Dato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        campoLado.setText("");
        resultadoVolumen.setText("-");
        resultadoSuperficie.setText("-");
    }
}
