package entities;

import services.Shape;

public class Quadrado implements Shape{
	private Double altura;
	private Double base;
	
	public Quadrado(Double altura, Double base) {
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
		return base * altura;
	}

	@Override
	public String toString() {
		return "A area do quadrado é de : " + String.format("%.2f", area());
	}
}
