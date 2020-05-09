import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JanelaComTabelas extends MinhaJanela {
	JTable tblAlunos;
	String strCabecalho[]={"Seq", "Nome"};
	Object objDados [][]={
			{1, "Laila Baratheon"},
			{2, "Laila Tyrell"},
			{3, "Laila Greyjoy"},
			{4, "Laila Baelish"},
			{5, "Laila Lannister"},
			{6, "Laila Martell"},
			{7, "Laila Stark"},
			{8, "Laila Arryn"}
	};
	
	public JanelaComTabelas(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		tblAlunos = new JTable(objDados, strCabecalho);
		tblAlunos.setToolTipText("Alunos da disciplina TESI-GOT em 15 a.c");
		tblAlunos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tblAlunos.getColumnModel().getColumn(0).setPreferredWidth(30);
		tblAlunos.getColumnModel().getColumn(1).setPreferredWidth(270);
		
		add(new JScrollPane(tblAlunos));
		
	}

	}
