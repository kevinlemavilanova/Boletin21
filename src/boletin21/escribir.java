package boletin21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class escribir {

    PrintWriter añade;
    FileWriter fich;

    public void add(String fichero, ArrayList<String> list) {
        try {
            añade = new PrintWriter(new FileWriter(fichero, true));
            for (int i = 0; i < list.size(); i++) {
                añade.println(i + " " + list.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            añade.close();
        }
    }
}
