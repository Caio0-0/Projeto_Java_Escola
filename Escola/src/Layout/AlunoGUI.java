package Layout;
import application.Aluno; 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AlunoGUI {
    private JFrame frame;
    private JTextField notaField;
   
    private JButton calcularMediaButton;
    private JTextField disciplinaField;
    private JButton adicionarDisciplinaButton;
    private JButton removerDisciplinaButton;
    private JList<String> disciplinaList;
    private JButton fazerAvaliacaoButton;
    private JTextArea outputArea;

    private Aluno aluno;
    private DefaultListModel<String> disciplinaListModel;

    public AlunoGUI(Aluno aluno) {
        this.aluno = aluno;
        disciplinaListModel = new DefaultListModel<>();

        frame = new JFrame("Aluno GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(null);

        notaField = new JTextField();
 

  
        
        disciplinaField = new JTextField();
        disciplinaField.setBounds(20, 10, 100, 25);

        adicionarDisciplinaButton = new JButton("Adicionar Disciplina");
        adicionarDisciplinaButton.setBounds(120, 10, 150, 25);
        adicionarDisciplinaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String disciplina = disciplinaField.getText();
                aluno.setDisciplina(disciplina);
                disciplinaListModel.addElement(disciplina);
                disciplinaField.setText("");
            }
        });

        removerDisciplinaButton = new JButton("Remover Disciplina");
        removerDisciplinaButton.setBounds(20, 50, 260, 25);
        removerDisciplinaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = disciplinaList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String disciplina = disciplinaListModel.getElementAt(selectedIndex);
                    aluno.removeDisciplina(disciplina);
                    disciplinaListModel.remove(selectedIndex);
                }
            }
        });

        disciplinaList = new JList<>(disciplinaListModel);
        JScrollPane scrollPane = new JScrollPane(disciplinaList);
        scrollPane.setBounds(20, 75, 260, 100);

        fazerAvaliacaoButton = new JButton("Fazer Avaliação");
        fazerAvaliacaoButton.setBounds(20, 210, 260, 25);
        fazerAvaliacaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                double nota = random.nextDouble() * 10;
                aluno.realizarAv(nota);
                outputArea.append("Avaliação: " + nota + "\n");
            }
        });

        
        
        calcularMediaButton = new JButton("Calcular Média");
        calcularMediaButton.setBounds(20, 240, 260, 25);
        calcularMediaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double media = aluno.calcularMedia();
                outputArea.append("Média: " + media + "\n");
            }
        });
        
        outputArea = new JTextArea();
        outputArea.setBounds(20, 280, 260, 70);
        outputArea.setEditable(false);

        frame.add(notaField);

      
        frame.add(calcularMediaButton);
        frame.add(disciplinaField);
        frame.add(adicionarDisciplinaButton);
        frame.add(removerDisciplinaButton);
        frame.add(scrollPane);
        frame.add(fazerAvaliacaoButton);
        frame.add(outputArea);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "Silva", "Rua A", "123456789", "01/01/2000", "2023001", 2, "A");
        new AlunoGUI(aluno);
    }
}
