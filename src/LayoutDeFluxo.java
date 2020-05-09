import java.awt.FlowLayout;

import javax.swing.JButton;

public class LayoutDeFluxo extends MinhaJanela {
	JButton btn1, btn2, btn3, btn4, btn5, btn6;

	public LayoutDeFluxo(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		JButton btn1 = new JButton("botao 1");
		JButton btn2 = new JButton("botao 2");
		JButton btn3 = new JButton("botao 3");
		JButton btn4 = new JButton("botao 4");
		JButton btn5 = new JButton("botao 5");
		JButton btn6 = new JButton("botao 6");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
	}

}
