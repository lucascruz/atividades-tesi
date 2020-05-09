import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CaixaDeChecagem extends MinhaJanela{
	
	JPanel pnlOpcionais;	
	JCheckBox cbxCondicionador, cbxHidraulica, cbxLigaLeve, cbxSom, cbxTrio;
	
	CaixaDeChecagem(String titulo, int largura, int altura) {
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
		
		pnlOpcionais.add(cbxCondicionador);
		pnlOpcionais.add(cbxHidraulica);
		pnlOpcionais.add(cbxLigaLeve);
		pnlOpcionais.add(cbxSom);
		pnlOpcionais.add(cbxTrio);

		add(new JLabel("Selecione os itens opcionais para seu veiculo"), BorderLayout.NORTH);
		add(pnlOpcionais);
	}

}
