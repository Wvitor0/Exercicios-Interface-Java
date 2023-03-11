import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Quadrado;
import entities.Triangulo;
import services.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Shape> lista = new ArrayList<>();
		
		int n = 0;
		
		while (n == 0) {
			try(Scanner sc = new Scanner(System.in);){
				System.out.print("Circulo, Triangulo ou quadrado(c/t/q)? ");
				String resposta = sc.next();
				
				if(resposta.charAt(0) == 'c') {
					System.out.print("Digite o valor do raio: ");
					double raio = sc.nextDouble();
					lista.add(new Circulo(raio));
				}
				
				else if(resposta.charAt(0) == 't') {
					System.out.print("Digite a base: ");
					double base = sc.nextDouble();
					System.out.println("Digite a altura: ");
					double altura = sc.nextDouble();
					
					lista.add(new Triangulo(altura, base));
				}
				
				else {
					System.out.print("Digite a base: ");
					double base = sc.nextDouble();
					System.out.println("Digite a altura: ");
					double altura = sc.nextDouble();
					
					lista.add(new Quadrado(altura, base));
				}
				
				System.out.println("Quer adicionar mais figuras(s/n)? ");
				String r = sc.next();
				
				if(r.charAt(0) == 's') {
					continue;
				}
				else {
					break;
				}
			}
			
			catch(Exception e) {
				System.out.println("ERRO: Tente novamente!");
				continue;
			}
		}
		
		for(Shape shape : lista) {
			System.out.println(shape);
		}
	}

}
