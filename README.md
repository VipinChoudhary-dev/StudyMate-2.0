# StudyMate-Application
StudyMate is an educational Java-based desktop application designed to enhance learning and improve programming skills in a fun and interactive way. The app offers five engaging sections:

Video Lectures: Access core concept video lectures to understand important programming topics.
Quiz Test: Test your knowledge with quizzes designed to assess your understanding of key programming concepts.
Assignments: Complete coding challenges to strengthen your practical coding skills.
Word Game: Guess programming-related terms through a fun and challenging word game.
Number Game: Sharpen your problem-solving skills by solving number-based puzzles.
Learn, improve, and challenge yourself across various sections of the app in an interactive manner.

Features
User Authentication: Login functionality to ensure secure access to the app.
Interactive Learning: Five sections designed to make learning programming more engaging and effective.
Fun Games: Includes word and number games to enhance learning through entertainment.
Quiz and Assignments: Assess and improve your knowledge with quizzes and coding assignments.
Video Lectures: Core concept videos for clear understanding of programming fundamentals.
Technologies Used
Java (Swing): Used for building the graphical user interface (GUI).
java.awt: Provides graphical user interface components and event handling for the app.
java.net.URI: Used for handling Uniform Resource Identifiers (URIs) in the app, particularly for linking video lectures and resources.
java.util.Random: Used for generating random numbers, especially in the Number Game to make puzzles more challenging.
Basic Java classes (JFrame, JLabel, JTextField, etc.): Used for creating various components in the GUI.
ActionListener: Handles events triggered by user actions (like button clicks).
JOptionPane: Displays pop-up messages for login success or failure and other important notifications.
How to Run the Project
Prerequisites
Ensure you have the following installed on your system:

Java Development Kit (JDK): Java 8 or higher. Download JDK here
Git: For cloning the repository (optional). Download Git here
Cloning the Repository
Clone the repository to your local machine using the following command:

bash
Copy code
git clone https://github.com/your-username/StudyMate.git
Compiling and Running the Project
Navigate to the project folder in the terminal:

bash
Copy code
cd StudyMate
Compile the Java files:

bash
Copy code
javac Login.java StudyMate.java
Run the Login class to start the application:

bash
Copy code
java Login
The login window will appear, and upon successful authentication, the StudyMate application will open.

Running the Project Using Makefile
If you prefer using the Makefile to compile and run the project:

Open your terminal and navigate to the project folder.

Run the following command to compile and run the project:

bash
Copy code
make
To clean up the compiled .class files, you can use:

bash
Copy code
make clean
Login Credentials
Username: VPS
Password: vps123
These are the default credentials for logging into the application. You can modify them in the Login.java file if needed.

Screenshots
Login Screen

StudyMate Dashboard (After Login)

Contributing
We welcome contributions! If you have suggestions, bug fixes, or improvements, feel free to open a pull request.

Steps to Contribute:
Fork this repository.
Create a new branch (git checkout -b feature-branch).
Make your changes and commit them (git commit -am 'Add new feature').
Push to the branch (git push origin feature-branch).
Open a pull request.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
Thank you to the Java community for the Swing framework.
This project uses basic Java classes for building a user-friendly interface and handling login functionality.
