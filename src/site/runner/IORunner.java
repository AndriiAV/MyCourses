package site.runner;

import site.Courses;
import site.io.IllegalFormatException;

import java.io.IOException;

public class IORunner {
    private static final String INPUT_TEXT_FILE = "files/courses.csv";
    private static final String OUTPUT_TEXT_FILE = "files/courses-out.csv";
    private static final String BIN_FILE = "files/courses.dat";

    public static void main(String[] args) {
/*        try {
            System.out.println("Reading from text file: " + INPUT_TEXT_FILE);
            Courses films = readFromTextFile(INPUT_TEXT_FILE);

            System.out.println("Writing into text file: " + OUTPUT_TEXT_FILE);
            writeIntoTextFile(OUTPUT_TEXT_FILE, films);

            System.out.println("Writing into bin file: " + BIN_FILE);
            writeIntoBinFile(BIN_FILE, films);

            System.out.println("Reading from bin file: " + BIN_FILE);
            Courses filmsFromBinFile = readFromBinFile(BIN_FILE);
            System.out.println(filmsFromBinFile);

            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("IO Error. " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Illegal format. " + e.getMessage());
        }*/
    }
}
