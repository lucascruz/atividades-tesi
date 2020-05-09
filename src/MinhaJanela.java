import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class MinhaJanela extends JFrame{
	public MinhaJanela(String titulo, int largura, int altura) {
		// TODO Auto-generated constructor stub
		setTitle(titulo);
		setSize(largura, altura);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void centralize(){
		Dimension dt = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dj = getSize();
		if (dj.height>dt.height)
			setSize(dj.width, dj.height);
		if (dj.width>dt.width)
			setSize(dt.width, dt.height);
		setLocation(((dt.width-dj.width)/2), ((dt.height-dj.height)/2));
	}
}
