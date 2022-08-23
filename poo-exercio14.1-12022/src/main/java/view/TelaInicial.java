package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.Controle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TelaInicial {

	private JFrame frame;
	private JTextField textJuros;
	private JTextField textNroAnos;
	private JTextField textDepositoMensal;
	private JLabel lblNewLabel_3;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 250);
		frame.setTitle("Poupex");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/icons/icon.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Juros ao mês %:");
		lblNewLabel.setBounds(32, 30, 160, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número de anos:");
		lblNewLabel_1.setBounds(32, 60, 160, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Depósito mensal R$:");
		lblNewLabel_2.setBounds(32, 90, 160, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textJuros = new JTextField();
		textJuros.setBounds(225, 30, 160, 19);
		frame.getContentPane().add(textJuros);
		textJuros.setColumns(10);
		
		textNroAnos = new JTextField();
		textNroAnos.setColumns(10);
		textNroAnos.setBounds(225, 60, 160, 19);
		frame.getContentPane().add(textNroAnos);
		
		textDepositoMensal = new JTextField();
		textDepositoMensal.setColumns(10);
		textDepositoMensal.setBounds(225, 90, 160, 19);
		frame.getContentPane().add(textDepositoMensal);
		
		lblNewLabel_3 = new JLabel("Total poupado:");
		lblNewLabel_3.setBounds(32, 120, 160, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblResposta = new JLabel("");
		lblResposta.setBounds(225, 120, 160, 15);
		frame.getContentPane().add(lblResposta);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double juros = Double.parseDouble(textJuros.getText())/100;
				double anos = Double.parseDouble(textNroAnos.getText());
				double deposito = Double.parseDouble(textDepositoMensal.getText());
				
				lblResposta.setText("R$ "+Double.toString(Controle.calculaTotal(juros, anos, deposito)));
			}
		});
		btnOK.setBounds(225, 150, 160, 25);
		frame.getContentPane().add(btnOK);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResposta.setText(null);
				textJuros.setText(null);
				textNroAnos.setText(null);
				textDepositoMensal.setText(null);
			}
		});
		btnLimpar.setBounds(225, 180, 160, 25);
		frame.getContentPane().add(btnLimpar);
		
	}
}
