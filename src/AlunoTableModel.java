import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class AlunoTableModel  extends AbstractTableModel{
	JTable tblAlunos;
	private String strColunas[]={"Seq", "Nome"};
	private Object objLinhas [][]={
			{1, "Laila Baratheon"},
			{2, "Laila Tyrell"},
			{3, "Laila Greyjoy"},
			{4, "Laila Baelish"},
			{5, "Laila Lannister"},
			{6, "Laila Martell"},
			{7, "Laila Stark"},
			{8, "Laila Arryn"}
	};
	
	public int getRowCount(){
		return objLinhas.length;
	}
	public int getColumnCount(){
		return strColunas.length;
	}
	public String getColumnName(int columnIndex){
		return strColunas[columnIndex];
	}
	public Object getValueAt(int rowIndex, int columnIndex){
		return objLinhas[rowIndex][columnIndex];
	}
	public boolean isCellEditable (int rowIndex, int columnIndex){
		return false;
	}
	public Class getColumnClass(int columnIndex){
		return getValueAt(0, columnIndex).getClass();
	}
}
