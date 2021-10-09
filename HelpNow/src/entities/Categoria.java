package entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	public static List<String> cargos = new ArrayList<>();
	
	public static void addCargo(String cargo) {
		cargos.add(cargo);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < cargos.size(); i++) {
			sb.append(i + 1 + ". " + cargos.get(i) + "\n");
		}
		return sb.toString();
	}
}
