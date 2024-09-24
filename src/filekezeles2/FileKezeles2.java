package filekezeles2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.Ember;

public class FileKezeles2 {
    public static void main(String[] args) throws IOException {
        InputStream ember = filekezeles2.FileKezeles2.class.getClassLoader().getResourceAsStream("emberek/emberek.csv");
        BufferedReader bf = new BufferedReader(new InputStreamReader(ember));
        ArrayList<Ember> emberek = new ArrayList<>();
        String line;
        while((line = bf.readLine()) != null){
            String[] l = line.split(";");
            String nev = l[0];
            String cim = l[1];
            Ember e = new Ember(nev, cim);
            emberek.add(e);
        }
        emberek.remove(0);
        
        System.out.println("Fajl tartalma: ");
        int i = 0;
        while(!emberek.get(i).getCim().equals("BP")){
            i++;
        }
        System.out.println("Budapesti: " + emberek.get(i).getNev());
    }
    
}
