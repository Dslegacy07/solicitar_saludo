import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class SaludoApp extends JFrame {

    public SaludoApp() {
        setTitle("Saludo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(24, 24, 24, 24));

        JLabel titulo = new JLabel("Pulsa el botón para solicitar un saludo", JLabel.CENTER);
        titulo.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton boton = new JButton("Solicitar saludo");
        boton.setFont(new Font("SansSerif", Font.BOLD, 16));
        boton.addActionListener(e -> solicitarSaludo());

        panel.add(titulo, BorderLayout.CENTER);
        panel.add(boton, BorderLayout.SOUTH);
        add(panel);
    }

    private void solicitarSaludo() {
        JPanel formulario = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.anchor = GridBagConstraints.WEST;

        JTextField campoNombre = new JTextField(18);
        JSpinner campoEdad = new JSpinner(new SpinnerNumberModel(18, 0, 120, 1));
        JRadioButton am = new JRadioButton("AM");
        JRadioButton pm = new JRadioButton("PM");
        ButtonGroup grupoHora = new ButtonGroup();
        grupoHora.add(am);
        grupoHora.add(pm);
        am.setSelected(true);

        JPanel panelHora = new JPanel();
        panelHora.add(am);
        panelHora.add(pm);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formulario.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        formulario.add(campoNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formulario.add(new JLabel("Edad:"), gbc);
        gbc.gridx = 1;
        formulario.add(campoEdad, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formulario.add(new JLabel("Hora:"), gbc);
        gbc.gridx = 1;
        formulario.add(panelHora, gbc);

        int opcion = JOptionPane.showConfirmDialog(
                this,
                formulario,
                "Ingresa tus datos",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (opcion != JOptionPane.OK_OPTION) {
            return;
        }

        String nombre = campoNombre.getText().trim();
        int edad = (Integer) campoEdad.getValue();
        boolean esAm = am.isSelected();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Debes ingresar un nombre.",
                    "Dato faltante",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        String momento = esAm ? "Buenos días" : "Buenas tardes";
        String mensaje = momento + ", " + nombre + ". Tienes " + edad + " años.";

        JOptionPane.showMessageDialog(
                this,
                mensaje,
                "Saludo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SaludoApp app = new SaludoApp();
            app.setVisible(true);
        });
    }
}
