import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CaixaDeChecagemEvent extends MinhaJanela implements ActionListener{
	
	JPanel pnlOpcionais;	
	JCheckBox cbxCondicionador, cbxHidraulica, cbxLigaLeve, cbxSom, cbxTrio;
	JButton btnProcessar;
	
	CaixaDeChecagemEvent(String titulo, int largura, int altura) {
		super (titulo,largura,altura);
		setLayout(new BorderLayout());
		
		pnlOpcionais = new JPanel(new GridLayout(5, 1));
		cbxCondicionador = new JCheckBox("Condicionador de AR");
		cbxCondicionador.setMnemonic('c');
		cbxHidraulica = new JCheckBox("Direcao Hidraulica");
		cbxHidraulica.setMnemonic('h');
		cbxLigaLeve = new JCheckBox("Rodas de liga leve");
		cbxLigaLeve.setMnemonic('l');
		cbxSom = new JCheckBox("Som com bluetooth");
		cbxSom.setMnemonic('s');
		cbxTrio = new JCheckBox("Trio eletrico");
		cbxTrio.setMnemonic('t');
		btnProcessar = new JButton("Processar");
		btnProcessar.addActionListener(this);
		
		
		pnlOpcionais.add(cbxCondicionador);
		pnlOpcionais.add(cbxHidraulica);
		pnlOpcionais.add(cbxLigaLeve);
		pnlOpcionais.add(cbxSom);
		pnlOpcionais.add(cbxTrio);

		add(new JLabel("Selecione os itens opcionais para seu veiculo"), BorderLayout.NORTH);
		add(pnlOpcionais);
		add(btnProcessar, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String strOpcionais = "Opcionais Selecionados:";
		if(cbxCondicionador.isSelected())
			strOpcionais = strOpcionais + "\n" + cbxCondicionador.getText();
		if(cbxHidraulica.isSelected())
			strOpcionais = strOpcionais + "\n" + cbxHidraulica.getText();
		if(cbxLigaLeve.isSelected())
			strOpcionais = strOpcionais + "\n" + cbxLigaLeve.getText();
		if(cbxSom.isSelected())
			strOpcionais = strOpcionais + "\n" + cbxSom.getText();
		if(cbxTrio.isSelected())
			strOpcionais = strOpcionais + "\n" + cbxTrio.getText();
		if (strOpcionais == "Opcionais Selecionados:")
			strOpcionais = "Nenhum opcional foi selecionado";
		JOptionPane.showMessageDialog(this, strOpcionais, "Seleção de Opcionais",JOptionPane.INFORMATION_MESSAGE);
	}

}
