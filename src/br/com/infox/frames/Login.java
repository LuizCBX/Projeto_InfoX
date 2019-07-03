package br.com.infox.frames;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.sql.*;

import br.com.infox.dal.ConnectionModule;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	
	// Criando vari�veis de apoio
	Connection con = ConnectionModule.conector(); // Conecta com o banco
	PreparedStatement pst = null; //executa
	ResultSet rs = null;// Resultado do banco

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario.setBounds(45, 58, 84, 21);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSenha.setBounds(45, 103, 84, 21);
		contentPane.add(lblSenha);
		
		txtUser = new JTextField();
		txtUser.setBounds(143, 59, 180, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLogin.setBounds(195, 155, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/br/com/infox/icons/dberror.png")));
		lblStatus.setBounds(371, 21, 48, 46);
		contentPane.add(lblStatus);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(143, 104, 180, 20);
		contentPane.add(txtPassword);
		
		//conex�o
		con = ConnectionModule.conector();
		
		if(con != null) {
			//System.out.println("banco conectado");
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/dbok.png")));
		}else {
			//System.out.println("erro de conex�o");
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/dberror.png")));
		}
				
	}//fim construtor
	
	//limpar 
	
	private void limpar() {
		txtUser.setText(null);
		txtPassword.setText(null);
	}
	
	//login --
	private void login() {
		String read = "select * from tb_usuarios where loginUsuario = ? and senhaUsuario = ?";
		try {
			pst = con.prepareStatement(read);
			pst.setString(1, txtUser.getText());
			pst.setString(2,txtPassword.getText());
			rs =  pst.executeQuery();
			
			if(rs.next()) {
				Principal principal = new Principal();
				principal.setVisible(true);
				//Centralizar o JFRAME
				principal.setLocationRelativeTo(null);
				this.dispose(); //depois que chamar a tela principal, fecha a tela de login
				
			}else {
				JOptionPane.showMessageDialog(null, "Usu�rio e/ou senha inv�lido(s)");
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
