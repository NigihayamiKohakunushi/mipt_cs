package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;

public class CodonFrame extends JFrame {

	private static String url = "http://www.kazusa.or.jp/codon/cgi-bin/showcodon.cgi?species=118976";

	public static void createGUI() {
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 650));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		JFrame.setDefaultLookAndFeelDecorated(true);

		final JTextArea list1 = new JTextArea();
		list1.setBackground(Color.WHITE);
		list1.setSize(400, 500);
		list1.setLocation(25, 100);
		list1.setVisible(true);
		frame.add(list1);

		final JTextField name1 = new JTextField("");
		name1.setSize(200, 30);
		name1.setLocation(30, 30);
		frame.add(name1);

		JButton button1 = new JButton("Start!");
		button1.setSize(100, 40);
		button1.setLocation(300, 30);
		button1.setBackground(Color.WHITE);
		frame.add(button1);

		final JPanel pane2 = new JPanel();
		pane2.setBackground(Color.WHITE);
		pane2.setSize(400, 600);
		pane2.setLocation(500, 25);
		pane2.setLayout(null);
		pane2.setVisible(true);
		frame.add(pane2);
		
		final JEditorPane list2 = new JEditorPane();
		list2.setBackground(Color.WHITE);
		list2.setSize(400, 600);
		list2.setLocation(20, 50);
		list2.setVisible(true);
		pane2.add(list2);
		
		final JTextField index = new JTextField("195");
		index.setSize(200, 30);
		index.setLocation(20, 30);
		pane2.add(index);
		index.setBackground(Color.GRAY);
		index.setVisible(true);

		JButton button2 = new JButton("Start!");
		button2.setSize(100, 40);
		button2.setLocation(300, 30);
		button2.setBackground(Color.WHITE);
		pane2.add(button2);

		class MyListener1 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				pane2.setVisible(true);
				Net list = new Net();
				 String a = new String("");
				 	try {
						a = list.getListOfSpecies(name1.getText());
					} catch (ClientProtocolException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					list1.setText(a);
					}				
							
			
		}
		ActionListener startListener = new MyListener1();
		button1.addActionListener(startListener);
		
		class MyListener2 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				pane2.setVisible(true);
				Net list = new Net();
	//			 String b = new String("");
				 try {
					list.getTable(index.getText());
					File f = new File("file");
					FileReader in = new FileReader(f);
					char[] arr = new char[(int)f.length()];
			        int read = in.read(arr);
			        list2.setText(String.valueOf(arr, 0, read));	
			        in.close();
				//	list1.setText(b);					
					
				} catch (ClientProtocolException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		ActionListener start2Listener = new MyListener2();
		button2.addActionListener(start2Listener);

		frame.setLayout(null);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		createGUI();
		// Net list = new Net();
		// String a = new String("");
		// a = list.getListOfSpecies("coli");

		// System.out.println(a);
	}

}
