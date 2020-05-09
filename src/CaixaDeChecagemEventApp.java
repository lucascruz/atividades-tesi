
public class CaixaDeChecagemEventApp {

	public static void main(String[] args) {
		CaixaDeChecagemEvent cdc = new CaixaDeChecagemEvent("OLX", 300, 300);
		cdc.centralize();
		cdc.pack();
		cdc.setVisible(true);

	}

}
