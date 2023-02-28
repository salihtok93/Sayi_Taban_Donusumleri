package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AnaEkranGUI extends JFrame {
	
	private String tabanlar[] = {"İkili","Sekizli","Onlu","Onaltılı"};

	private JPanel w_pane;
	private JTextField fld_sayi;
	private JTextField fld_sonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaEkranGUI frame = new AnaEkranGUI();
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
	public AnaEkranGUI() {
		setTitle("Taban Donusum Hesaplama Aracı");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		w_pane = new JPanel();
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JTabbedPane w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBounds(10, 10, 788, 437);
		w_pane.add(w_tabpane);
		
		JPanel panel = new JPanel();
		w_tabpane.addTab("Taban Donusum Hesaplama Aracı", null, panel, null);
		panel.setLayout(null);
		
		JLabel lbl_Sayi = new JLabel("Sayı : ");
		lbl_Sayi.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		lbl_Sayi.setBounds(41, 44, 52, 27);
		panel.add(lbl_Sayi);
		
		fld_sayi = new JTextField();
		fld_sayi.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		fld_sayi.setBounds(183, 42, 160, 27);
		panel.add(fld_sayi);
		fld_sayi.setColumns(10);
		
		JLabel lbl_SayininTaban = new JLabel("Sayının tabanı : ");
		lbl_SayininTaban.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		lbl_SayininTaban.setBounds(41, 107, 136, 27);
		panel.add(lbl_SayininTaban);
		
		JLabel lbl_YeniTaban = new JLabel("Yeni taban : ");
		lbl_YeniTaban.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		lbl_YeniTaban.setBounds(41, 172, 136, 27);
		panel.add(lbl_YeniTaban);
		
		JComboBox cbox_sayitaban = new JComboBox(tabanlar);
		cbox_sayitaban.setMaximumRowCount(5);
		cbox_sayitaban.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		cbox_sayitaban.setBounds(183, 108, 160, 26);
		panel.add(cbox_sayitaban);
		
		JComboBox cbox_yenitaban = new JComboBox(tabanlar);
		cbox_yenitaban.setSelectedIndex(2);
		cbox_yenitaban.setMaximumRowCount(5);
		cbox_yenitaban.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		cbox_yenitaban.setBounds(183, 173, 160, 26);
		panel.add(cbox_yenitaban);
		
		JButton btn_hesapla = new JButton("Hesapla");
		btn_hesapla.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		btn_hesapla.setBounds(41, 225, 302, 27);
		panel.add(btn_hesapla);
		
		JLabel lbl_sonuc = new JLabel("Sonuc : ");
		lbl_sonuc.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		lbl_sonuc.setBounds(41, 291, 69, 27);
		panel.add(lbl_sonuc);
		
		fld_sonuc = new JTextField();
		fld_sonuc.setEditable(false);
		fld_sonuc.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
		fld_sonuc.setColumns(10);
		fld_sonuc.setBounds(183, 291, 160, 27);
		panel.add(fld_sonuc);
	}
}
