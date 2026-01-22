package ExceptionsPratice;

import javax.swing.*;
import java.io.*;

public class CustomiseExPratice {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Filename to be displayed");

        printFileConsole2(fileName);
        System.out.println("\nWith or without exception, the program continues....");
    }

    public static void printFileConsole2(String fileName) {

        try{
            BufferedReader br = readFile(fileName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossbleOpeningFileException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null,"Unexpected error reading file!\nContact support!");
        }
    }

    public static BufferedReader readFile (String fileName) throws ImpossbleOpeningFileException {
        File file = new File(fileName);
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new ImpossbleOpeningFileException(file.getName(), file.getPath());
        }
    }
}

class ImpossbleOpeningFileException extends Exception {
    private String fileNamee;
    private String directory;

    public ImpossbleOpeningFileException( String fileNamee, String directory) {
        super("O arquivo " + fileNamee + " não foi encontrado no diretório " + directory);
        this.fileNamee = fileNamee;
        this.directory = directory;
    }

    @Override
    public String toString(){
        return "{ File Name: " +  fileNamee + ", Directory: " + directory + "}";
    }
}