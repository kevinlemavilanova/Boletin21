package boletin21;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Boletin21 {

    public static void main(String[] args) {

        escribir clase = new escribir();
        
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<=4;i++){
            list.add(JOptionPane.showInputDialog("Introduce una palabra"));
        }
        
        Collections.sort(list);
        for (int z = 0; z < list.size(); z++) {
            System.out.println(list.get(z));
        }

        clase.add("bol21.txt", list);
    }


}
