package Calculadora;

public class Operaciones {
	
	private char operador;
	private float primerNum;
	private float segundoNum;
	
	
	public Operaciones() {
		operador=' ';
		primerNum=0;
		segundoNum=0;
	}
	
	
	public float operaciones() {
		float r=0;
		
		switch(operador) {
		
		case '+': r=primerNum+segundoNum; break;
		case '-': r=primerNum-segundoNum;  break;
		case '*': r=primerNum*segundoNum;  break;
		case '/': r=primerNum/segundoNum;  break;
		case '>':
			if(primerNum>segundoNum) r=1;
			else r=0;
			break;
			
		}
		
		return r;
	}
	
	
	
	public char getOperador() {
		return operador;
	}
	public void setOperador(char operador) {
		this.operador = operador;
	}
	public float getPrimerNum() {
		return primerNum;
	}
	public void setPrimerNum(float primerNum) {
		this.primerNum = primerNum;
	}
	public float getSegundoNum() {
		return segundoNum;
	}
	public void setSegundoNum(float segundoNum) {
		this.segundoNum = segundoNum;
	}
	
	

}
