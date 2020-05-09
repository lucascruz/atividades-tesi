import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JanelaTabelaCampos extends MinhaJanela implements ActionListener {
	JTable tblAlunos;
	String strCabecalho[]={"Seq", "Nome"};
	Object objDados [][]={
			{1, "Baratheon"},
			{2, "Tyrell"},
			{3, "Greyjoy"},
			{4, "Baelish"},
			{5, "Lannister"},
			{6, "Martell"},
			{7, "Stark"},
			{8, "Arryn"}
	};
	JLabel lblIDT, lblNome;
	JTextField fldIDT, fldNome;
	JPanel pnlInferior, pnlSuperior, pnlInferiorAcoes;
	JScrollPane text;
	JButton btnIncluir, btnRetirar;


	public JanelaTabelaCampos(String titulo, int largura, int altura) {
		super(titulo, largura, altura);


		// Definição painel superior

		pnlSuperior = new JPanel();
		pnlSuperior.setLayout(new BorderLayout());
		pnlSuperior.setBounds(10, 10, 280, 130);
		pnlSuperior.setBackground(Color.GRAY);

		//Tabela

		tblAlunos = new JTable(objDados, strCabecalho);
		tblAlunos.setToolTipText("Alunos da disciplina TESI-GOT em 15 a.c");		
		pnlSuperior.add(new JScrollPane(tblAlunos));


		//Definição painel inferior

		pnlInferior = new JPanel();
		pnlInferior.setLayout(new FlowLayout());
		pnlInferior.setBounds(10, 150, 500, 500);
		pnlInferior.setBackground(Color.CYAN);

		// ID Label e Campo
		lblIDT = new JLabel ("Informe Sequencia:");
		//lblIDT.setBounds(10, 10 , 200, 40);
		fldIDT = new JTextField(20);
		//fldIDT.setBounds(85, 15, 200, 30);

		pnlInferior.add(lblIDT);
		pnlInferior.add(fldIDT);

		//Nome Label e Campo
		lblNome = new JLabel ("Informe Nome:");
		//lblNome.setBounds(10, 10, 200, 40);
		fldNome = new JTextField(20);
		//fldNome.setBounds(315, 15, 200, 30);
		fldNome.addActionListener(this);

		pnlInferior.add(lblNome);
		pnlInferior.add(fldNome);

		// Painel Acoes = Botoes Incluir e Retirar

		pnlInferiorAcoes = new JPanel();
		pnlInferiorAcoes.setLayout(new GridLayout(1,2));
		pnlInferiorAcoes.setBounds(10, 150, 280, 130);
		pnlInferiorAcoes.setBackground(Color.CYAN);
		btnIncluir = new JButton("Incluir");
		btnIncluir.setMnemonic('I');
		btnIncluir.setBounds(10, 10, 240, 40);
		btnIncluir.setToolTipText("Incluir no registro");
		btnRetirar = new JButton("Retirar");
		btnRetirar.setMnemonic('R');
		btnRetirar.setBounds(30, 60, 240, 40);
		btnRetirar.setToolTipText("Retirar do registro");
		btnRetirar.setEnabled(true);
		pnlInferiorAcoes.add(btnIncluir);
		pnlInferiorAcoes.add(btnRetirar);

		add(pnlSuperior,BorderLayout.NORTH);
		add(pnlInferior);
		add(pnlInferiorAcoes, BorderLayout.SOUTH);


	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
