/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsrevision;

import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MethodsRevision {

    public static void main(String[] args) throws IOException {

        String nameOfReadFile = JOptionPane.showInputDialog("Please enter the name"
                + "of the fileto read from:");
        String nameOfWriteFile = JOptionPane.showInputDialog("please neter the name "
                + "of the File to write to: ");

        String converted = convertToUpper(nameOfReadFile);
        writeToFile(nameOfWriteFile, converted);
    }
    /**
     * This method write data to a specified file
     * @param filename The name of the file to write to
     * @param content The content you want to write to the file
     * @throws IOException 
     */
    
    
    public static void writeToFile(String filename, String content)throws IOException
    {
    PrintWriter outputFile=new PrintWriter(filename);
    outputFile.println(content);
    outputFile.close();
    JOptionPane.showMessageDialog(null, "File succesfully created");
    }

    /**
     * This method convert the content in a file to uppercase
     *
     * @param filename the name of the flie to convert
     * @return the converted String
     * @throws IOException
     */
    public static String convertToUpper(String filename) throws IOException {
        String convertedFile = "";

        File file = new File(filename);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "The file you type doesn't exist.");
            return null;
        } else {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                convertedFile = convertedFile + inputFile.nextLine() + "\n";

            }
            inputFile.close();
            return convertedFile.toUpperCase();
        }

    }
}
