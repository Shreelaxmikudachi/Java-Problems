// 4.write a java program that attempt to open a file and then read its  first line .handle both file not found excand input output exception seperately

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderProgram {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }
}