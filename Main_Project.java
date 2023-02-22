import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Main_Project {
        // Variables

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int QuestionNumber = 0;
        int TotalScore = 0;


        JLabel gif = new JLabel();

        // Questions add lang questions no need na i change parameters
        String QuestionsAnswers[][] = {
                        // Questions 1-10
                        /* 0 */ { "How many bones does a shark have?", "0", "206", "315", "272" },
                        /* 1 */ { "Organisms that produce food for themselves and other organisms.", "Consumers",
                                        " Producers",
                                        "Food Makers", "Primary Consumers" },
                        /* 2 */ { "The Earth is round.", "True", "False", " ", " " },
                        /* 3 */ { "Which of the following materials conducts heat the fastest?", "Aluminum", "Iron",
                                        "Copper",
                                        "Steel" },
                        /* 4 */ { "In what layer of the atmosphere is the ozone layer located?", "Mesosphere",
                                        "Troposphere",
                                        "Stratosphere", "Thermosphere" },
                        /* 5 */ { "How many bones are there in the human body?", "208", "210", "206", "204" },
                        /* 6 */ { "H2SO4 is the chemical formula of which acid?", "Sulfuric acid", "Hydrochloric acid",
                                        "Nitric acid", "Phosphoric acid" },
                        /* 7 */ { "Which element is liquid at room temperature?", "Iron", "Mercury", "Calcium",
                                        "Beryllium" },
                        /* 8 */ { "What is a group of cats called?", "Clowder", "Kennel", "Pack", "Flock" },
                        /* 9 */ { "What animal has the strongest bite?", "Shark", "Crocodile", "Piranha",
                                        "Hippopotamus" },
                        // Questions 11-20
                        /* 10 */{ "What is the closest living creature to a T-Rex?", "Lizard", "Komodo Dragon", "Gecko",
                                        "Chicken" },
                        /* 11 */{ "How many legs does a lobster have?", "10", "8", "6", "12" },
                        /* 12 */{ "What is the most important element of the nuclear bomb?", "Kryptonite", "Uranium",
                                        "Thallium",
                                        "Palladium" },
                        /* 13 */{ "How many approximate days our moon takes to complete the orbit on Earth?", "15",
                                        "60", "30",
                                        "20" },
                        /* 14 */{ "Name the green pigment in plants which also helps in absorbing sunlight.",
                                        "Chlorophyll",
                                        "Leaves", "Carotenoids", "Cytoplasm" },
                        /* 15 */{ "Which place is no longer considered a planet?", "Venus", "Mercury", "Uranus",
                                        "Pluto" },
                        /* 16 */{ "What is the name of the galaxy that contains our solar system?", "Andromeda",
                                        "Orion",
                                        "Magellanic Clouds", "Milky Way" },
                        /* 17 */{ "What is the chemical formula of water?", "O2", "NH3", "H2O", "CO2" },
                        /* 18 */{ "Which pigment determines the color of the skin?", "Melanin", "Hemoglobin", "Plasma",
                                        "Genes" },
                        /* 19 */{ "Which side of the brain controls the left side of the human body?",
                                        "Right hemisphere",
                                        "Left hemisphere" },
                        // Questions 21-30
                        /* 20 */{ "When a meteoroid survives a trip through the atmosphere and hits the ground, it is called?",
                                        "Asteroid", "Meteor", "Meteorite", "Meteoroid" },
                        /* 21 */{ "How many hours does it take for the Earth to rotate?", "48", "12", "36", "24" },
                        /* 22 */{ "What if the softest mineral found on Earth?", "Gypsum", "Calcite", "Fluorite",
                                        "Talc" },
                        /* 23 */{ "What is the 8th planet away from the Sun?", "Neptune", "Saturn", "Uranus",
                                        "Jupiter" },
                        /* 24 */{ "Animals which feed on plants are called?", "Omnivores", "Herbivores", "Carnivores",
                                        "Producers" },
                        /* 25 */{ "What is the closest star to the Earth?", "Sun", "Venus", "Orion", "Cassiopeia" },
                        /* 26 */{ "Fe is the symbol of which element?", "Oxygen", "Iron", "Fluorine", "Water" },
                        /* 27 */{ "Lightning is hotter than the sun.", "True", "False", " ", " " },
                        /* 28 */{ "How many hearts does an octopus have?", "4", "1", "2", "3" },
                        /* 29 */{ "Female seahorses give birth to their young.", "True", "False", " ", " " },
                        // Questions 31-40
                        /* 30 */{ "You can hear an explosion in outer space.", "True", "False" },
                        /* 31 */{ "What is the tallest type of grass?", "Lemongrass", "Bermuda", "Wheat", "Bamboo" },
                        /* 32 */{ "Who made the first computer?", "Albert Einstein", "Thomas Edison", "Charles Babbage",
                                        "Aris Larroder" },
                        /* 33 */{ "In terms of computing, what does CPU stand for?", "Central Processing Unit",
                                        "Central Programming Unit", "Central Philippine University",
                                        "Charge Power Unit" },
                        /* 34 */{ "In terms of computing, keyboards are used as input devices.", "True", "False", " ",
                                        " " },
                        /* 35 */{ "What does the abbreviation WWW stand for?", "Wee Woo Wee", "World Wave Web",
                                        "World Wide Web",
                                        "What Who Where" },
                        /* 36 */{ "DNA is the abbreviation for deoxyribonucleic acid.", "True", "False" },
                        /* 37 */{ "What computer allows users to type documents, like emails and letters?", "Mouse",
                                        "Typewriter",
                                        "Router", "Keyboard" },
                        /* 38 */{ "What do you call the study of light?", "Astronomy", "Optics", "Botany", "Therapy" },
                        // /* 39 */{ "How many bones does a shark have?", "206, 208, 0, 12" },
                        /* 39 */{ "Crush ka ba ng crush mo?", "False", "Falsier", "Falsiest", "Di mo sure" }
        };

        String[] gifArray = {
                        "/home/mitsuki/Pictures/330985215_747584703245031_828804229974458214_n.jpg",
                        "/home/mitsuki/Pictures/329213213_696003885332599_7657948939188235792_n.jpg",
                        "/home/mitsuki/Pictures/315267034_893128918380508_9066527379242832256_n.jpg"
        };

        int gifIndex = 0;

        String Question;

        // Design and Fonts
        Border DefaultBorder = BorderFactory.createLineBorder(Color.black, 3); // Para ma dasig differenciate ang
                                                                               // Objects
                                                                               // Remove lang sa Final
        Font TitleFont = new Font("Times New Roman", Font.ITALIC, 50);
        Font QuestionFont = new Font("Helvetica", Font.PLAIN, 20);
        Font ChoiceFont = new Font("Helvetica", Font.PLAIN, 17);

        // Objects in StartFrame

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
        JLabel QuestionLabel = new JLabel(
                        "Q" + (QuestionNumber + 1) + ". " + QuestionsAnswers[QuestionNumber][0]);
        JButton QFNextButton = new JButton(">>");
        JButton QFBackButton = new JButton("<<");

        // Objects in ResultFrame
        JFrame ResultFrame = new JFrame("ResultFrame");
        JLabel QuestionLabels[] = new JLabel[40];
        JPanel ResultPanel[] = new JPanel[40];

        // Others
        ButtonGroup ChoiceGroup = new ButtonGroup();
        JRadioButton option1, option2, option3, option4;

        public Main_Project() {

                // Initializing Result Frame
                ResultFrame.setSize(500, 500);
                ResultFrame.setDefaultCloseOperation(3);
                ResultFrame.setLocationRelativeTo(null);
                ResultFrame.setVisible(false);
                ResultFrame.setLayout(new GridLayout(10, 4));

                for (int x = 0; x < 40; x++) {
                        ResultPanel[x] = new JPanel();
                        QuestionLabels[x] = new JLabel("Question" + (x + 1));
                        QuestionLabels[x].setSize(50, 5);
                        ResultFrame.add(QuestionLabels[x]);
                        ResultPanel[x].setBorder(DefaultBorder);
                        ResultFrame.add(ResultPanel[x]);
                }
                ResultFrame.setSize(600, 500);

                // Initializing Start Frame
                StartFrame.setVisible(true);
                StartFrame.setSize(screensize.getSize());
                StartFrame.setResizable(false);
                StartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                StartFrame.setLayout(new GridLayout(3, 1));
                StartFrame.add(SFTitlePanel);
                StartFrame.add(SFCreatorPanel);
                StartFrame.add(SFButtonPanel);
                // JLabel in StartFrame
                SFTitle.setFont(TitleFont);
                // SFTitle.setBorder(DefaultBorder);

                SFCreator.setFont(TitleFont);
                // SFCreator.setBorder(DefaultBorder);
                // JPanels in StartFrame
                // SFTitlePanel.setBorder(DefaultBorder);
                SFTitlePanel.add(SFTitle);

                // SFCreatorPanel.setBorder(DefaultBorder);
                SFCreatorPanel.add(SFCreator);

                // SFButtonPanel.setBorder(DefaultBorder);
                SFButtonPanel.add(SFButton);

                // JButtons in StartFrame
                SFButton.setFont(TitleFont);
                SFButton.setFocusable(false);
                Actions ButtonPressed = new Actions();
                SFButton.addActionListener(ButtonPressed);

                // Initializing QuizFrame
                QuizFrame.setSize(screensize.getSize());
                QuizFrame.setVisible(false);
                QuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                QuizFrame.add(QFTitlePanel);
                QuizFrame.add(QFQuestionPanel);
                QuizFrame.add(QFButtonPanel);
                QuizFrame.setLayout(null);

                // JRadioButton in QuestionFrame

                option1 = new JRadioButton(QuestionsAnswers[QuestionNumber][1]);
                option2 = new JRadioButton(QuestionsAnswers[QuestionNumber][2]);
                option3 = new JRadioButton(QuestionsAnswers[QuestionNumber][3]);
                option4 = new JRadioButton(QuestionsAnswers[QuestionNumber][4]);
                option1.setFocusable(false);
                option2.setFocusable(false);
                option3.setFocusable(false);
                option4.setFocusable(false);
                option1.setFont(ChoiceFont);
                option2.setFont(ChoiceFont);
                option3.setFont(ChoiceFont);
                option4.setFont(ChoiceFont);
                QuestionLabel.setFont(QuestionFont);

                ChoiceGroup.add(option1);
                ChoiceGroup.add(option2);
                ChoiceGroup.add(option3);
                ChoiceGroup.add(option4);

                // JPanels in QuestionFrame
                // QFTitlePanel.setBorder(DefaultBorder);
                QFTitlePanel.setBounds(0, 0, 1550, 150);
                QFTitlePanel.add(new JLabel("Add Title"));

                // QFQuestionPanel.setBorder(DefaultBorder);
                QFQuestionPanel.setLayout(new GridLayout(5, 1));
                QFQuestionPanel.setBounds(250, 150, 1000, 400);
                QFQuestionPanel.add(QuestionLabel);
                QFQuestionPanel.add(option1);
                QFQuestionPanel.add(option2);
                QFQuestionPanel.add(option3);
                QFQuestionPanel.add(option4);

                // QFButtonPanel.setBorder(DefaultBorder);
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
                                System.out.print("Hello");
                                QuizFrame.setVisible(true);
                        }
                        if (event.getSource() == QFBackButton) {
                                if (QuestionNumber == 0) {
                                        return;
                                }
                                QuestionNumber--;
                                if (ChoiceGroup.isSelected(null)) {
                                        TotalScore--;
                                }
                                if (QuestionNumber == 2) {
                                        option3.setVisible(false);
                                        option4.setVisible(false);
                                } else {
                                        option3.setVisible(true);
                                        option4.setVisible(true);
                                }
                                QuestionLabel.setText(
                                                "Question Number " + (QuestionNumber + 1) + ". "
                                                                + QuestionsAnswers[QuestionNumber][0]);
                                option1.setText(QuestionsAnswers[QuestionNumber][1]);
                                option2.setText(QuestionsAnswers[QuestionNumber][2]);
                                option3.setText(QuestionsAnswers[QuestionNumber][3]);
                                option4.setText(QuestionsAnswers[QuestionNumber][4]);
                                ChoiceGroup.clearSelection();
                        }
                        if (event.getSource() == QFNextButton) {

                                if (QuestionNumber == 0 && option1.isSelected()
                                                || QuestionNumber == 1 && option2.isSelected()
                                                || QuestionNumber == 2 && option2.isSelected()
                                                || QuestionNumber == 3 && option3.isSelected()
                                                || QuestionNumber == 4 && option3.isSelected()
                                                || QuestionNumber == 5 && option3.isSelected() ||
                                                QuestionNumber == 6 && option1.isSelected()
                                                || QuestionNumber == 7 && option2.isSelected()
                                                || QuestionNumber == 8 && option1.isSelected() ||
                                                QuestionNumber == 9 && option4.isSelected() ||
                                                QuestionNumber == 10 && option4.isSelected()
                                                || QuestionNumber == 11 && option1.isSelected()
                                                || QuestionNumber == 12 && option2.isSelected() ||
                                                QuestionNumber == 13 && option3.isSelected()
                                                || QuestionNumber == 14 && option1.isSelected()
                                                || QuestionNumber == 15 && option4.isSelected() ||
                                                QuestionNumber == 16 && option4.isSelected()
                                                || QuestionNumber == 17 && option3.isSelected()
                                                || QuestionNumber == 18 && option1.isSelected() ||
                                                QuestionNumber == 19 && option1.isSelected()
                                                || QuestionNumber == 20 && option3.isSelected()
                                                || QuestionNumber == 21 && option4.isSelected()
                                                || QuestionNumber == 22 && option4.isSelected()
                                                || QuestionNumber == 23 && option1.isSelected()
                                                || QuestionNumber == 24 && option2.isSelected()
                                                || QuestionNumber == 25 && option1.isSelected()
                                                || QuestionNumber == 26 && option2.isSelected()
                                                || QuestionNumber == 27 && option1.isSelected()
                                                || QuestionNumber == 28 && option4.isSelected()
                                                || QuestionNumber == 29 && option2.isSelected()
                                                || QuestionNumber == 30 && option2.isSelected()
                                                || QuestionNumber == 31 && option4.isSelected()
                                                || QuestionNumber == 32 && option3.isSelected()
                                                || QuestionNumber == 33 && option1.isSelected()
                                                || QuestionNumber == 34 && option1.isSelected()
                                                || QuestionNumber == 35 && option3.isSelected()
                                                || QuestionNumber == 36 && option1.isSelected()
                                                || QuestionNumber == 37 && option4.isSelected()
                                                || QuestionNumber == 38 && option3.isSelected()
                                                || QuestionNumber == 39 && option1.isSelected()
                                                || QuestionNumber == 39 && option2.isSelected()
                                                || QuestionNumber == 39 && option3.isSelected()
                                                || QuestionNumber == 39 && option4.isSelected()) {
                                        ResultPanel[QuestionNumber].setBackground(Color.green);
                                        TotalScore++;
                                }

                                else if (ChoiceGroup.isSelected(null)) {
                                        ResultPanel[QuestionNumber].setBackground(Color.yellow);
                                } else {
                                        ResultPanel[QuestionNumber].setBackground(Color.red);
                                }
                                QuestionNumber++;

                                if (QuestionNumber == QuestionsAnswers.length) {
                                        JOptionPane.showMessageDialog(null, "Total Correct Answers: " + TotalScore,
                                                        "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
                                        ResultFrame.setVisible(true);
                                }

                                // This Snippet is designed to remove choices 3 and 4 in true false questions
                                if (QuestionNumber == 2 || QuestionNumber == 19 || QuestionNumber == 27
                                                || QuestionNumber == 29 || QuestionNumber == 30
                                                || QuestionNumber == 34) {
                                        option3.setVisible(false);
                                        option4.setVisible(false);
                                } else {
                                        option3.setVisible(true);
                                        option4.setVisible(true);
                                }
                                QuestionLabel.setText(
                                                "Question Number " + (QuestionNumber + 1) + ". "
                                                                + QuestionsAnswers[QuestionNumber][0]);
                                option1.setText(QuestionsAnswers[QuestionNumber][1]);
                                option2.setText(QuestionsAnswers[QuestionNumber][2]);
                                option3.setText(QuestionsAnswers[QuestionNumber][3]);
                                option4.setText(QuestionsAnswers[QuestionNumber][4]);
                                ChoiceGroup.clearSelection();
                        }

                        if (event.getSource() == QFNextButton || (event.getSource() == QFBackButton && gifIndex != 0)) {
                                QFQuestionPanel.remove(gif);
                                ImageIcon icon = new ImageIcon(gifArray[gifIndex]);
                                if (event.getSource() == QFNextButton) {
                                        gifIndex += 1;
                                } else if (event.getSource() == QFBackButton && gifIndex != 0) {
                                        gifIndex -= 1;
                                }
                                icon.setImageObserver(gif);
                                gif.setIcon(icon);
                                QFQuestionPanel.add(gif);
                                QFQuestionPanel.revalidate();
                                QFQuestionPanel.repaint();

                                System.out.println("GIF Index is at: " + gifIndex);
                        }
                }
        }
}