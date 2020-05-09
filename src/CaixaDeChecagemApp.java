
public class CaixaDeChecagemApp {

	public static void main(String[] args) {
		CaixaDeChecagem cdc = new CaixaDeChecagem("OLX", 300, 300);
		cdc.centralize();
		cdc.pack();
		cdc.setVisible(true);

	}

}
