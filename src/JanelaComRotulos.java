import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class JanelaComRotulos extends MinhaJanela {
	JLabel lbl1, lbl2, lbl3;
	
	public JanelaComRotulos(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(null);
		
		//ImageIcon icone = new ImageIcon( getClass().getResource("img/image.gif") );
		ImageIcon icone = new ImageIcon ("img/image.gif");
		
		
		lbl1 = new JLabel("Rotulo Simples");
		lbl1.setIcon(icone);
		lbl1.setLocation(10,10);
		lbl1.setSize(280,80);
		lbl1.setOpaque(true);
		lbl1.setBackground(Color.BLUE);
		lbl1.setToolTipText("Rotulo com texto/icone");
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl1.setVerticalAlignment(SwingConstants.TOP);
		lbl1.setHorizontalTextPosition(SwingConstants.LEFT);
		lbl1.setVerticalTextPosition(SwingConstants.TOP);
		
		
		lbl2 = new JLabel(icone);
		lbl2.setIcon(icone);
		lbl2.setLocation(10,90);
		lbl2.setSize(280,80);
		lbl2.setOpaque(true);
		lbl2.setBackground(Color.GREEN);
		lbl2.setToolTipText("Rotulo com texto/icone");
		lbl2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2.setVerticalAlignment(SwingConstants.TOP);
		lbl2.setHorizontalTextPosition(SwingConstants.LEFT);
		lbl2.setVerticalTextPosition(SwingConstants.TOP);
		
		lbl3 = new JLabel();
		lbl3.setText("Rotulo com icone");
		lbl3.setIcon(icone);
		lbl3.setLocation(10,170);
		lbl3.setSize(280,80);
		lbl3.setOpaque(true);
		lbl3.setBackground(Color.PINK);
		lbl3.setToolTipText("Rotulo com texto/icone");
		lbl3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl3.setVerticalAlignment(SwingConstants.TOP);
		lbl3.setHorizontalTextPosition(SwingConstants.LEFT);
		lbl3.setVerticalTextPosition(SwingConstants.TOP);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
	}
}
