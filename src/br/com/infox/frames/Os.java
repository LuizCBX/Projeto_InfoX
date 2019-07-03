package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Os extends JFrame {

	private JPanel contentPane;
	private JTextField txtOs;
	private JTextField txtData;
	private JTextField txtCliente;
	private JTextField txtId;
	private JTextField txtEquipamento;
	private JTextField txtDefeito;
	private JTextField txtServico;
	private JTextField txtTecnico;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Os frame = new Os();
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
	public Os() {
		setTitle("OS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 741, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 270, 126);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOs = new JLabel("OS:");
		lblOs.setBounds(10, 22, 48, 14);
		panel.add(lblOs);
		
		JLabel lblData = new JLabel("DATA:");
		lblData.setBounds(139, 22, 48, 14);
		panel.add(lblData);
		
		txtOs = new JTextField();
		txtOs.setEnabled(false);
		txtOs.setBounds(10, 47, 96, 20);
		panel.add(txtOs);
		txtOs.setColumns(10);
		
		txtData = new JTextField();
		txtData.setEnabled(false);
		txtData.setColumns(10);
		txtData.setBounds(139, 47, 121, 20);
		panel.add(txtData);
		
		JRadioButton rbOs = new JRadioButton("Or\u00E7amento");
		rbOs.setBounds(10, 89, 109, 23);
		panel.add(rbOs);
		
		JRadioButton rbData = new JRadioButton("OS");
		rbData.setBounds(139, 89, 109, 23);
		panel.add(rbData);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(290, 11, 421, 189);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 11, 48, 14);
		panel_1.add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(10, 36, 229, 20);
		panel_1.add(txtCliente);
		txtCliente.setColumns(10);
		
		JLabel lblPesquisar = new JLabel("");
		lblPesquisar.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/pesquisar.png")));
		lblPesquisar.setBounds(249, 24, 32, 32);
		panel_1.add(lblPesquisar);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(291, 39, 32, 14);
		panel_1.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(315, 36, 96, 20);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 67, 401, 111);
		panel_1.add(textPane);
		
		JComboBox cbSituacao = new JComboBox();
		cbSituacao.setBounds(10, 178, 270, 22);
		contentPane.add(cbSituacao);
		cbSituacao.setModel(new DefaultComboBoxModel(new String[] {"Aguardando aprova\u00E7\u00E3o do cliente", "Aguardando pe\u00E7as", "Na bancada", "Equipamento pronto, aguardadando retirada", "Equipamento entregue", "Equipamento devolvido sem manuten\u00E7\u00E3o", "Garantia"}));
		
		JLabel lblSituacao = new JLabel("Situa\u00E7\u00E3o:");
		lblSituacao.setBounds(10, 153, 81, 14);
		contentPane.add(lblSituacao);
		
		JLabel lblEquipamento = new JLabel("Equipamento:");
		lblEquipamento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEquipamento.setBounds(10, 239, 81, 14);
		contentPane.add(lblEquipamento);
		
		JLabel lblDefeito = new JLabel("Defeito:");
		lblDefeito.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDefeito.setBounds(10, 278, 81, 14);
		contentPane.add(lblDefeito);
		
		JLabel lblServico = new JLabel("Servi\u00E7o:");
		lblServico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServico.setBounds(10, 319, 81, 14);
		contentPane.add(lblServico);
		
		txtEquipamento = new JTextField();
		txtEquipamento.setBounds(101, 236, 610, 20);
		contentPane.add(txtEquipamento);
		txtEquipamento.setColumns(10);
		
		txtDefeito = new JTextField();
		txtDefeito.setColumns(10);
		txtDefeito.setBounds(101, 275, 610, 20);
		contentPane.add(txtDefeito);
		
		txtServico = new JTextField();
		txtServico.setColumns(10);
		txtServico.setBounds(101, 316, 610, 20);
		contentPane.add(txtServico);
		
		txtTecnico = new JTextField();
		txtTecnico.setColumns(10);
		txtTecnico.setBounds(101, 354, 335, 20);
		contentPane.add(txtTecnico);
		
		JLabel lblTecnico = new JLabel("T\u00E9cnico:");
		lblTecnico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTecnico.setBounds(10, 357, 81, 14);
		contentPane.add(lblTecnico);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(403, 357, 81, 14);
		contentPane.add(lblTotal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(494, 354, 219, 20);
		contentPane.add(textField);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(101, 393, 610, 53);
		contentPane.add(textPane_1);
		
		JLabel lblObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservacao.setBounds(10, 412, 81, 14);
		contentPane.add(lblObservacao);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setToolTipText("Adicionar OS");
		btnAdicionar.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/create.png")));
		btnAdicionar.setBounds(198, 457, 64, 64);
		contentPane.add(btnAdicionar);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setToolTipText("Pesquisar OS");
		btnPesquisar.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/read.png")));
		btnPesquisar.setBounds(272, 457, 64, 64);
		contentPane.add(btnPesquisar);
		
		JButton btnAtualizar = new JButton("");
		btnAtualizar.setToolTipText("Atualizar OS");
		btnAtualizar.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/update.png")));
		btnAtualizar.setBounds(346, 457, 64, 64);
		contentPane.add(btnAtualizar);
		
		JButton btnDeletar = new JButton("");
		btnDeletar.setToolTipText("Deletar OS");
		btnDeletar.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/delete.png")));
		btnDeletar.setBounds(420, 457, 64, 64);
		contentPane.add(btnDeletar);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setToolTipText("Imprimir OS");
		btnImprimir.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/print.png")));
		btnImprimir.setBounds(490, 457, 64, 64);
		contentPane.add(btnImprimir);
	}
}
