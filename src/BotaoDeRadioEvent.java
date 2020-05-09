import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BotaoDeRadioEvent extends MinhaJanela implements ItemListener{

	JPanel pnlTitulacao;
	ButtonGroup bgrTitulacao;
	JRadioButton rbtGraduacao, rbtEspecializacao, rbtMestrado, rbtDoutorado, rbtPosDoutorado;

	JCheckBox cbxDE;

	public BotaoDeRadioEvent(String titulo, int largura , int altura) {
		super (titulo, largura, altura);

		setLayout(new BorderLayout());
		pnlTitulacao = new JPanel(new GridLayout(5,1));

		
		
		rbtGraduacao = new JRadioButton("Graduacao");
		rbtGraduacao.setMnemonic('g');
		rbtGraduacao.addItemListener(this);
		rbtEspecializacao = new JRadioButton("Especializacao");
		rbtEspecializacao.setMnemonic('e');
		rbtEspecializacao.addItemListener(this);
		rbtMestrado = new JRadioButton("Mestrado");
		rbtMestrado.setMnemonic('m');
		rbtMestrado.addItemListener(this);
		rbtDoutorado = new JRadioButton("Doutorado");
		rbtDoutorado.setMnemonic('d');
		rbtDoutorado.addItemListener(this);
		rbtPosDoutorado = new JRadioButton("PosDoutorado");
		rbtPosDoutorado.setMnemonic('p');
		rbtPosDoutorado.addItemListener(this);




		bgrTitulacao=new ButtonGroup();
		bgrTitulacao.add(rbtGraduacao);
		bgrTitulacao.add(rbtEspecializacao);
		bgrTitulacao.add(rbtMestrado);
		bgrTitulacao.add(rbtDoutorado);
		bgrTitulacao.add(rbtPosDoutorado);
		bgrTitulacao.add(rbtGraduacao);
		bgrTitulacao.add(rbtEspecializacao);
		pnlTitulacao.add(rbtGraduacao);
		pnlTitulacao.add(rbtEspecializacao);
		pnlTitulacao.add(rbtMestrado);
		pnlTitulacao.add(rbtDoutorado);
		pnlTitulacao.add(rbtPosDoutorado);

		cbxDE = new JCheckBox("Dedicacao Exclusiva");
		cbxDE.setMnemonic('x');

		add(new JLabel("Selecione sua titulacao maxima concluida"), BorderLayout.NORTH);
		add(pnlTitulacao);
		add(cbxDE, BorderLayout.SOUTH);
		cbxDE.setEnabled(false);
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==rbtGraduacao || e.getSource() == rbtEspecializacao)
			cbxDE.setEnabled(false);
		else
			cbxDE.setEnabled(true);

	}
}
