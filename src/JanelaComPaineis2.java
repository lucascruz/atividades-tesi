import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class JanelaComPaineis2 extends MinhaJanela implements ActionListener {
	JPanel pnlSuperior, pnlInferior;
	JLabel lblBoasVindas, lblDescricao;
	JButton btnGravar, btnCancelar;
	
	JPopupMenu pmCores = new JPopupMenu();
	JRadioButtonMenuItem miVerde, miAmarelo, miAzul;
	ButtonGroup bgrCores = new ButtonGroup();
	JMenuItem miGravar, miCancelar;

	JanelaComPaineis2 (String titulo, int largura, int altura){
		super(titulo, largura, altura);
		setLayout(null);
		
		miVerde=new JRadioButtonMenuItem("Verde");
		miVerde.addActionListener(this);
		
		miAmarelo=new JRadioButtonMenuItem("Amarelo");
		miAmarelo.addActionListener(this);
		
		miAzul=new JRadioButtonMenuItem("Azul");
		miAzul.addActionListener(this);
		
		miGravar=new JMenuItem("Gravar");
		miGravar.addActionListener(this);
		
		miCancelar=new JMenuItem("Cancelar");
		miCancelar.addActionListener(this);
		
		bgrCores.add(miVerde);
		bgrCores.add(miAmarelo);
		bgrCores.add(miAzul);
		
		
		pmCores.add(miAmarelo);
		pmCores.add(miVerde);
		pmCores.add(miAzul);
		pmCores.addSeparator();
		pmCores.add(miGravar);
		pmCores.add(miCancelar);
		

		pnlSuperior = new JPanel();
		pnlSuperior.setLayout(null);
		pnlSuperior.setBounds(10, 10, 280, 130);
		pnlSuperior.setBackground(Color.GRAY);

		pnlInferior = new JPanel();
		pnlInferior.setLayout(null);
		pnlInferior.setBounds(10, 150, 280, 130);
		pnlInferior.setBackground(Color.CYAN);

		lblBoasVindas = new JLabel ("Bem vindo");
		lblBoasVindas.setBounds(10, 10 , 260, 40);

		lblDescricao = new JLabel ("Exemplos de paines");
		lblDescricao.setBounds(10, 50, 260, 40);


		btnGravar = new JButton("Gravar");
		btnGravar.setMnemonic('G');
		btnGravar.setBounds(10,60,120,40);
		btnGravar.setToolTipText("Gravar alguma coisa");


		btnCancelar = new JButton("Cancelar");
		btnCancelar.setMnemonic('C');
		btnCancelar.setBounds(150,60,120,40);
		btnCancelar.setToolTipText("Cancelar alguma coisa");

		pnlSuperior.add(lblBoasVindas);
		pnlSuperior.add(lblDescricao);

		pnlInferior.add(btnGravar);
		pnlInferior.add(btnCancelar);

		add(pnlSuperior);
		add(pnlInferior);
		
		pnlSuperior.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				if(e.isPopupTrigger())
					pmCores.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		add(pnlInferior);
		btnGravar.addActionListener(this);

		btnCancelar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnGravar || e.getSource() == miGravar)
			lblDescricao.setText("Aguarde, gravando... ");
		if(e.getSource()== btnCancelar || e.getSource() == miCancelar)
			lblDescricao.setText("Gravacao cancelada");
		if(e.getSource() == miVerde) pnlSuperior.setBackground(Color.GREEN);
		if(e.getSource() == miAmarelo) pnlSuperior.setBackground(Color.YELLOW);
		if(e.getSource() == miAzul) pnlSuperior.setBackground(Color.BLUE);
	}

}
