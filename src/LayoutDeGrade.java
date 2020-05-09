import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

public class LayoutDeGrade extends MinhaJanela{
	JButton btn1, btn2, btn3, btn4, btn5, btn6;

	public LayoutDeGrade(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(new GridLayout(3,2));
		 btn1 = new JButton("botao 1.1");
		 btn2 = new JButton("botao 1.2");
		 btn3 = new JButton("botao 2.1");
		 btn4 = new JButton("botao 2.2");
		 btn5 = new JButton("botao 3.1");
		btn6 = new JButton("botao 3.2");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
	}
}
