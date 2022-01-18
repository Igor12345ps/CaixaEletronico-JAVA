import javax.swing.JOptionPane;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saldoini1(JOptionPane.showInputDialog(null, "Saldo inicial conta 1"));
		Saldoini1(JOptionPane.showInputDialog(null, "Saldo inicial conta 2"));
		Deposito1(JOptionPane.showInputDialog(null, "Deposito conta 1"));
		Deposito2(JOptionPane.showInputDialog(null, "Deposito conta 2"));
		Saque1(JOptionPane.showInputDialog(null, "Saque conta 1"));
		Saque2(JOptionPane.showInputDialog(null, "Saque conta 2"));
		Transferencia1(JOptionPane.showInputDialog(null, "Transferência de 2 para 1"));
		Transferencia2(JOptionPane.showInputDialog(null, "Transferência de 1 para 2"));
	
		JOptionPane.showMessageDialog(null, "Saldo final:\n"
				+ "Conta 1: " + Valor1() + "\n"
				+ "Conta 2: " + Valor2());
	}
	
	
	
	static double saldoini1mod;
	static double saldoini2mod;
	static double deposito1mod;
	static double deposito2mod;
	static double saque1mod;
	static double saque2mod;
	
	public static void Saldoini1(String saldoini1) {
		saldoini1mod = Double.parseDouble(saldoini1);
	}
	
	public static void Saldoini2(String saldoini2) {
		saldoini2mod = Double.parseDouble(saldoini2);
	}
	
	public static void Deposito1(String deposito1) {
		deposito1mod = Double.parseDouble(deposito1);
	}
	
	public static void Deposito2(String deposito2) {
		deposito2mod = Double.parseDouble(deposito2);
	}
	
	public static void Saque1(String saque1) {
		saque1mod = Double.parseDouble(saque1);
	}
	
	public static void Saque2(String saque2) {
		saque2mod = Double.parseDouble(saque2);
	}
	
	public static void Transferencia1(String valor1) {
		Deposito1(valor1);
	}
	
	public static void Transferencia2(String valor2) {
		Deposito2(valor2);
	}
	
	public static double Valor1() {
		return saldoini1mod;
	}
	
	public static double Valor2() {
		return saldoini2mod;
	}
}















