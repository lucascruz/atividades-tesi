
public class LayoutFluxoApp {

	public static void main(String[] args) {
		LayoutDeFluxo janela = new LayoutDeFluxo("HACKUDO", 800, 600);
		janela.centralize(); 
		janela.pack();
		janela.setVisible(true);
	}

}