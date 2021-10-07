package entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	public static List<String> cargos = new ArrayList<>();
	
	public static void addCargo(String cargo) {
		cargos.add(cargo);
	}
}
