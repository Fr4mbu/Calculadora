public class Calculadora {

	private int n1;
	private int n2;

	public Calculadora() {
		//constructor vacio para que compile
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	public Calculadora(int num1, int num2) {
		this.n1 = num1;
        this.n2 = num2;
	}

	public int sumar() {
		return 0;
	}

	public int multiplicar() {
		return 0;
	}

	/**
	 * 
	 * @param n1
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}

	/**
	 * 
	 * @param n2
	 */
	public void setN2(int n2) {
		this.n2 = n2;
	}

}