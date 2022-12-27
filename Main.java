/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Sept 25,2022
 *Windows 11
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Main {
    
    
    public static void main(String[] args) {
        while (true) {
        int goAgain = JOptionPane.showConfirmDialog(null, "Are you ready to calculate your average daily expenditures? Press yes to continue, and no to come back later.");
            if (goAgain == JOptionPane.YES_OPTION) {
        
           
                int userInput;
                int i;
                double number;
                double sum = 0;
                double getAverage = 0;
                //variables

                try {
                    String valueNum = JOptionPane.showInputDialog("Please enter the number of days you would like to average expenses for.");
                    userInput = Integer.parseInt(valueNum);
                    //end of collect days user input

        

                    for(i = 0; i < userInput; i++){
            
                        String UserNumber = JOptionPane.showInputDialog("Please enter one of your daily expenditures.", "$ ");
                        number = Double.parseDouble(UserNumber);
                        JOptionPane.showMessageDialog(null, String.format("You input $%,.2f for this day", number) );
                        sum = sum + number;

                    }// end of loop for expenditure values

        
                    getAverage = computeAverage(sum, userInput);//calls method

                    JOptionPane.showMessageDialog(null, "Your total expense sum is $" +sum);
                    String printAverage = "----------------------------------------------------\n\n";
                    printAverage += "Your average is $" +String.valueOf(getAverage) + "\n\n";
                    //creates string
        
                    JOptionPane.showMessageDialog(null, printAverage);//shows string in GUI
        
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null,"an error occured");

                    }//end of catch for exception mismatch of datatypes
        
            }else if(goAgain == JOptionPane.NO_OPTION) {
                System.exit(0);
                
            }else if(goAgain == JOptionPane.CANCEL_OPTION) {
                System.exit(0);
            }//end of If statement
        }//end of static void main(String[] args)
    }
        

    public static double computeAverage(double sum, int userInput) {
        
        return sum/userInput;
        
        
       }//End of method for computing average

}//End of class Main