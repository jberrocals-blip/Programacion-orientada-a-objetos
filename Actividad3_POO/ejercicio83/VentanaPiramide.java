

package punto83;

import javax.swing.*;
import java.awt.*;

public class VentanaPiramide extends JFrame {

    private JTextField campoBase;
    private JTextField campoAltura;
    private JTextField campoApotema;
    private JLabel resultadoVolumen;
    private JLabel resultadoSuperficie;

    public VentanaPiramide() {
        setTitle("Calcular piramide");
        setSize(580, 330);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenido = new JPanel(new BorderLayout(10, 10));
        contenido.setBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12));

        // Imagen de la piramide
        PanelFigura dibujo = new PanelFigura("piramide");
        contenido.add(dibujo, BorderLayout.WEST);

        // Formulario
        JPanel formulario = new JPanel(new GridLayout(6, 2, 8, 8));

        campoBase = new JTextField();
        campoAltura = new JTextField();
        campoApotema = new JTextField();

        resultadoVolumen = new JLabel("-");
        resultadoSuperficie = new JLabel("-");

        formulario.add(new JLabel("Lado de la base (cm):"));
        formulario.add(campoBase);

        formulario.add(new JLabel("Altura (cm):"));
        formulario.add(campoAltura);

        formulario.add(new JLabel("Apotema (cm):"));
        formulario.add(campoApotema);

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
            double base = Double.parseDouble(
                    campoBase.getText().trim().replace(',', '.'));

            double altura = Double.parseDouble(
                    campoAltura.getText().trim().replace(',', '.'));

            double apotema = Double.parseDouble(
                    campoApotema.getText().trim().replace(',', '.'));

            if (!Double.isFinite(base)
                    || !Double.isFinite(altura)
                    || !Double.isFinite(apotema)
                    || base <= 0 || altura <= 0 || apotema <= 0) {
                throw new NumberFormatException();
            }

            // Comprobar que las dimensiones sean compatibles
            // con una piramide regular de base cuadrada
            double apotemaEsperada = Math.sqrt(
                    altura * altura + Math.pow(base / 2.0, 2));

            if (Math.abs(apotema - apotemaEsperada)
                    > 0.01 * apotemaEsperada) {
                JOptionPane.showMessageDialog(this,
                        "La apotema no corresponde a la altura "
                        + "y al lado de la base.",
                        "Dimensiones incompatibles",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            Piramide piramide = new Piramide(base, altura, apotema);

            resultadoVolumen.setText(
                    String.format("%.4f", piramide.getVolumen()));

            resultadoSuperficie.setText(
                    String.format("%.4f", piramide.getSuperficie()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingresa valores numericos mayores que cero.",
                    "Dato incorrecto",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        campoBase.setText("");
        campoAltura.setText("");
        campoApotema.setText("");

        resultadoVolumen.setText("-");
        resultadoSuperficie.setText("-");
    }
}
