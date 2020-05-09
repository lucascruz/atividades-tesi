public class LayoutDeBordaApp {

	public static void main(String[] args) {
		LayoutDeBorda janela = new LayoutDeBorda("HACKUDO", 800, 600);
		janela.centralize(); 
		janela.pack();
		janela.setVisible(true);
	}

}
