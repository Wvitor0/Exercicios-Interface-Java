package entities;

import services.Shape;

public class Circulo implements Shape{
	private Double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}
	
	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		return "O raio do circulo é de: " + String.format("%.2f", area());
	}
}

