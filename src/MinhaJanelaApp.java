
public class MinhaJanelaApp {
	public static void main(String args[]){
		MinhaJanela janela = new MinhaJanela("HACKUDO", 800, 600);
		janela.centralize(); 
		janela.pack();
		janela.setVisible(true);
	}
}
