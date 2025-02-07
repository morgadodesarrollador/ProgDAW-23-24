import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm extends JFrame {

    public SimpleForm() {
        // Configuración de la ventana principal
        setTitle("Formulario de Datos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // Grid de 4 filas y 2 columnas

        // Crear etiquetas y campos de entrada
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Edad:");
        JTextField ageField = new JTextField();

        JLabel emailLabel = new JLabel("Correo Electrónico:");
        JTextField emailField = new JTextField();

        // Botón para enviar
        JButton submitButton = new JButton("Enviar");

        // Añadir componentes al panel
        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(ageLabel);
        panel.add(ageField);

        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(new JLabel()); // Espacio vacío
        panel.add(submitButton);

        // Añadir el panel a la ventana
        add(panel);

        // Manejar el evento del botón
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capturar los datos ingresados
                String name = nameField.getText();
                String age = ageField.getText();
                String email = emailField.getText();

                // Mostrar los datos en un cuadro de diálogo
                JOptionPane.showMessageDialog(
                        SimpleForm.this,
                        "Datos ingresados:\n" +
                                "Nombre: " + name + "\n" +
                                "Edad: " + age + "\n" +
                                "Correo: " + email,
                        "Datos del Formulario",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutar el formulario
        SwingUtilities.invokeLater(() -> {
            SimpleForm form = new SimpleForm();
            form.setVisible(true);
        });
    }
}