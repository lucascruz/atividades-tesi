import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LayoutDeCartao extends MinhaJanela implements ActionListener {
	
	JPanel pnlControles, pnlCartoes, pnlCartao1, pnlCartao2, pnlCartao3;
	JButton btn1, btn2, btn3, btn4;
	CardLayout cl;
	
	public LayoutDeCartao(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(new BorderLayout());
		
		pnlControles = new JPanel();
		pnlCartoes = new JPanel();

		cl = new CardLayout();
		
		pnlCartao1 = new JPanel();
		pnlCartao1.setBackground(Color.GRAY);
		pnlCartao1.add(new JLabel("1 Cartao"));
		
		pnlCartao2 = new JPanel();
		pnlCartao2.setBackground(Color.BLUE);
		pnlCartao2.add(new JLabel("2 Cartao"));
		
		pnlCartao3 = new JPanel();
		pnlCartao3.setBackground(Color.GREEN);
		pnlCartao3.add(new JLabel("3 Cartao"));
		
		
		pnlCartoes.setLayout(cl);
		pnlCartoes.add(pnlCartao1);
		pnlCartoes.add(pnlCartao2);
		pnlCartoes.add(pnlCartao3);
	
		btn1 = new JButton("Primeiro");
		btn2 = new JButton("Anterior");
		btn3 = new JButton("Proximo");
		btn4 = new JButton("Ultimo");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		pnlControles.setLayout(new GridLayout(1,4,5,5));
		pnlControles.add(btn1);
		pnlControles.add(btn2);
		pnlControles.add(btn3);
		pnlControles.add(btn4);
		
		add(pnlControles, BorderLayout.SOUTH);
		add(pnlCartoes, BorderLayout.CENTER);
	
	}

	
	public void actionPerformed (ActionEvent e){
		if (e.getSource()==btn1) cl.first(pnlCartoes);
		if (e.getSource()==btn2) cl.previous(pnlCartoes);
		if (e.getSource()==btn3) cl.next(pnlCartoes);
		if (e.getSource()==btn4) cl.last(pnlCartoes);
	}
}
