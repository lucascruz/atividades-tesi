import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class CaixaDeListagem extends MinhaJanela{
	
	String regioes[] = {"Norte", "Nordeste", "Sul", "Sudeste", "Centro Oeste"};
	String cores [] = {"Verde", "Cinza", "Amarelo", "Vermelho", "Azul", "Branco"};
	
	JList lstRegioes, lstCores;
	JPanel pnlRotulos, pnlListas;
	
	public CaixaDeListagem(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(new BorderLayout());
		
		pnlRotulos = new JPanel(new GridLayout(1,2));
		pnlRotulos.add(new JLabel("Qual sua regiao"));
		pnlRotulos.add(new JLabel("Quais suas cores preferidas"));
		
		lstRegioes = new JList(regioes);
		lstRegioes.setVisibleRowCount(4);
		lstRegioes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		lstCores = new JList(cores);
		lstCores.setVisibleRowCount(4);
		
		pnlListas = new JPanel(new GridLayout(1, 2));
		pnlListas.add(new JScrollPane(lstRegioes));
		pnlListas.add(new JScrollPane(lstCores));
		
		add(pnlRotulos, BorderLayout.NORTH);
		add(pnlListas);
	}
	

}
