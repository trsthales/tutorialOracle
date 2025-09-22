package arrays;

import java.util.Arrays;
import java.util.List;

public class TesteAsListArray {
	
	public static void main(String[] args) {
		String[] animais = {"Gato", "Cachorro", "Galinha", "Cavalo", "Vaca"};
		
		List<String> arrayComoLista = Arrays.asList(animais);
		
		for(String animal : arrayComoLista) {
			System.out.println(animal);
		}
	}
}
