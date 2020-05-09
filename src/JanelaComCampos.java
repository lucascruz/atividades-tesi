import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JanelaComCampos extends MinhaJanela implements ActionListener {

	JLabel lblNome, lblSenha;
	JTextField fldNome;
	JPasswordField fldSenha;
	JButton btnOk, btnCancelar;
	JLabel lblDescricao;
	JanelaComCampos (String titulo, int largura, int altura){
		
		super(titulo, largura, altura);
		setLayout(null);
		
		lblNome = new JLabel("Nome");
		lblNome.setBounds(10,10,120,30);
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10,40,120,30);
		
		fldNome = new JTextField();
		fldNome.setBounds(140, 10, 120, 30);
		fldSenha = new JPasswordField();
		fldSenha.setBounds(140,40,120,30);
		

		btnOk = new JButton("OK");
		btnOk.setMnemonic('O');
		btnOk.setBounds(10,80,120,40);
	//btnOk.setToolTipText("Gravar alguma coisa");


		btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('C');
		btnCancelar.setBounds(160,80,120,40);
		//btnSair.setToolTipText("Cancelar alguma coisa");
		
		JLabel lblDescricao = new JLabel ("Exemplos de paines");
		lblDescricao.setBounds(10, 50, 260, 40);


		
		add(lblNome);
		add(lblSenha);
		add(fldNome);
		add(fldSenha);
		add(btnOk);
		add(btnCancelar);
		fldNome.addActionListener(this);
		btnOk.addActionListener(this);
		
	}
/*	public void actionPerformed(ActionEvent e) {
	String nome = null;
	if(e.getSource() == fldNome)
		nome = fldNome.getText();
	String senha = null;
	if(e.getSource()== fldSenha)
		senha = fldSenha.getText();
	if(e.getSource() == btnOk)
		if(nome == senha)
			lblDescricao.setText("LOGIN EFETUADO!");
	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}