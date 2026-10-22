

package punto83;

import javax.swing.*;
import java.awt.*;

public class VentanaCilindro extends JFrame {

    private JTextField campoRadio;
    private JTextField campoAltura;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    public VentanaCilindro() {
        setTitle("Calcular cilindro");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenido = new JPanel(new BorderLayout(10, 10));
        contenido.setBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12));

        // Imagen del cilindro
        PanelFigura dibujo = new PanelFigura("cilindro");
        contenido.add(dibujo, BorderLayout.WEST);

        // Formulario
        JPanel formulario = new JPanel(new GridLayout(5, 2, 8, 8));

        campoRadio = new JTextField();
        campoAltura = new JTextField();
        resultadoVolumen = new JLabel("-");
        resultadoSuperficie = new JLabel("-");

        formulario.add(new JLabel("Radio (cm):"));
        formulario.add(campoRadio);

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
            double radio = Double.parseDouble(
                    campoRadio.getText().trim().replace(',', '.'));

            double altura = Double.parseDouble(
                    campoAltura.getText().trim().replace(',', '.'));

            if (!Double.isFinite(radio) || !Double.isFinite(altura)
                    || radio <= 0 || altura <= 0) {
                throw new NumberFormatException();
            }

            Cilindro cilindro = new Cilindro(radio, altura);

            resultadoVolumen.setText(
                    String.format("%.4f", cilindro.getVolumen()));

            resultadoSuperficie.setText(
                    String.format("%.4f", cilindro.getSuperficie()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingresa valores numericos mayores que cero.",
                    "Dato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        campoRadio.setText("");
        campoAltura.setText("");
        resultadoVolumen.setText("-");
        resultadoSuperficie.setText("-");
    }
}
