package project;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

@SuppressWarnings("serial")
public class AmAcidPane extends JPanel {

	public void addAmAcid1(final JPanel pane, final InfoPane infoPane, String name, String path) {
		JLabel label1 = new JLabel(name);
		label1.setSize(100, 20);
		label1.setLocation(100, 20);
		JLabel imageLabel1 = new JLabel(new ImageIcon(path));
		imageLabel1.setSize(200, 150);
		imageLabel1.setLocation(20, 50);
		pane.add(imageLabel1);
		pane.add(label1);
		
		class MyMouseListener implements MouseListener {
			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
				// при нажатии на картинку заполняется JTextArea в infoPane
				try {
					infoPane.fillInfo("glycine.txt", infoPane);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			public void mouseExited(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
		}
		imageLabel1.addMouseListener(new MyMouseListener());
	}

	public void addAmAcid2(JPanel pane, String name, String path) {
		JLabel label2 = new JLabel(name);
		label2.setSize(100, 20);
		label2.setLocation(300, 20);
		JLabel imageLabel2 = new JLabel(new ImageIcon(path));
		imageLabel2.setSize(200, 150);
		imageLabel2.setLocation(220, 50);
		pane.add(imageLabel2);
		pane.add(label2);
	}

	public void addAmAcid3(JPanel pane, String name, String path) {
		JLabel label3 = new JLabel(name);
		label3.setSize(100, 20);
		label3.setLocation(510, 20);
		JLabel imageLabel3 = new JLabel(new ImageIcon(path));
		imageLabel3.setSize(200, 150);
		imageLabel3.setLocation(420, 50);
		pane.add(imageLabel3);
		pane.add(label3);
	}

	public void addAmAcid4(JPanel pane, String name, String path) {
		JLabel label4 = new JLabel(name);
		label4.setSize(100, 20);
		label4.setLocation(100, 230);
		JLabel imageLabel4 = new JLabel(new ImageIcon(path));
		imageLabel4.setSize(200, 150);
		imageLabel4.setLocation(20, 250);
		pane.add(imageLabel4);
		pane.add(label4);
	}

	public void addAmAcid5(JPanel pane, String name, String path) {
		JLabel label5 = new JLabel(name);
		label5.setSize(100, 20);
		label5.setLocation(310, 230);
		JLabel imageLabel5 = new JLabel(new ImageIcon(path));
		imageLabel5.setSize(200, 150);
		imageLabel5.setLocation(220, 265);
		pane.add(imageLabel5);
		pane.add(label5);
	}

	public void addAmAcid6(JPanel pane, String name, String path) {
		JLabel label6 = new JLabel(name);
		label6.setSize(100, 20);
		label6.setLocation(500, 230);
		JLabel imageLabel6 = new JLabel(new ImageIcon(path));
		imageLabel6.setSize(200, 150);
		imageLabel6.setLocation(420, 255);
		pane.add(imageLabel6);
		pane.add(label6);
	}

}
