
public class calculadora {
	//Atributos
	private int n1;
	private int n2;
	private int result;
	
	//Constructores
	public calculadora(int n1, int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public int suma(){
		return this.n1 + this.n2;
	}
	public int resta(){
		return this.n1 - this.n2;
	}
	public int multiplicacion(){
		return this.n1 * this.n2;
	}
	public double division(){
		return (double)this.n1 / this.n2;
	}
}
