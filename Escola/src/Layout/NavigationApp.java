package Layout;

import application.Aluno;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavigationApp {
    private JFrame frame;
    private JTabbedPane tabbedPane;
    private JPanel loginPanel;
    private JTextField matriculaField;
    private JButton loginButton;
    private JPanel alunoPanel;
    private JLabel infoLabel;

    private Aluno aluno;

    public NavigationApp() {
        frame = new JFrame("Sistema de Navegação");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        tabbedPane = new JTabbedPane();

        // Página de Login
        loginPanel = new JPanel();
        loginPanel.setLayout(null);

        JLabel matriculaLabel = new JLabel("Matrícula:");
        matriculaLabel.setBounds(10, 10, 80, 25);
        loginPanel.add(matriculaLabel);

        matriculaField = new JTextField();
        matriculaField.setBounds(100, 10, 150, 25);
        loginPanel.add(matriculaField);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 45, 100, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String matricula = matriculaField.getText();
                // Realize a autenticação e obtenha os dados do aluno com base na matrícula
                // Neste exemplo, vamos criar um aluno fictício para fins de demonstração
                aluno = new Aluno("João", 20, "Silva", "Rua A", "123456789", "01/01/2000", matricula, 2, "A");
                showAlunoPage();
            }
        });
        loginPanel.add(loginButton);

        // Página do Aluno
        alunoPanel = new JPanel();
        alunoPanel.setLayout(null);

        infoLabel = new JLabel("Informações do Aluno:");
        infoLabel.setBounds(10, 10, 300, 25);
        alunoPanel.add(infoLabel);

        tabbedPane.add("Login", loginPanel);
        tabbedPane.add("Aluno", alunoPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    private void showAlunoPage() {
        // Exibir informações do aluno na página do Aluno
        String info = "Nome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade() + "\nEndereço: " + aluno.getEndereco();
        infoLabel.setText(info);
        tabbedPane.setSelectedIndex(1); // Alterna para a página do Aluno
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NavigationApp();
            }
        });
    }
}