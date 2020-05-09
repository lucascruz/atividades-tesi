import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JanelaComTabeladDeModelo extends MinhaJanela {
	JTable tblAlunos;
	public JanelaComTabeladDeModelo (String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		tblAlunos = new JTable(new AlunoTableModel());
		tblAlunos.setToolTipText("Alunos da disciplina TESI-GOT em 15 a.c");
		tblAlunos.setFocusable(false);
		tblAlunos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tblAlunos.getColumnModel().getColumn(0).setPreferredWidth(30);
		tblAlunos.getColumnModel().getColumn(1).setPreferredWidth(270);
		
		add(new JScrollPane(tblAlunos));
		
	}

}
