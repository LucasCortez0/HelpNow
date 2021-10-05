package interfaces.iniciais;

import java.util.List;
import java.util.Scanner;

import entities.Cliente;

public class CadastroCliente {
	
	public static Cliente view(Scanner sc, List<Cliente> clientes) {
		
		String email = null;
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		boolean emailValido = false;
		while(emailValido) {	
			System.out.println("Digite seu email: ");
			email = sc.nextLine();
			for (int i = 0; i < clientes.size(); i++) {
				if (email.equals(clientes.get(i).getEmail())) {
					System.out.println("Este email já está cadastrado! \ntente novamente");
				}else if(i + 1 == clientes.size()){
					emailValido = true;
				}
			}
		}
			
		int senha1, senha2;
		do {
		System.out.println("Crie uma senha: ");
		senha1 = sc.nextInt();
		System.out.println("Confirme a senha: ");
		senha2 = sc.nextInt();
		if(senha1 != senha2) {
			System.out.println("As senhas estão diferentes, tente novamente.");
		}
		}while(senha1 != senha2);
		
		Cliente cliente = new Cliente(nome, email, senha1);	
		return cliente;
	}
	
}
