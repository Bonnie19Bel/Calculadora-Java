import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI {

    public static void main(String[] args) {

        // Criando a janela
        JFrame janela = new JFrame("Calculadora Java");

        janela.setSize(350, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        // Criando o painel principal
        JPanel painel = new JPanel();

        painel.setBackground(new Color(20, 20, 20));
        painel.setLayout(new BorderLayout());

        // Criando o título
        JLabel titulo = new JLabel(
            "CALCULADORA JAVA",
            SwingConstants.CENTER
        );

        titulo.setForeground(new Color(190, 120, 255));
        titulo.setFont(new Font("Arial", Font.BOLD, 22));

        // Adicionando o título ao painel
        painel.add(titulo, BorderLayout.NORTH);
        // Criando o visor
JTextField visor = new JTextField("0");

visor.setFont(new Font("Arial", Font.BOLD, 36));
visor.setForeground(Color.WHITE);
visor.setBackground(new Color(35, 35, 35));

visor.setHorizontalAlignment(SwingConstants.RIGHT);
visor.setEditable(false);

// Adicionando o visor ao painel
painel.add(visor, BorderLayout.CENTER);

        // Adicionando o painel à janela
        janela.setContentPane(painel);

        // Exibindo a janela
        janela.setVisible(true);
    }
}
