package project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class AminoAcidFrame extends AmAcidFrame {

	public AminoAcidFrame() {
		createGUI1();
	}

	public static void createGUI1() {

		// Main frame
		final AmAcidFrame frame = new AmAcidFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 650));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setVisible(true);
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setLayout(null);

		// Info Pane
		InfoPane infoPane = new InfoPane();
		infoPane.setBackground(Color.WHITE);
		infoPane.setSize(250, 450);
		infoPane.setLocation(710, 100);
		infoPane.setLayout(null);
		frame.add(infoPane);
		JLabel labelInf = new JLabel("Amino acid info");
		labelInf.setSize(200, 20);
		labelInf.setLocation(780, 72);
		frame.add(labelInf);

		JTextArea acidName = new JTextArea("kkk");
		acidName.setSize(150, 20);
		acidName.setLocation(765, 220);
		acidName.setBackground(Color.GRAY);
		acidName.setVisible(true);
		infoPane.add(acidName);

		final AmAcidPane nonPolPane = frame.addAmAcidPane(frame);
		nonPolPane.addAmAcid1(nonPolPane, infoPane, "Glycine", "glycine.jpg",
				"glycine.txt");
		nonPolPane.addAmAcid2(nonPolPane, infoPane, "Alanine", "alanine.jpg",
				"alanine.txt");
		nonPolPane.addAmAcid3(nonPolPane, infoPane, "Valine", "valine.jpg",
				"valine.txt");
		nonPolPane.addAmAcid4(nonPolPane, infoPane, "Leucine", "leucine.jpg",
				"leucine.txt");
		nonPolPane.addAmAcid5(nonPolPane, infoPane, "Methionine",
				"methionine.jpg", "methionine.txt");
		nonPolPane.addAmAcid6(nonPolPane, infoPane, "Isoleucine",
				"isoleucine.jpg", "isoleucine.txt");

		final AmAcidPane polPane = frame.addAmAcidPane(frame);
		polPane.addAmAcid1(polPane, infoPane, "Serine", "serine.jpg",
				"serine.txt");
		polPane.addAmAcid2(polPane, infoPane, "Theronine", "threonine.jpg",
				"threonine.txt");
		polPane.addAmAcid3(polPane, infoPane, "Cysteine", "cysteine.jpg",
				"cysteine.txt");
		polPane.addAmAcid4(polPane, infoPane, "Proline", "proline.jpg",
				"proline.txt");
		polPane.addAmAcid5(polPane, infoPane, "Asparagine", "asparagine.jpg",
				"asparagine.txt");
		polPane.addAmAcid6(polPane, infoPane, "Glutamine", "glutamine.jpg",
				"glutamine.txt");

		final AmAcidPane aromPane = frame.addAmAcidPane(frame);
		aromPane.addAmAcid1(aromPane, infoPane, "Phenylalanine",
				"phenylalanine.jpg", "phenylalanine.txt");
		aromPane.addAmAcid2(aromPane, infoPane, "Tyrosine", "tyrosine.jpg",
				"tyrosine.txt");
		aromPane.addAmAcid3(aromPane, infoPane, "Tryptophan",
				"tryptophane.jpg", "tryptophane.txt");

		final AmAcidPane posChPane = frame.addAmAcidPane(frame);
		posChPane.addAmAcid1(posChPane, infoPane, "Lysine", "lysine.jpg",
				"lysine.txt");
		posChPane.addAmAcid2(posChPane, infoPane, "Arginine", "arginine.jpg",
				"arginine.txt");
		posChPane.addAmAcid3(posChPane, infoPane, "Histidine", "histidine.jpg",
				"histidine.txt");

		final AmAcidPane negChPane = frame.addAmAcidPane(frame);
		negChPane.addAmAcid1(negChPane, infoPane, "Aspartate", "aspartate.jpg",
				"aspartate.txt");
		negChPane.addAmAcid2(negChPane, infoPane, "Glutamine", "glutamine.jpg",
				"glutamine.txt");

		// Buttons
		JButton nonPButton = frame.addButton(frame, "Nonpolar", 30, 25);
		JButton polButton = frame.addButton(frame, "Polar", 150, 25);
		JButton aromButton = frame.addButton(frame, "Aromatic", 270, 25);
		JButton posChButton = frame.addButton(frame, "Pos. Ch", 390, 25);
		JButton negChButton = frame.addButton(frame, "Neg. Ch", 510, 25);
		
		JButton codButton = new JButton("Codon Info");
		codButton.setSize(150, 35);
		codButton.setLocation(760, 562);
		frame.add(codButton);

		class CodListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				// createGUI2();
				// переход в другой JFrame
			}
		}
		ActionListener codListener = new CodListener();
		codButton.addActionListener(codListener);
		
		class NonPolListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				nonPolPane.setVisible(true);
				polPane.setVisible(false);
				aromPane.setVisible(false);
				negChPane.setVisible(false);
				posChPane.setVisible(false);
			}
		}
		ActionListener nonPolListener = new NonPolListener();
		nonPButton.addActionListener(nonPolListener);

		class PolListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				polPane.setVisible(true);
				nonPolPane.setVisible(false);
				aromPane.setVisible(false);
				negChPane.setVisible(false);
				posChPane.setVisible(false);
			}
		}
		ActionListener polListener = new PolListener();
		polButton.addActionListener(polListener);

		class AromListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				aromPane.setVisible(true);
				polPane.setVisible(false);
				nonPolPane.setVisible(false);
				negChPane.setVisible(false);
				posChPane.setVisible(false);
			}
		}
		ActionListener aromListener = new AromListener();
		aromButton.addActionListener(aromListener);

		class PosChListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				posChPane.setVisible(true);
				polPane.setVisible(false);
				nonPolPane.setVisible(false);
				aromPane.setVisible(false);
				negChPane.setVisible(false);
			}
		}
		ActionListener posChListener = new PosChListener();
		posChButton.addActionListener(posChListener);

		class NegChListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				negChPane.setVisible(true);
				polPane.setVisible(false);
				nonPolPane.setVisible(false);
				aromPane.setVisible(false);
				posChPane.setVisible(false);
			}
		}
		ActionListener negChListener = new NegChListener();
		negChButton.addActionListener(negChListener);
		frame.pack();
		}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
					createGUI1();
			}
		});
	}
}
