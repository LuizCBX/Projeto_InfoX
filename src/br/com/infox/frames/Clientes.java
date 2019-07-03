package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JTable table;
	private JTextField txtTipoLogradouro;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtFone1;
	private JTextField txtEmail;
	private JTextField txtFone2;
	private JTextField txtCep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setResizable(false);
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 782, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setBounds(22, 26, 229, 20);
		contentPane.add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/pesquisar.png")));
		lblNewLabel.setBounds(261, 20, 32, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblCamposObrigatrio = new JLabel("* Campos obrigat\u00F3rios");
		lblCamposObrigatrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCamposObrigatrio.setBounds(524, 29, 180, 14);
		contentPane.add(lblCamposObrigatrio);
		
		table = new JTable();
		table.setBounds(22, 66, 720, 143);
		contentPane.add(table);
		
		JLabel lblNome = new JLabel("* Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(22, 238, 48, 14);
		contentPane.add(lblNome);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(82, 235, 660, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setBounds(-4, 306, 74, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComplemento.setBounds(579, 306, 90, 14);
		contentPane.add(lblComplemento);
		
		txtTipoLogradouro = new JTextField();
		txtTipoLogradouro.setBounds(80, 303, 96, 20);
		contentPane.add(txtTipoLogradouro);
		txtTipoLogradouro.setColumns(10);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(186, 303, 193, 20);
		contentPane.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		JLabel lblNumero = new JLabel("* N\u00FAmero:");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setBounds(389, 306, 74, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(473, 303, 96, 20);
		contentPane.add(txtNumero);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		txtComplemento.setBounds(679, 303, 63, 20);
		contentPane.add(txtComplemento);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setBounds(-4, 336, 74, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("* Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setBounds(378, 336, 59, 14);
		contentPane.add(lblCidade);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(80, 334, 299, 20);
		contentPane.add(txtBairro);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(447, 333, 180, 20);
		contentPane.add(txtCidade);
		
		JLabel lblUf = new JLabel("* UF:");
		lblUf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUf.setBounds(637, 336, 48, 14);
		contentPane.add(lblUf);
		
		JComboBox cbUf = new JComboBox();
		cbUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		cbUf.setBounds(695, 334, 47, 22);
		contentPane.add(cbUf);
		
		JLabel lblFone1 = new JLabel("* Fone 1:");
		lblFone1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFone1.setBounds(22, 368, 48, 14);
		contentPane.add(lblFone1);
		
		JLabel lblFone2 = new JLabel("Fone 2:");
		lblFone2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFone2.setBounds(229, 368, 48, 14);
		contentPane.add(lblFone2);
		
		txtFone1 = new JTextField();
		txtFone1.setColumns(10);
		txtFone1.setBounds(80, 365, 139, 20);
		contentPane.add(txtFone1);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(493, 364, 249, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtFone2 = new JTextField();
		txtFone2.setColumns(10);
		txtFone2.setBounds(287, 365, 139, 20);
		contentPane.add(txtFone2);
		
		JLabel lblEmail = new JLabel("* E-Mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(436, 368, 48, 14);
		contentPane.add(lblEmail);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/create.png")));
		btnAdicionar.setBounds(271, 396, 64, 64);
		contentPane.add(btnAdicionar);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/update.png")));
		btnAlterar.setBounds(362, 396, 64, 64);
		contentPane.add(btnAlterar);
		
		JButton btnApagar = new JButton("");
		btnApagar.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/delete.png")));
		btnApagar.setBounds(447, 395, 64, 64);
		contentPane.add(btnApagar);
		
		JButton btnBuscaCep = new JButton("Buscar CEP");
		btnBuscaCep.setBounds(229, 266, 116, 23);
		contentPane.add(btnBuscaCep);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		txtCep.setBounds(82, 266, 139, 20);
		contentPane.add(txtCep);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setBounds(22, 269, 48, 14);
		contentPane.add(lblCep);
	}
}
