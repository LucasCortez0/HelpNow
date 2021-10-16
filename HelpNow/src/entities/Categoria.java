package entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	public List<String> cargos = new ArrayList<>();
	
	public String getCargo(int numero) {
		return cargos.get(numero);
	}
	
	public int getTamanhoLista() {
		return cargos.size();
	}
	
	public void addCargo(String cargo) {
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
