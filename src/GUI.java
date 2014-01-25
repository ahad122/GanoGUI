import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButtonMenuItem;

import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.SwingConstants;


public class GUI extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		
		setBackground(Color.RED);
		setTitle("Elite Ganodermics");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 428);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("Loot");
		
		JButton StartButton = new JButton("Start");
		StartButton.setFont(new Font("Castellar", Font.BOLD, 11));
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.setFont(new Font("Castellar", Font.BOLD, 11));
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblGanoelites = new JLabel("Elite Bandos");
		lblGanoelites.setForeground(Color.BLACK);
		lblGanoelites.setFont(new Font("Cooper Std Black", Font.PLAIN, 27));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(81)
							.addComponent(lblGanoelites))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addComponent(StartButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(ExitButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(68, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGanoelites)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(StartButton)
						.addComponent(ExitButton))
					.addContainerGap())
		);
		
		JList list = new JList();
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Travelling", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("Method to caves");
		lblNewLabel.setFont(new Font("Cooper Std Black", Font.BOLD, 16));
		
		JComboBox methodTodungeon = new JComboBox();
		methodTodungeon.setModel(new DefaultComboBoxModel(new String[] {"Walk", "Trollheim Spell", "Trollheim Tab"}));
		
		JLabel lblMethodToBank = new JLabel("Method to Bank");
		lblMethodToBank.setFont(new Font("Cooper Std Black", Font.PLAIN, 16));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Varrock Tab", "Falador Tab"}));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(81)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMethodToBank, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblNewLabel)
							.addComponent(methodTodungeon, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(58, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(methodTodungeon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblMethodToBank)
					.addGap(4)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(163, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Looting", null, panel_2, null);
		
		JLabel lblWhatToLoot = new JLabel("Looting Options");
		lblWhatToLoot.setFont(new Font("Cooper Std Black", Font.BOLD, 16));
		
		JCheckBox cbChestplate = new JCheckBox("Bandos Chestplate");
		
		JCheckBox cbTasset = new JCheckBox("Bandos Tassets");
		
		JCheckBox cbHelm = new JCheckBox("Bandos Helmet");
		
		JCheckBox cbBoots = new JCheckBox("Bandos Boots");
		
		JCheckBox cbGloves = new JCheckBox("Bandos gloves");
		
		JCheckBox cbWarshield = new JCheckBox("Bandos Warshield");
		
		JCheckBox cbRunePlate = new JCheckBox("Rune Platebody");
		
		JCheckBox cbCoins = new JCheckBox("Coins");
		
		JCheckBox cbHilt = new JCheckBox("Bandos Hilt");
		
		JCheckBox cbShard1 = new JCheckBox("Godshard 1");
		
		JCheckBox cbShard2 = new JCheckBox("Godshard 2");
		
		JCheckBox cbShard3 = new JCheckBox("Godshard 3");
		
		JCheckBox cbMagicLog = new JCheckBox("Magic Log");
		
		JCheckBox cbCoal = new JCheckBox("Coal");
		
		JCheckBox cbAdOre = new JCheckBox("Adamant Ore");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(85)
							.addComponent(lblWhatToLoot))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(cbChestplate)
								.addComponent(cbGloves)
								.addComponent(cbHelm)
								.addComponent(cbBoots)
								.addComponent(cbTasset))
							.addGap(14)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(cbCoal)
								.addComponent(cbMagicLog)
								.addComponent(cbShard3)
								.addComponent(cbShard2)
								.addComponent(cbShard1)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(cbWarshield)
								.addComponent(cbRunePlate)
								.addComponent(cbAdOre))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(cbCoins)
								.addComponent(cbHilt))))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(11)
					.addComponent(lblWhatToLoot)
					.addGap(7)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(cbChestplate)
						.addComponent(cbShard1))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbShard2)
						.addComponent(cbTasset))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbShard3)
						.addComponent(cbHelm))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbBoots)
						.addComponent(cbMagicLog))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbGloves)
						.addComponent(cbCoal))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbWarshield)
						.addComponent(cbHilt))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbRunePlate)
						.addComponent(cbCoins))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbAdOre)
					.addGap(45))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Banking", null, panel_1, null);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEnabled(false);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
		
		final JCheckBox Praycheck = new JCheckBox("Enable Prayer");
		
		
		final JComboBox comboBox_3 = new JComboBox(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"});
		comboBox_3.setEnabled(false);
		
		final JCheckBox chckbxEnableRenewals = new JCheckBox("Enable Renewals");
		
		
		final JCheckBox PrayerFlask = new JCheckBox("Flasks?");
		PrayerFlask.setEnabled(false);
		
		final JComboBox foodType = new JComboBox();
		foodType.setEnabled(false);
		foodType.setModel(new DefaultComboBoxModel(new String[] {"Monkfish", "Shark", "Manta Ray", "Rocktail"}));
		
		final JCheckBox renewalFlasks = new JCheckBox("Flasks?");
		renewalFlasks.setEnabled(false);
		
		final JCheckBox cbEnablefood = new JCheckBox("Enable Food");
		
		
		final JComboBox foodNumber = new JComboBox();
		foodNumber.setEnabled(false);
		foodNumber.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		JComboBox cbAttackPot = new JComboBox();
		cbAttackPot.setModel(new DefaultComboBoxModel(new String[] {"Super Attack ", "Extreme Strength"}));
		
		JComboBox cbnumberAtt = new JComboBox();
		cbnumberAtt.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JSeparator separator_2 = new JSeparator();
		
		JSeparator separator_3 = new JSeparator();
		
		JSeparator separator_4 = new JSeparator();
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		
		JComboBox cbStrengthType = new JComboBox();
		cbStrengthType.setModel(new DefaultComboBoxModel(new String[] {"Super Strength", "Extreme Strength"}));
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Super Defence", "Extreme Defence"}));
		
		JComboBox cbnumberStrength = new JComboBox();
		cbnumberStrength.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		
		JComboBox cbnumberDef = new JComboBox();
		cbnumberDef.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4"}));
		
		final JComboBox cbnumOverloads = new JComboBox();
		cbnumOverloads.setEnabled(false);
		cbnumOverloads.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		
		final JCheckBox cbOverloadFlasks = new JCheckBox("Flasks?");
		cbOverloadFlasks.setEnabled(false);
		
		final JCheckBox cbOverloadEnable = new JCheckBox("Enabled Overloads");
		cbOverloadEnable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			cbnumOverloads.setEnabled(cbOverloadEnable.isSelected());
			cbOverloadFlasks.setEnabled(cbOverloadEnable.isSelected());
			
				
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(Praycheck))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addComponent(PrayerFlask))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(2)
							.addComponent(cbOverloadFlasks)
							.addGap(2)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbnumOverloads, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbOverloadEnable))))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxEnableRenewals)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
						.addComponent(renewalFlasks))
					.addGap(6)
					.addComponent(separator_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(cbAttackPot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbStrengthType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(cbnumberAtt, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbnumberStrength, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbnumberDef, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(3)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(cbEnablefood)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(foodType, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(foodNumber, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addGap(25)
					.addComponent(separator_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(187)
					.addComponent(separator_7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(Praycheck)
								.addComponent(cbOverloadEnable))
							.addGap(2)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(PrayerFlask))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(11)
							.addComponent(separator_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(separator_9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(25)
							.addComponent(cbnumOverloads, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(cbOverloadFlasks)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(13)
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(chckbxEnableRenewals)
							.addGap(2)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(renewalFlasks))
						.addComponent(separator_6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(cbAttackPot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(cbStrengthType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(cbnumberAtt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(cbnumberStrength, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(cbnumberDef, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(cbEnablefood)
							.addGap(2)
							.addComponent(foodType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(foodNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(separator_8, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(24)
							.addComponent(separator_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		panel_1.setLayout(gl_panel_1);
		Praycheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
comboBox_2.setEnabled(Praycheck.isSelected());
PrayerFlask.setEnabled(Praycheck.isSelected());
			}
		});
		cbEnablefood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				foodType.setEnabled(cbEnablefood.isSelected());
				foodNumber.setEnabled(cbEnablefood.isSelected());
			}
		});
		chckbxEnableRenewals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_3.setEnabled(chckbxEnableRenewals.isSelected());
				renewalFlasks.setEnabled(chckbxEnableRenewals.isSelected());
				
			}
		});
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Abilities", null, panel_4, null);
		
		JCheckBox cbSever = new JCheckBox("Sever");
		
		JCheckBox cbSlice = new JCheckBox("Slice");
		
		JCheckBox cbSmash = new JCheckBox("Smash");
		
		JCheckBox cbHurricane = new JCheckBox("Hurricane");
		
		JCheckBox cbOverpower = new JCheckBox("Overpower");
		
		JCheckBox cbSlaughter = new JCheckBox("Slaughter");
		
		JCheckBox cbMassacre = new JCheckBox("Massacre");
		
		JCheckBox cbBeserk = new JCheckBox("Beserk");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(cbSever)
						.addComponent(cbSmash)
						.addComponent(cbOverpower)
						.addComponent(cbSlaughter))
					.addGap(14)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(cbMassacre)
						.addComponent(cbBeserk)
						.addComponent(cbHurricane)
						.addComponent(cbSlice))
					.addGap(119))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbSever)
						.addComponent(cbSlice))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbSmash)
						.addComponent(cbHurricane))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbOverpower)
						.addComponent(cbBeserk))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbSlaughter)
						.addComponent(cbMassacre))
					.addContainerGap(164, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		getContentPane().setLayout(groupLayout);
	}
}
