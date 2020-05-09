import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BotaoDeRadio extends MinhaJanela{
	
	JPanel pnlTitulacao;
	ButtonGroup bgrTitulacao;
	JRadioButton rbtGraduacao, rbtEspecializacao, rbtMestrado, rbtDoutorado, rbtPosDoutorado;
	
	JCheckBox cbxDE;
	
	public BotaoDeRadio(String titulo, int largura , int altura) {
		super (titulo, largura, altura);
		
		setLayout(new BorderLayout());
		pnlTitulacao = new JPanel(new GridLayout(5,1));
		
		rbtGraduacao = new JRadioButton("Graduacao");
		rbtGraduacao.setMnemonic('g');
		rbtEspecializacao = new JRadioButton("Especializacao");
		rbtEspecializacao.setMnemonic('e');
		rbtMestrado = new JRadioButton("Mestrado");
		rbtMestrado.setMnemonic('m');
		rbtDoutorado = new JRadioButton("Doutorado");
		rbtDoutorado.setMnemonic('d');
		rbtPosDoutorado = new JRadioButton("PosDoutorado");
		rbtPosDoutorado.setMnemonic('p');
	
	
	
	
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

}
}
