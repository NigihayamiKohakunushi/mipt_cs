package project;

import java.io.*;
import java.util.Scanner;
import javax.swing.*;


public class InfoPane extends JPanel{
	
	public void fillInfo(String path, InfoPane pane) throws IOException{
// чтение из файла		
			File f = new File(path);
			FileReader in = new FileReader(f);
			char[] arr = new char[(int)f.length()];
	        int read = in.read(arr);
	        in.close();
	        
	// создается и заполняется JTextArea в pane     
	        JTextArea tArea = new JTextArea("Glycine\n");
	        tArea.setSize(100, 100);
	        tArea.setLocation(10, 10);
	        tArea.setVisible(true);
	        tArea.setEditable(false);
	        tArea.append(String.valueOf(arr, 0, read));	        
	        pane.add(tArea);	
	}
}
			
	

