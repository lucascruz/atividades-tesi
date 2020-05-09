import java.awt.event.ActionEvent;

import javax.swing.*;
public class JanelaComBotoes  extends MinhaJanela{
	JButton btnNovo, btnSalva, btnDelete, btnSair;
	

	JanelaComBotoes(String titulo, int largura, int altura){
		super(titulo, largura, altura);
		setLayout(null);
		
		btnNovo = new JButton("Novo");
		btnNovo.setMnemonic('N');
		btnNovo.setBounds(10, 10, 120, 40);
		btnNovo.setToolTipText("Criar um novo registro");
		
		btnSalva = new JButton("Salva");
		btnSalva.setMnemonic('S');
		btnSalva.setBounds(30, 60, 120, 40);
		btnSalva.setToolTipText("Salvar registro atual");
		btnSalva.setEnabled(false);
		
		btnDelete = new JButton("Deletar");
		btnDelete.setMnemonic('D');
		btnDelete.setBounds(50, 110, 120, 40);
		btnDelete.setToolTipText("Salvar registro atual");
		//btnDelete.setEnabled(false);
		
		btnSair = new JButton("Sair");
		btnSair.setMnemonic('S');
		btnSair.setBounds(70,160,120,40);
		btnSair.setToolTipText("Sair do sistema");
		//btnSair.addActionListener(this);
		

		add(btnNovo);
		add(btnSalva);
		add(btnDelete);
		add(btnSair);
	}
}
