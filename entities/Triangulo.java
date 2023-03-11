package entities;

import services.Shape;

public class Triangulo implements Shape{
	private Double altura;
	private Double base;
	
	public Triangulo(Double altura, Double base) {
		this.altura = altura;
		this.base = base;
	}
	
	public Double getAltura() {
		return altura;
	}

	public Double getBase() {
		return base;
	}

	@Override
	public Double area() {
		return base * altura/2;
	}
	
	public String toString() {
		return "A area do triangulo é de: " +  String.format("%.2f", area());
	}
}
