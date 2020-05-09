import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaComPaineis extends MinhaJanela implements ActionListener {
	JPanel pnlSuperior, pnlInferior;
	JLabel lblBoasVindas, lblDescricao;
	JButton btnGravar, btnCancelar;

	JanelaComPaineis (String titulo, int largura, int altura){
		super(titulo, largura, altura);
		setLayout(null);

		pnlSuperior = new JPanel();
		pnlSuperior.setLayout(null);
		pnlSuperior.setBounds(10, 10, 280, 130);
		pnlSuperior.setBackground(Color.GRAY);

		pnlInferior = new JPanel();
		pnlInferior.setLayout(null);
		pnlInferior.setBounds(10, 150, 280, 130);
		pnlInferior.setBackground(Color.CYAN);

		lblBoasVindas = new JLabel ("Bem vindo");
		lblBoasVindas.setBounds(10, 10 , 260, 40);

		lblDescricao = new JLabel ("Exemplos de paines");
		lblDescricao.setBounds(10, 50, 260, 40);
		

		btnGravar = new JButton("Enviar");
		btnGravar.setMnemonic('E');
		btnGravar.setBounds(10,60,120,40);
		btnGravar.setToolTipText("Enviar");


		btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('C');
		btnCancelar.setBounds(150,60,120,40);
		btnCancelar.setToolTipText("Cancelar alguma coisa");

		pnlSuperior.add(lblBoasVindas);
		pnlSuperior.add(lblDescricao);

		pnlInferior.add(btnGravar);
		pnlInferior.add(btnCancelar);

		add(pnlSuperior);
		add(pnlInferior);
		btnGravar.addActionListener(this);

		btnCancelar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnGravar)
			lblDescricao.setText("Voce pressionou o botao Gravar!");
		if(e.getSource()== btnCancelar)
			lblDescricao.setText("Voce pressionou o botao cancelar!");
	}

}
