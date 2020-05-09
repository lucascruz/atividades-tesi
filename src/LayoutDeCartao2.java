import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class LayoutDeCartao2 extends MinhaJanela implements ActionListener {

	JPanel pnlControles, pnlCartoes, pnlCartao1, pnlCartao2, pnlCartao3;
	JButton btn1, btn2, btn3, btn4;
	CardLayout cl;
	String pathImages = "img/";

	Action actPrimeiro, actAnterior, actProximo, actUltimo, actSobre;

	JMenuBar mbGeral = new JMenuBar();
	JMenu mnControles, mnAjuda;
	JPopupMenu popControles;

	public LayoutDeCartao2(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		setLayout(new BorderLayout());
		setJMenuBar(mbGeral);


		actPrimeiro = new AcaoPrimeiro();
		actAnterior = new AcaoAnterior();
		actProximo = new AcaoProximo();
		actUltimo = new AcaoUltimo();
		actSobre = new AcaoSobre();


		pnlControles = new JPanel();
		pnlCartoes = new JPanel();

		cl = new CardLayout();

		mnControles = new JMenu("Cartoes");
		mnControles.setMnemonic('c');
		mnAjuda = new JMenu("Ajuda");
		mnAjuda.setMnemonic('j');

		popControles = new JPopupMenu();

		mnControles.add(actAnterior);
		mnControles.add(actProximo);
		mnControles.addSeparator();
		mnControles.add(actPrimeiro);
		mnControles.add(actUltimo);

		mnAjuda.add(actSobre);

		popControles.add(actAnterior);
		popControles.add(actProximo);
		popControles.addSeparator();
		popControles.add(actPrimeiro);
		popControles.add(actUltimo);

		btn1 = new JButton(actPrimeiro);
		btn2 = new JButton(actAnterior);
		btn3 = new JButton(actProximo);
		btn4 = new JButton(actUltimo);


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
		btn3 = new JButton("Proximo");
		btn2 = new JButton("Anterior");
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
		
		pnlCartoes.add(pnlCartao3, "c3");

		pnlCartoes.addMouseListener(new DisparadorDoPopup());
	}
	private class AcaoPrimeiro extends AbstractAction{
		AcaoPrimeiro(){
			super("Primeiro");
			putValue(Action.SMALL_ICON,new ImageIcon(pathImages + "navigation/Up16.gif"));
			putValue(Action.LARGE_ICON_KEY, new ImageIcon(pathImages + "navigation/Up24.gif"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
			putValue(Action.SHORT_DESCRIPTION, "Vai para o primeiro cartao");
		}
		public void actionPerformed(ActionEvent e){
			cl.first(pnlCartoes);
		}
	}

	private class AcaoAnterior extends AbstractAction{
		AcaoAnterior(){
			super("Anterior");
			putValue(Action.SMALL_ICON,new ImageIcon(pathImages + "navigation/Back16.gif"));
			putValue(Action.LARGE_ICON_KEY, new ImageIcon(pathImages + "navigation/Back24.gif"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
			putValue(Action.SHORT_DESCRIPTION, "Vai para o cartao anterior");
		}
		public void actionPerformed(ActionEvent e){
			cl.previous(pnlCartoes);
		}
	}

	private class AcaoProximo extends AbstractAction{
		AcaoProximo(){
			super("Proximo");
			putValue(Action.SMALL_ICON,new ImageIcon(pathImages + "navigation/Forward16.gif"));
			putValue(Action.LARGE_ICON_KEY, new ImageIcon(pathImages + "navigation/Forward24.gif"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_X);
			putValue(Action.SHORT_DESCRIPTION, "Sobre aplicacao com layout de cartao");
		}
		public void actionPerformed(ActionEvent e){
			cl.next(pnlCartoes);
		}
	}

	private class AcaoUltimo extends AbstractAction{
		AcaoUltimo(){
			super("Ultimo");
			putValue(Action.SMALL_ICON,new ImageIcon(pathImages + "navigation/Down16.gif"));
			putValue(Action.LARGE_ICON_KEY, new ImageIcon(pathImages + "navigation/Down24.gif"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_O);
			putValue(Action.SHORT_DESCRIPTION, "Vai para o ultimo cartao");
		}
		public void actionPerformed(ActionEvent e){
			cl.last(pnlCartoes);
		}
	}

	private class AcaoSobre extends AbstractAction{
		AcaoSobre(){
			super("Sobre");
			putValue(Action.SMALL_ICON,new ImageIcon(pathImages + "general/About16.gif"));
			putValue(Action.LARGE_ICON_KEY, new ImageIcon(pathImages + "general/About24.gif"));
			putValue(Action.MNEMONIC_KEY, KeyEvent.VK_B);
			putValue(Action.SHORT_DESCRIPTION, "Sobre aplicacao com layout de cartao");
		}
		public void actionPerformed(ActionEvent e){
		}
	}

	public void actionPerformed (ActionEvent e){
		if (e.getSource()==btn1) cl.first(pnlCartoes);
		if (e.getSource()==btn2) cl.previous(pnlCartoes);
		if (e.getSource()==btn3) cl.next(pnlCartoes);
		if (e.getSource()==btn4) cl.last(pnlCartoes);
	}
	private class DisparadorDoPopup extends MouseAdapter{
		public void mouseReleased(MouseEvent e){
			if(e.isPopupTrigger())
				popControles.show(e.getComponent(), e.getX(), e.getY());
		}
	}
}