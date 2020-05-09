
public class CaixaDeListagemApp {

	public static void main(String[] args) {
		CaixaDeListagem cdl = new CaixaDeListagem("HACKUDO", 300, 300);
		cdl.centralize();
		cdl.pack();
		cdl.setVisible(true);
	}

}