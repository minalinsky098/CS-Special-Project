import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main_Project {
    // Variables

    int QuestionNumber = 0;
    int TotalScore = 0;

    String QuestionsAnswers[][] = {{"The __________ states that an object at rest remains at rest, and an object in motion remains in motion at constant speed and in a straight line unless acted on by an unbalanced force. ",
    "Newton’s first law of motion"," Netwon’s Second law of motion","Newton’s Third law of motion","Newton’s Fourth law of motion"},
    {"Organisms that produce food for themselves and other organisms",
    "Consumers"," Producers","Food Makers","Primary Consumers"}};

    String Question;

    // Design and Fonts
    Border DefaultBorder = BorderFactory.createLineBorder(Color.black, 3); // Para ma dasig differenciate ang Objects
                                                                           // Remove lang sa Final
    Font TitleFont = new Font("Helvetica", Font.BOLD, 50);


    //Objects in StartFrame
    JFrame StartFrame = new JFrame("Starting Page");
    JPanel SFTitlePanel = new JPanel();
    JPanel SFCreatorPanel = new JPanel();
    JPanel SFButtonPanel = new JPanel();
    JLabel SFTitle = new JLabel("Insert name");
    JLabel SFCreator = new JLabel("Creators: Names");
    JButton SFButton = new JButton("Start Quiz");

    // Objects in QuizFrame
    JFrame QuizFrame = new JFrame("Quiz Frame");
    JPanel QFTitlePanel = new JPanel();
    JPanel QFQuestionPanel = new JPanel();
    JPanel QFButtonPanel = new JPanel();
    JLabel QuestionLabel = new JLabel(QuestionsAnswers[QuestionNumber][0]);
    JButton QFNextButton = new JButton("Next");
    JButton QFBackButton = new JButton("Back");

    ButtonGroup ChoiceGroup = new ButtonGroup();
    JRadioButton option1, option2, option3, option4;

    public Main_Project() {

        // Initializing Start Frame
        StartFrame.setVisible(true);
        StartFrame.setSize(1550, 825);
        StartFrame.setResizable(false);
        StartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StartFrame.setLayout(new GridLayout(3, 1));
        StartFrame.add(SFTitlePanel);
        StartFrame.add(SFCreatorPanel);
        StartFrame.add(SFButtonPanel);
        // JLabel in StartFrame
        SFTitle.setFont(TitleFont);
        SFTitle.setBorder(DefaultBorder);

        SFCreator.setFont(TitleFont);
        SFCreator.setBorder(DefaultBorder);
        // JPanels in StartFrame
        SFTitlePanel.setBorder(DefaultBorder);
        SFTitlePanel.add(SFTitle);

        SFCreatorPanel.setBorder(DefaultBorder);
        SFCreatorPanel.add(SFCreator);

        SFButtonPanel.setBorder(DefaultBorder);
        SFButtonPanel.add(SFButton);

        // JButtons in StartFrame
        SFButton.setFont(TitleFont);
        SFButton.setFocusable(false);
        Actions ButtonPressed = new Actions();
        SFButton.addActionListener(ButtonPressed);

        // Initializing QuizFrame
        QuizFrame.setSize(1550, 825);
        QuizFrame.setVisible(false);
        QuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        QuizFrame.add(QFTitlePanel);
        QuizFrame.add(QFQuestionPanel);
        QuizFrame.add(QFButtonPanel);
        QuizFrame.setLayout(null);

        // JRadioButton in QuestionFrame
        
/* 
        int numberOfOptions = 4;
        JRadioButton[] options = new JRadioButton[numberOfOptions];
        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton(QuestionsAnswers[QuestionNumber][i + 1]);
            options[i].setFocusable(false);
        }
 */

        option1 = new JRadioButton(QuestionsAnswers[QuestionNumber][1]);
        option2 = new JRadioButton(QuestionsAnswers[QuestionNumber][2]);
        option3 = new JRadioButton(QuestionsAnswers[QuestionNumber][3]);
        option4 = new JRadioButton(QuestionsAnswers[QuestionNumber][4]);
        option1.setFocusable(false);
        option2.setFocusable(false);
        option3.setFocusable(false);
        option4.setFocusable(false);

        ChoiceGroup.add(option1);
        ChoiceGroup.add(option2);
        ChoiceGroup.add(option3);
        ChoiceGroup.add(option4);

        // JPanels in QuestionFrame
        QFTitlePanel.setBorder(DefaultBorder);
        QFTitlePanel.setBounds(0, 0, 1550, 50);
        QFTitlePanel.add(new JLabel("Add Title"));

        QFQuestionPanel.setBorder(DefaultBorder);
        QFQuestionPanel.setLayout(new GridLayout(5, 1));
        QFQuestionPanel.setBounds(0, 50, 1550, 650);
        QFQuestionPanel.add(QuestionLabel);
        QFQuestionPanel.add(option1);
        QFQuestionPanel.add(option2);
        QFQuestionPanel.add(option3);
        QFQuestionPanel.add(option4);

        QFButtonPanel.setBorder(DefaultBorder);
        QFButtonPanel.setBounds(0, 700, 1550, 85);

        QFButtonPanel.add(QFBackButton);
        QFBackButton.setFocusable(false);
        QFBackButton.addActionListener(ButtonPressed);

        QFButtonPanel.add(QFNextButton);
        QFNextButton.setFocusable(false);
        QFNextButton.addActionListener(ButtonPressed);

    }

    public static void main(String args[]) {
        new Main_Project();
    }

    public class Actions implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == SFButton) {
                StartFrame.setVisible(false);
                QuizFrame.setVisible(true);
            }
            if (event.getSource() == QFBackButton) {
                QuestionNumber--;
                if(ChoiceGroup.isSelected(null)){
                    TotalScore--;
                }
                QuestionLabel.setText(QuestionsAnswers[QuestionNumber][0]);
                option1.setText(QuestionsAnswers[QuestionNumber][1]);
                option2.setText(QuestionsAnswers[QuestionNumber][2]);
                option3.setText(QuestionsAnswers[QuestionNumber][3]);
                option4.setText(QuestionsAnswers[QuestionNumber][4]);
                ChoiceGroup.clearSelection();
            }
            if(event.getSource() == QFNextButton){
                if(QuestionNumber == 0 && option1.isSelected()||QuestionNumber == 1 && option2.isSelected()){
                    TotalScore++;
                }
                if (QuestionNumber == QuestionsAnswers.length - 1) {
                    System.out.print(TotalScore);
                    System.exit(0);
                }
                QuestionNumber++;
                //This Snippet is designed to remove choices 3 and 4 in true false questions
                if(QuestionNumber == 2){
                    option3.setVisible(false);
                    option4.setVisible(false);
                }
                else{
                    option3.setVisible(true);
                    option4.setVisible(true);
                }
                QuestionLabel.setText(QuestionsAnswers[QuestionNumber][0]);
                option1.setText(QuestionsAnswers[QuestionNumber][1]);
                option2.setText(QuestionsAnswers[QuestionNumber][2]);
                option3.setText(QuestionsAnswers[QuestionNumber][3]);
                option4.setText(QuestionsAnswers[QuestionNumber][4]);
                ChoiceGroup.clearSelection();
            }
        }
    }
}