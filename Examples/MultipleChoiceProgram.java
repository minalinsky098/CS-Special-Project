package Examples;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MultipleChoiceProgram extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private JButton submitButton;
    private int score = 0;
    private int questionNumber = 0;

    private String[][] questions = {
            { 
                "Who is the considered as the father of Computers?", 
                    "Charles Darwin", 
                    "Charles Babbage", 
                    "Charlie Brown",
                    "Charlie Chaplain"
            },

            { 
                "What is the largest planet in our solar system?", 
                    "Saturn", 
                    "Uranus", 
                    "Neptune", 
                    "Jupiter" 
            },

            { 
                "What does XP stand for in Windows XP", 
                    "eXtra Power", 
                    "eXPerience", 
                    "X Program", 
                    "eXtensive Power" 
            },

            { 
                "What does WIFI stand for?", 
                    "Wireless Finnish", 
                    "Wonderful Finality", 
                    "Wireless Fidelity",
                    "Winner Finality" 
            }
    };

    public MultipleChoiceProgram() {
        setTitle("Multiple Choice Quiz");
        setSize(800, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel questionPanel = new JPanel();
        questionPanel.setLayout(new GridLayout(5, 1));
        questionLabel = new JLabel(questions[0][0]);
        questionPanel.add(questionLabel);
        option1 = new JRadioButton(questions[0][1]);
        option2 = new JRadioButton(questions[0][2]);
        option3 = new JRadioButton(questions[0][3]);
        option4 = new JRadioButton(questions[0][4]);
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        questionPanel.add(option1);
        questionPanel.add(option2);
        questionPanel.add(option3);
        questionPanel.add(option4);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(questionPanel, BorderLayout.CENTER);
        contentPane.add(submitButton, BorderLayout.SOUTH);

        setContentPane(contentPane);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if ((questionNumber == 0 && option2.isSelected()) || 
            (questionNumber == 1 && option4.isSelected()) || 
            (questionNumber == 2 && option2.isSelected()) || 
            (questionNumber == 3 && option3.isSelected())) {
            score++;
        } questionNumber++;

        if (questionNumber == questions.length) {
            JOptionPane.showMessageDialog(this, "Your score is " + score + " out of " + questions.length);
            System.exit(0);
        }

        questionLabel.setText(questions[questionNumber][0]);
        option1.setText(questions[questionNumber][1]);
        option2.setText(questions[questionNumber][2]);
        option3.setText(questions[questionNumber][3]);
        option4.setText(questions[questionNumber][4]);
    }

    public static void main(String[] args) {
        new MultipleChoiceProgram();
    }
}