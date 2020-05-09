
public class CaixaDeCombinacaoEventApp {

	public static void main(String[] args) {
		CaixaDeCombinacaoEvent cdce = new CaixaDeCombinacaoEvent("HACKUDO", 300, 300);
		cdce.centralize();
		cdce.pack();
		cdce.setVisible(true);

	}

}
