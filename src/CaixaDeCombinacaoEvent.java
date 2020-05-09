import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

class CaixaDeCombinacaoEvent extends MinhaJanela implements ItemListener {
	String regioes[] = {"Norte", "Nordeste", "Sul", "Sudeste", "Centro Oeste"};
	String cores [] = {"Verde", "Cinza", "Amarelo", "Vermelho", "Azul", "Branco"};
	Color rgb[] = {Color.GREEN, Color.GRAY, Color.YELLOW, Color.RED, Color.BLUE, Color.WHITE};
	
	JLabel lblRegiao, lblCor;
	
	JComboBox cmbRegioes, cmbCores;
	
	CaixaDeCombinacaoEvent(String titulo, int largura, int altura){
		super(titulo, largura, altura);
		setLayout(new GridLayout(3,2));
		
		
		cmbRegioes = new JComboBox(regioes);
		cmbRegioes.setMaximumRowCount(3);
		cmbRegioes.addItemListener(this);
		
		cmbCores = new JComboBox(cores);
		cmbCores.setMaximumRowCount(4);
		cmbCores.setEditable(true);
		cmbCores.addItemListener(this);
		
		lblRegiao = new JLabel(regioes[0]);
		lblCor = new JLabel(cores[0]);
		lblCor.setOpaque(true);
		lblCor.setBackground(rgb[0]);
		
		
		add(new JLabel("Qual sua regiao"));
		add(new JLabel("Qual a sua cor preferida"));
		add(cmbRegioes);
		add(cmbCores);
		add(lblRegiao);
		add(lblCor);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbRegioes)
			lblRegiao.setText(regioes[cmbRegioes.getSelectedIndex()]);
		if (e.getSource() == cmbCores){
			lblCor.setText(cores[cmbCores.getSelectedIndex()]);
			lblCor.setBackground(rgb[cmbCores.getSelectedIndex()]);
		}
		
	}
	}