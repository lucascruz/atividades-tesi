import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class JanelaComMenus extends MinhaJanela {

	JMenuBar mbBarraDeMenu;
	JMenu mnArquivo, mnEdite, mnAjuda;
	JMenuItem miAbrir, miSair, miCopiar, miRecortar, miColar, miSobre;

	JanelaComMenus(String titulo, int largura, int altura){

		super(titulo, largura, altura);

		mbBarraDeMenu = new JMenuBar();
		setJMenuBar(mbBarraDeMenu);

		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('a');
		mnEdite = new JMenu("Edite");
		mnEdite.setMnemonic('e');
		mnAjuda = new JMenu("Ajuda");
		mnAjuda.setMnemonic('u');
		miAbrir = new JMenuItem("Abrir ...");
		miAbrir.setMnemonic('b');
		miSair = new JMenuItem("Sair");
		miSair.setMnemonic('s');
		miCopiar = new JMenuItem("Copiar");
		miCopiar.setMnemonic('c');
		miColar = new JMenuItem("Colar");
		miColar.setMnemonic('v');
		miSobre = new JMenuItem("Sobre");
		miSobre.setMnemonic('r');

		mnArquivo.add(miAbrir);
		mnArquivo.addSeparator();
		mnArquivo.add(miSair);
		mnEdite.add(miCopiar);
		mnEdite.add(miColar);
		mnAjuda.add(miSobre);

		mbBarraDeMenu.add(mnArquivo);
		mbBarraDeMenu.add(mnEdite);
		mbBarraDeMenu.add(mnAjuda);



	}
}