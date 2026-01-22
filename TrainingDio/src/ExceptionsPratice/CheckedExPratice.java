package ExceptionsPratice;

import javax.swing.*;
import java.io.*;

public class CheckedExPratice {
    public static void main(String[] args){
        String fileName = "FilmesStarWars.txt";

        try {
            printFileConsole(fileName);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Review the file name.");
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Unexpected error reading file!\nContact support!");
        } finally{
            System.out.println("Reach finally!");
        }

        System.out.println("\nWith or without exception, the program continues....");
    }


    public static void printFileConsole(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }


}
