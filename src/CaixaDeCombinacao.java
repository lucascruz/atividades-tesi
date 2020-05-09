import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;

class CaixaDeCombinacao extends MinhaJanela {
	String regioes[] = {"Norte", "Nordeste", "Sul", "Sudeste", "Centro Oeste"};
	String cores [] = {"Verde", "Cinza", "Amarelo", "Vermelho", "Azul", "Branco"};
	
	JComboBox cmbRegioes, cmbCores;
	
	CaixaDeCombinacao(String titulo, int largura, int altura){
		super(titulo, largura, altura);
		setLayout(new GridLayout(2,2));
		cmbRegioes = new JComboBox(regioes);
		cmbRegioes.setMaximumRowCount(3);
		
		cmbCores = new JComboBox(regioes);
		cmbCores.setMaximumRowCount(4);
		cmbCores.setEditable(true);
		
		add(new JLabel("Qual sua regiao"));
		add(new JLabel("Qual a sua cor preferida"));
		add(cmbCores);
		add(cmbRegioes);
		
	}
	}