//Create an application that asks a user how many subjects they take, and will then ask what marks (0-100) they got in each subject. The application should then output their average result
//Bonus: Tell the user their grade from A-F based on their results

//Neil McCarthy - x23319828
import javax.swing.JOptionPane;

public class Averageresult {
    public static void main(String[] args) { 
        //Declare variables
        int mark = 0;
        int totalMark = 0;
        int subjectInput = Integer.parseInt(JOptionPane.showInputDialog("How many subjects do you take?"));
        //Check if the user has entered a valid number of subjects
        if (subjectInput < 2) {
            JOptionPane.showMessageDialog(null, "You must take at least 2 subjects");
            System.exit(0);
        } else if (subjectInput > 10) {
            JOptionPane.showMessageDialog(null, "You can only take a maximum of 10 subjects");
            System.exit(0);
        }
        //Loop to get the marks for each subject
        for (int i=0; i<subjectInput; i++) {
            mark = Integer.parseInt(JOptionPane.showInputDialog("Enter your mark for subject " + (i + 1)));
            totalMark += mark;
        }
        //Calculate the average mark
        int average = totalMark / subjectInput;
        //Calculate and output the grade and mark
        if (average >= 90) {
            JOptionPane.showMessageDialog(null, "Your average mark is " + average + " which is an A");
        } else if (average >= 80) {
            JOptionPane.showMessageDialog(null, "Your average mark is " + average + " which is a B");
        } else if (average >= 70) {
            JOptionPane.showMessageDialog(null, "Your average mark is " + average + " which is a C");
        } else if (average >= 60) {
            JOptionPane.showMessageDialog(null, "Your average mark is " + average + " which is a D");
        } else if (average >= 50) {
            JOptionPane.showMessageDialog(null, "Your average mark is " + average + " which is an E");
        } else {
            JOptionPane.showMessageDialog(null, "Your average mark is " + average + " which is an F");
        }
    }
}