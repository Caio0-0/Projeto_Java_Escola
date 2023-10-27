package Layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import application.*;

public class AlunoGUI extends JFrame {
    private Aluno aluno;
    private List<Disciplina> disciplinasDisponiveis;
    private List<Disciplina> disciplinasMatriculadas;

    private JComboBox<String> disciplinasDisponiveisComboBox;
    private JComboBox<String> disciplinasMatriculadasComboBox;
    private JButton adicionarDisciplinaButton;
    private JButton removerDisciplinaButton;
    private JButton informacoesDisciplinaButton;
    private JButton verNotasButton;
    private JButton fazerAvaliacaoButton;

    public AlunoGUI(Aluno aluno) {
        this.aluno = aluno;
        disciplinasDisponiveis = new ArrayList<>();
        disciplinasMatriculadas = new ArrayList<>();

        setTitle("Sistema de Aluno");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Configura o JComboBox com as disciplinas disponíveis
        disciplinasDisponiveisComboBox = new JComboBox<>();
        for (Disciplina disciplina : getDisciplinasDisponiveis()) {
            disciplinasDisponiveisComboBox.addItem(disciplina.getNomeDisciplina());
        }
        add(disciplinasDisponiveisComboBox);

        // Configura o JComboBox com as disciplinas matriculadas (inicialmente vazio)
        disciplinasMatriculadasComboBox = new JComboBox<>();
        add(disciplinasMatriculadasComboBox);

        // Botão para adicionar disciplina
        adicionarDisciplinaButton = new JButton("Adicionar Disciplina");
        add(adicionarDisciplinaButton);
        adicionarDisciplinaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDisciplina = (String) disciplinasDisponiveisComboBox.getSelectedItem();
                if (selectedDisciplina != null) {
                    Disciplina disciplina = findDisciplinaByName(selectedDisciplina, getDisciplinasDisponiveis());
                    if (disciplina != null && !disciplinasMatriculadas.contains(disciplina)) {
                        // Verificar se a disciplina é Matemática ou Português
                        if (disciplina.getNomeDisciplina().equals("Matemática") || disciplina.getNomeDisciplina().equals("Português")) {
                            // Verificar se já há uma disciplina dessas matriculadas
                            boolean hasMathOrPortuguese = false;
                            for (Disciplina matriculada : disciplinasMatriculadas) {
                                if (matriculada.getNomeDisciplina().equals("Matemática") || matriculada.getNomeDisciplina().equals("Português")) {
                                    hasMathOrPortuguese = true;
                                    break;
                                }
                            }
                            if (hasMathOrPortuguese) {
                                JOptionPane.showMessageDialog(null, "Você já adicionou uma disciplina de Matemática ou Português.");
                            } else {
                                disciplinasMatriculadas.add(disciplina);
                                disciplinasDisponiveis.remove(disciplina);
                                updateComboBoxes();
                            }
                        } else {
                            disciplinasMatriculadas.add(disciplina);
                            disciplinasDisponiveis.remove(disciplina);
                            updateComboBoxes();
                        }
                    }
                }
            }
        });

        // Botão para remover disciplina
        removerDisciplinaButton = new JButton("Remover Disciplina");
        add(removerDisciplinaButton);
        removerDisciplinaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDisciplina = (String) disciplinasMatriculadasComboBox.getSelectedItem();
                if (selectedDisciplina != null) {
                    Disciplina disciplina = findDisciplinaByName(selectedDisciplina, getDisciplinasMatriculadas());
                    if (disciplina != null) {
                        disciplinasDisponiveis.add(disciplina);
                        disciplinasMatriculadas.remove(disciplina);
                        updateComboBoxes();
                    }
                }
            }
        });

        // Botão para exibir informações da disciplina
        informacoesDisciplinaButton = new JButton("Informações da Disciplina");
        add(informacoesDisciplinaButton);
        informacoesDisciplinaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDisciplina = (String) disciplinasMatriculadasComboBox.getSelectedItem();
                if (selectedDisciplina != null) {
                    Disciplina disciplina = findDisciplinaByName(selectedDisciplina, getDisciplinasMatriculadas());
                    if (disciplina != null) {
                        JOptionPane.showMessageDialog(null, "Informações da Disciplina:\n" +
                                "Nome: " + disciplina.getNomeDisciplina() + "\n" +
                                "Carga Horária: " + disciplina.getCargaHorario() + " horas\n" +
                                "Professor: " + disciplina.getNomeProfessor());
                    }
                }
            }
        });

        // Botão para ver notas da disciplina
        verNotasButton = new JButton("Ver Notas da Disciplina");
        add(verNotasButton);
        verNotasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDisciplina = (String) disciplinasMatriculadasComboBox.getSelectedItem();
                if (selectedDisciplina != null) {
                    Disciplina disciplina = findDisciplinaByName(selectedDisciplina, getDisciplinasMatriculadas());
                    if (disciplina != null) {
                        aluno.verNotasDiciplina(disciplina);
                    }
                }
            }
        });

        // Botão para realizar avaliação
        fazerAvaliacaoButton = new JButton("Fazer Avaliação");
        add(fazerAvaliacaoButton);
        fazerAvaliacaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDisciplina = (String) disciplinasMatriculadasComboBox.getSelectedItem();
                if (selectedDisciplina != null) {
                    Disciplina disciplina = findDisciplinaByName(selectedDisciplina, getDisciplinasMatriculadas());
                    if (disciplina != null) {
                        double nota = aluno.realizarAvaliacao(disciplina);
                        JOptionPane.showMessageDialog(null, "Avaliação realizada. Nota: " + nota);
                    }
                }
            }
        });

        setVisible(true);
    }

    private List<Disciplina> getDisciplinasDisponiveis() {
        // Aqui você deve fornecer uma lista de todas as disciplinas disponíveis.
        // Por exemplo:
        Professor professor = new Professor("Doido do grau", 20, "Rua A", "123456789", "01/01/2000", "M123", "senha123", 12313, 10, "42342", 12);
        Disciplina disciplina1 = new Disciplina("Matemática", professor, 30);
        Disciplina disciplina2 = new Disciplina("Portugues", professor, 30);
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        return disciplinas;
    }

    private void updateComboBoxes() {
        disciplinasDisponiveisComboBox.removeAllItems();
        disciplinasMatriculadasComboBox.removeAllItems();

        for (Disciplina disciplina : getDisciplinasDisponiveis()) {
            disciplinasDisponiveisComboBox.addItem(disciplina.getNomeDisciplina());
        }

        for (Disciplina disciplina : getDisciplinasMatriculadas()) {
            disciplinasMatriculadasComboBox.addItem(disciplina.getNomeDisciplina());
        }
    }

    private Disciplina findDisciplinaByName(String name, List<Disciplina> disciplinas) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNomeDisciplina().equals(name)) {
                return disciplina;
            }
        }
        return null;
    }

    private List<Disciplina> getDisciplinasMatriculadas() {
        // Retorne a lista de disciplinas matriculadas pelo aluno.
        return disciplinasMatriculadas;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("jose", 20, "Endereço do Aluno", "1234567890", "01/01/2000", "MAT123", "senha");

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AlunoGUI(aluno);
            }
        });
    }
}
