

package punto83;

import javax.swing.*;
import java.awt.*;

public class VentanaEsfera extends JFrame {

    private JTextField campoRadio;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    public VentanaEsfera() {
        setTitle("Calcular esfera");
        setSize(520, 270);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenido = new JPanel(new BorderLayout(10, 10));
        contenido.setBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12));

        // Imagen de la esfera
        PanelFigura dibujo = new PanelFigura("esfera");
        contenido.add(dibujo, BorderLayout.WEST);

        // Formulario
        JPanel formulario = new JPanel(new GridLayout(4, 2, 8, 8));

        campoRadio = new JTextField();
        resultadoVolumen = new JLabel("-");
        resultadoSuperficie = new JLabel("-");

        formulario.add(new JLabel("Radio (cm):"));
        formulario.add(campoRadio);

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
            double radio = Double.parseDouble(
                    campoRadio.getText().trim().replace(',', '.'));

            if (!Double.isFinite(radio) || radio <= 0) {
                throw new NumberFormatException();
            }

            Esfera esfera = new Esfera(radio);

            resultadoVolumen.setText(
                    String.format("%.4f", esfera.getVolumen()));

            resultadoSuperficie.setText(
                    String.format("%.4f", esfera.getSuperficie()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingresa un radio numerico mayor que cero.",
                    "Dato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        campoRadio.setText("");
        resultadoVolumen.setText("-");
        resultadoSuperficie.setText("-");
    }
}
