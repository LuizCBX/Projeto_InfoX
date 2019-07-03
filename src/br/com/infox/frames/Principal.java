package br.com.infox.frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				
				alterarLabel();//ALTERANDO A DATA E HORA
			}
		});
		setTitle("infoX - Sistema para controle de OS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/x.png")));
		lblNewLabel.setBounds(382, 168, 256, 256);
		contentPane.add(lblNewLabel);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			//Clicando no botão, direciona para a janela Sobre (principal --> About)
			public void actionPerformed(ActionEvent e) {
				About sobre  = new About();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBounds(508, 40, 89, 23);
		contentPane.add(btnSobre);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setToolTipText("Cliente");
		btnCliente.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/Cliente.png")));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Clientes cliente = new Clientes();
				cliente.setVisible(true);
				
			}
		});
		btnCliente.setBounds(29, 21, 128, 128);
		contentPane.add(btnCliente);
		
		JButton btnOs = new JButton("OS");
		btnOs.setToolTipText("OS");
		btnOs.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/relatorio.png")));
		btnOs.addActionListener(new ActionListener() {
			
			//Clicando no botão OS, vai para tela OS
			public void actionPerformed(ActionEvent e) {
				
				Os os = new Os();
				os.setVisible(true);
			}
		});
		btnOs.setBounds(201, 21, 128, 128);
		contentPane.add(btnOs);
		
		JButton btnRelatorios = new JButton("Relat\u00F3rios");
		btnRelatorios.setToolTipText("Relat\u00F3rio");
		btnRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/relatoriook.png")));
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reports report = new Reports();
				report.setVisible(true);
			}
		});
		btnRelatorios.setBounds(201, 175, 128, 128);
		contentPane.add(btnRelatorios);
		
		JButton btnUsuarios = new JButton("Usu\u00E1rios");
		btnUsuarios.setToolTipText("Usu\u00E1rios");
		btnUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/usuarios.png")));
		btnUsuarios.addActionListener(new ActionListener() {
			
			//Principal para Usuarios
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true);
			}
		});
		btnUsuarios.setBounds(29, 175, 128, 128);
		contentPane.add(btnUsuarios);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 428, 638, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("New label");
		lblData.setForeground(Color.WHITE);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblData.setBounds(26, 11, 281, 29);
		panel.add(lblData);
	}
	
	//HORA E DATA
	private void alterarLabel() {
		Date data = new Date(); //CRIANDO UM OBJETO
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblData.setText(formatador.format(data));
	}
	
	
}
