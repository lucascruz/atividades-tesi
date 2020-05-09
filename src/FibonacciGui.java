import javax.swing.JOptionPane;  
public class FibonacciGui {  
	public static long fibo(int n) 
	// Cogitei trabalhar de forma iterativa
	{  
		if (n <= 1) return n;  
		else return fibo(n-1) + fibo(n-2);  
	}  
	public static void main(String[] args) {     
		int tamanho;  
		String resultado = "";
		tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "<html><h2><b>Digite o tamanho da impressão:</b></h2></html>"));  
		for (int i = 1; i <= tamanho; i++)  
			resultado += i + ": " + fibo(i)+"\n";
		JOptionPane.showMessageDialog(null, resultado);  
	}  
}