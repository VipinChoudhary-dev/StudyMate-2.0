import javax.swing.*;

public class Assignment {
    public void showAssignments() {
        StringBuilder assignments = new StringBuilder("Assignments:\n");
        assignments.append("1. Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from command line arguments).\n");
        assignments.append("2. Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA main method to illustrate Stack operations.\n");
        assignments.append("3. A class called Employee, which models an employee with an ID, name, and salary. Include methods to get and set these attributes, and print employee details.\n");
        assignments.append("4. Create a class called MyPoint to represent a point in a two-dimensional space. Include methods for getting and setting the coordinates and calculating the distance from another point.\n");
        assignments.append("5. Create a shape class with polymorphism, including subclasses for specific shapes (e.g., Circle, Rectangle) and methods for calculating area and perimeter.\n");

        JOptionPane.showMessageDialog(null, assignments.toString(), "Assignments", JOptionPane.INFORMATION_MESSAGE);
    }
}
