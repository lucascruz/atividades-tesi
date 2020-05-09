import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

public class LayoutDeBorda extends MinhaJanela{
	JButton btnNorte, btnSul, btnLeste, btnOeste, btnCentro;

	public LayoutDeBorda(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(new BorderLayout(3,2));
		 btnNorte = new JButton("Norte Superior");
		 btnSul = new JButton("Sul Inferior");
		 btnLeste = new JButton("Leste Esquerda");
		 btnOeste = new JButton("Oeste Esquerda");
		 btnCentro = new JButton("Regiao Central");

		add(btnNorte, BorderLayout.NORTH);
		add(btnSul, BorderLayout.SOUTH);
		add(btnLeste, BorderLayout.EAST);
		add(btnOeste, BorderLayout.WEST);
		add(btnCentro, BorderLayout.CENTER);
	}

}
