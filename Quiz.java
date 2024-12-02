import javax.swing.*;
import java.awt.*;

public class Quiz {
    private String[] subjects = {"Operating Systems", "Java", "Data Structures"};
    private String selectedSubject;
    private String[] questions;
    private String[][] options;
    private int[] answers;
    private int score = 0;
    private int currentQuestionIndex = 0;

    public void start() {
        selectedSubject = (String) JOptionPane.showInputDialog(
            null,
            "Choose a subject:",
            "Subject Selection",
            JOptionPane.QUESTION_MESSAGE,
            null,
            subjects,
            subjects[0]
        );

        if (selectedSubject != null) {
            loadQuestions(selectedSubject);
            showQuizFrame();
        }
    }

    private void loadQuestions(String subject) {
        switch (subject) {
            case "Operating Systems":
                questions = new String[]{
                    "What is an operating system?",
                    "What is dual mode operation?",
                    "What is a system call?",
                    "What is multithreading?",
                    "What is a virtual machine?"
                };
                options = new String[][]{
                    {"A software that performs tasks on a server", "A program that manages computer hardware and software resources", "A tool for creating graphical user interfaces", "A type of application used for word processing"},
                    {"An operating mode that allows an operating system to run in user mode and kernel mode", "A method for running two applications simultaneously", "A technique for dual-booting different operating systems", "A feature for managing dual-layer DVDs"},
                    {"A method for calling remote servers", "A command used in shell scripting", "A way for programs to request services from the operating system", "A type of hardware interrupt"},
                    {"The ability to run multiple programs on a single processor", "A programming technique that allows multiple threads to run concurrently within a single process", "A method for creating graphical user interfaces", "A technique for managing memory allocation in operating systems"},
                    {"A physical computer that runs multiple operating systems", "A hardware component that improves system performance", "A type of storage device used for backups", "A software emulation of a physical computer that allows multiple operating systems to run on a single hardware platform"}
                };
                answers = new int[]{1, 0, 2, 1, 3};
                break;

            case "Java":
                questions = new String[]{
                    "What is object-oriented programming (OOP)?",
                    "What is a constructor in Java?",
                    "What is method overloading in Java?",
                    "What is method overriding in Java?",
                    "Who teaches us object-oriented programming with Java?"
                };
                options = new String[][]{
                    {"A programming paradigm based on the use of functions and procedures", "A technique for managing memory in low-level programming", "A style of programming that focuses on the linear flow of control", "A method of programming that emphasizes the use of objects to represent data and methods"},
                    {"A method that creates a new class", "A special method used to initialize objects when they are created", "A variable that holds the reference to an object", "A function that performs mathematical calculations"},
                    {"A technique for enhancing the performance of a method", "The process of overriding a method in a subclass", "The ability to have multiple methods with the same name but different parameters within the same class", "A way to create methods that can be called simultaneously"},
                    {"The ability to create a method with a different name in the subclass", "A technique that occurs when a subclass has a method with the same name and parameters as a method in its superclass", "A method that can only be accessed within the same package", "A way to improve the performance of inherited methods"},
                    {"Deepak Sir", "Samatha Mam", "Pushpa Mam", "Swathi Mam"}
                };
                answers = new int[]{3, 1, 2, 1, 1};
                break;

            case "Data Structures":
                questions = new String[]{
                    "What is a data structure?",
                    "What is a stack in data structures?",
                    "What is a queue in data structures?",
                    "What is dynamic memory allocation?",
                    "What is a stack overflow?"
                };
                options = new String[][]{
                    {"A programming language used for data analysis", "A type of algorithm used for sorting data", "A way to store and organize data for efficient access and modification", "A method for debugging code"},
                    {"A collection of elements that follows the Last In, First Out (LIFO) principle", "A structure that allows access to elements in a random order", "A data type that stores elements in a sorted order", "A type of tree used for hierarchical data representation"},
                    {"A collection of elements that follows the Last In, First Out (LIFO) principle", "A data structure that allows insertion at one end and removal from the other, following the First In, First Out (FIFO) principle", "A structure that stores elements in a sorted order", "A type of linked list used for storing data in a non-linear fashion"},
                    {"The process of allocating memory at compile time", "A technique for managing memory during program execution, allowing for variable-sized memory blocks to be allocated and freed", "A method for storing data in a fixed-size array", "A way to increase the speed of data access in arrays"},
                    {"A method for increasing the size of a stack dynamically", "A technique for efficiently sorting data in a stack", "An error that occurs when a stack is not properly initialized", "A situation where a stack reaches its maximum capacity and cannot accept more elements"}
                };
                answers = new int[]{2, 0, 1, 1, 3};
                break;
        }
    }

    private void showQuizFrame() {
        JFrame quizFrame = new JFrame(selectedSubject + " Quiz");
        quizFrame.setSize(800, 700);
        quizFrame.setLayout(new BorderLayout());
        quizFrame.getContentPane().setBackground(Color.decode("#424242"));  

        JTextArea questionArea = new JTextArea();
        questionArea.setEditable(false);
        questionArea.setFont(new Font("Arial", Font.BOLD, 22));
        questionArea.setForeground(Color.BLACK);
        questionArea.setBackground(Color.decode("#E0FFFF"));  

        JPanel answerPanel = new JPanel(new GridLayout(4, 1, 10, 10));  
        answerPanel.setBackground(Color.decode("#424242"));  

        updateQuestionAndOptions(quizFrame, questionArea, answerPanel);

        quizFrame.add(questionArea, BorderLayout.NORTH);
        quizFrame.add(answerPanel, BorderLayout.CENTER);
        quizFrame.setVisible(true);
    }

    private void updateQuestionAndOptions(JFrame quizFrame, JTextArea questionArea, JPanel answerPanel) {
        if (currentQuestionIndex >= questions.length) {
            JOptionPane.showMessageDialog(quizFrame, "Your score: " + score + "/" + questions.length);
            quizFrame.dispose();
            return;
        }

        questionArea.setText(questions[currentQuestionIndex]);
        answerPanel.removeAll();

        for (int i = 0; i < options[currentQuestionIndex].length; i++) {
            JButton answerButton = new JButton(options[currentQuestionIndex][i]);
            answerButton.setFont(new Font("Arial", Font.BOLD, 20));
            answerButton.setBackground(Color.WHITE);  
            answerButton.setForeground(Color.BLACK);
            answerButton.setOpaque(true);
            answerButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            int answerIndex = i;

            answerButton.addActionListener(e -> {
                if (answerIndex == answers[currentQuestionIndex]) {
                    score++;
                }
                currentQuestionIndex++;
                updateQuestionAndOptions(quizFrame, questionArea, answerPanel);
                quizFrame.revalidate();
                quizFrame.repaint();
            });

            answerPanel.add(answerButton);
        }

        quizFrame.revalidate();
        quizFrame.repaint();
    }

    public static void main(String[] args) {
        new Quiz().start();
    }
}
