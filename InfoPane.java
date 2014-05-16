package project;

import java.io.*;
import java.util.Scanner;
import javax.swing.*;


@SuppressWarnings("serial")
public class InfoPane extends JPanel{
	
	public void fillInfo(String path, InfoPane pane) throws IOException{
// чтение из файла		
			File f = new File(path);
			FileReader in = new FileReader(f);
			char[] arr = new char[(int)f.length()];
	        int read = in.read(arr);
	        in.close();
	        
	// создается и заполняется JTextArea в pane     
	        JTextPane t = new JTextPane();
	        t.setSize(230, 600);
	        t.setLocation(10, 10);
	        t.setVisible(true);
	        t.setLayout(null);
	  //      tArea.setEditable(false);
	        t.setText(String.valueOf(arr, 0, read));	        
	        pane.add(t);	
	}
}
	
