package gui;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Dimension;

/**
 * @author Carolina Arenas Okawa
 * @author Eric
 * @author Fernando Akio
 * @author Vin�cius
 */
@SuppressWarnings("serial")
public class GUI extends JFrame {

	// Menu components
	private JMenuBar Bar;
	private JMenu menu;
	private JMenuItem exit;
	private JMenuItem MIDI;
	private JMenuItem synth;
	private Icon icone;

	// Buttons
	private JButton Do1;
	private JButton Do2;
	private JButton Do3;
	private JButton Do4;
	private JButton DoSus1;
	private JButton DoSus2;
	private JButton DoSus3;
	private JButton Fa1;
	private JButton Fa2;
	private JButton Fa3;
	private JButton FaSus1;
	private JButton FaSus2;
	private JButton FaSus3;
	private JButton La1;
	private JButton La2;
	private JButton La3;
	private JButton LaSus1;
	private JButton LaSus2;
	private JButton LaSus3;
	private JButton Mi1;
	private JButton Mi2;
	private JButton Mi3;
	private JButton Re1;
	private JButton Re2;
	private JButton Re3;
	private JButton ReSus1;
	private JButton ReSus2;
	private JButton ReSus3;
	private JButton Si1;
	private JButton Si2;
	private JButton Si3;
	private JButton Sol1;
	private JButton Sol2;
	private JButton Sol3;
	private JButton SolSus1;
	private JButton SolSus2;
	private JButton SolSus3;

	/**
	 * Creates new form GUI
	 */
	public GUI() {
		initComponents();
		setAllFocusable(false);
	}

	/**
	 * Initialize all components
	 */
	private void initComponents() {

		DoSus1 = new JButton();
		ReSus1 = new JButton();
		FaSus1 = new JButton();
		SolSus1 = new JButton();
		LaSus1 = new JButton();

		Do1 = new JButton();
		Re1 = new JButton();
		Mi1 = new JButton();
		Fa1 = new JButton();
		Sol1 = new JButton();
		La1 = new JButton();
		Si1 = new JButton();

		DoSus2 = new JButton();
		ReSus2 = new JButton();
		FaSus2 = new JButton();
		SolSus2 = new JButton();
		LaSus2 = new JButton();

		Do2 = new JButton();
		Re2 = new JButton();
		Mi2 = new JButton();
		Fa2 = new JButton();
		Sol2 = new JButton();
		La2 = new JButton();
		Si2 = new JButton();

		DoSus3 = new JButton();
		ReSus3 = new JButton();
		FaSus3 = new JButton();
		SolSus3 = new JButton();
		LaSus3 = new JButton();

		Do3 = new JButton();
		Re3 = new JButton();
		Mi3 = new JButton();
		Fa3 = new JButton();
		Sol3 = new JButton();
		La3 = new JButton();
		Si3 = new JButton();

		Do4 = new JButton();

		Bar = new JMenuBar();
		menu = new JMenu();
		MIDI = new JMenuItem();
		synth = new JMenuItem();
		exit = new JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0, 0, 0));
		setMinimumSize(new Dimension(1807, 1036));
		setResizable(false);
		getContentPane().setLayout(null);

		icone = new ImageIcon("images/1.jpg");

		DoSus1.setIcon(icone);
		getContentPane().add(DoSus1);
		DoSus1.setBounds(120, 602, 45, 215);

		ReSus1.setIcon(icone);
		getContentPane().add(ReSus1);
		ReSus1.setBounds(215, 602, 45, 215);

		FaSus1.setIcon(icone);
		getContentPane().add(FaSus1);
		FaSus1.setBounds(340, 602, 45, 215);

		SolSus1.setIcon(icone);
		getContentPane().add(SolSus1);
		SolSus1.setBounds(427, 602, 46, 215);

		LaSus1.setIcon(icone);
		getContentPane().add(LaSus1);
		LaSus1.setBounds(515, 602, 45, 215);

		DoSus2.setIcon(icone);
		getContentPane().add(DoSus2);
		DoSus2.setBounds(640, 602, 45, 215);

		ReSus2.setIcon(icone);
		getContentPane().add(ReSus2);
		ReSus2.setBounds(740, 602, 45, 215);

		FaSus2.setIcon(icone);
		getContentPane().add(FaSus2);
		FaSus2.setBounds(865, 602, 45, 215);

		SolSus2.setIcon(icone);
		getContentPane().add(SolSus2);
		SolSus2.setBounds(952, 602, 45, 215);

		LaSus2.setIcon(icone);
		getContentPane().add(LaSus2);
		LaSus2.setBounds(1040, 602, 45, 215);

		DoSus3.setIcon(icone);
		getContentPane().add(DoSus3);
		DoSus3.setBounds(1165, 602, 45, 215);

		ReSus3.setIcon(icone);
		getContentPane().add(ReSus3);
		ReSus3.setBounds(1265, 602, 45, 215);

		FaSus3.setIcon(icone);
		getContentPane().add(FaSus3);
		FaSus3.setBounds(1390, 602, 45, 215);

		SolSus3.setIcon(icone);
		getContentPane().add(SolSus3);
		SolSus3.setBounds(1477, 602, 45, 215);

		LaSus3.setIcon(icone);
		getContentPane().add(LaSus3);
		LaSus3.setBounds(1565, 602, 45, 215);

		icone = new ImageIcon("images/2.png");

		Do1.setIcon(icone);
		getContentPane().add(Do1);
		Do1.setBounds(75, 602, 75, 350);

		Re1.setIcon(icone);
		getContentPane().add(Re1);
		Re1.setBounds(150, 602, 75, 350);

		Mi1.setIcon(icone);
		getContentPane().add(Mi1);
		Mi1.setBounds(225, 602, 75, 350);

		Fa1.setIcon(icone);
		getContentPane().add(Fa1);
		Fa1.setBounds(300, 602, 75, 350);

		Sol1.setIcon(icone);
		getContentPane().add(Sol1);
		Sol1.setBounds(375, 602, 75, 350);

		La1.setIcon(icone);
		getContentPane().add(La1);
		La1.setBounds(450, 602, 75, 350);

		Si1.setIcon(icone);
		getContentPane().add(Si1);
		Si1.setBounds(525, 602, 75, 350);

		Do2.setIcon(icone);
		getContentPane().add(Do2);
		Do2.setBounds(600, 602, 75, 350);

		Re2.setIcon(icone);
		getContentPane().add(Re2);
		Re2.setBounds(675, 602, 75, 350);

		Mi2.setIcon(icone);
		getContentPane().add(Mi2);
		Mi2.setBounds(750, 602, 75, 350);

		Fa2.setIcon(icone);
		getContentPane().add(Fa2);
		Fa2.setBounds(825, 602, 75, 350);

		Sol2.setIcon(icone);
		getContentPane().add(Sol2);
		Sol2.setBounds(900, 602, 75, 350);

		La2.setIcon(icone);
		getContentPane().add(La2);
		La2.setBounds(975, 602, 75, 350);

		Si2.setIcon(icone);
		getContentPane().add(Si2);
		Si2.setBounds(1050, 602, 75, 350);

		Do3.setIcon(icone);
		getContentPane().add(Do3);
		Do3.setBounds(1125, 602, 75, 350);

		Re3.setIcon(icone);
		getContentPane().add(Re3);
		Re3.setBounds(1200, 602, 75, 350);

		Mi3.setIcon(icone);
		getContentPane().add(Mi3);
		Mi3.setBounds(1275, 602, 75, 350);

		Fa3.setIcon(icone);
		getContentPane().add(Fa3);
		Fa3.setBounds(1350, 602, 75, 350);

		Sol3.setIcon(icone);
		getContentPane().add(Sol3);
		Sol3.setBounds(1425, 602, 75, 350);

		La3.setIcon(icone);
		getContentPane().add(La3);
		La3.setBounds(1500, 602, 75, 350);

		Si3.setIcon(icone);
		getContentPane().add(Si3);
		Si3.setBounds(1575, 602, 75, 350);

		Do4.setIcon(icone);
		getContentPane().add(Do4);
		Do4.setBounds(1650, 602, 75, 350);

		menu.setText("Menu");

		MIDI.setText("MIDI");
		menu.add(MIDI);

		synth.setText("Sintetizador");
		menu.add(synth);

		exit.setText("Sair");
		menu.add(exit);

		Bar.add(menu);

		setJMenuBar(Bar);

		pack();

	}

	/**
	 * Set all components focusable attribute
	 * 
	 * @param flag
	 *            to set focusable
	 */
	private void setAllFocusable(boolean flag) {
		JButton button[] = createJButtonArray();

		for (int i = 0; i < button.length; i++) {
			button[i].setFocusable(flag);
		}

		Bar.setFocusable(flag);
	}

	/**
	 * Create an array of buttons with all buttons of the keyboard order from
	 * left to right
	 * 
	 * @return the JButton array
	 */
	public JButton[] createJButtonArray() {
		JButton button[] = new JButton[37];

		button[0] = Do1;
		button[1] = DoSus1;
		button[2] = Re1;
		button[3] = ReSus1;
		button[4] = Mi1;
		button[5] = Fa1;
		button[6] = FaSus1;
		button[7] = Sol1;
		button[8] = SolSus1;
		button[9] = La1;
		button[10] = LaSus1;
		button[11] = Si1;

		button[12] = Do2;
		button[13] = DoSus2;
		button[14] = Re2;
		button[15] = ReSus2;
		button[16] = Mi2;
		button[17] = Fa2;
		button[18] = FaSus2;
		button[19] = Sol2;
		button[20] = SolSus2;
		button[21] = La2;
		button[22] = LaSus2;
		button[23] = Si2;

		button[24] = Do3;
		button[25] = DoSus3;
		button[26] = Re3;
		button[27] = ReSus3;
		button[28] = Mi3;
		button[29] = Fa3;
		button[30] = FaSus3;
		button[31] = Sol3;
		button[32] = SolSus3;
		button[33] = La3;
		button[34] = LaSus3;
		button[35] = Si3;

		button[36] = Do4;

		return button;
	}

}