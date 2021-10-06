package interfaces.iniciais;

import java.util.List;
import java.util.Scanner;

import entities.Cliente;

public class CadastroCliente {
	
	public static Cliente view(Scanner sc, List<Cliente> clientes) {
		
		String email = null;
		
		System.out.print("\nDigite seu nome: ");
		String nome = sc.next();
		
		System.out.print("Digite seu email: ");
			email = sc.next();
			
		boolean emailValido = false;
		while(emailValido) {	
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
		System.out.print("Crie uma senha: ");
		senha1 = sc.nextInt();
		System.out.print("Confirme a senha: ");
		senha2 = sc.nextInt();
		if(senha1 != senha2) {
			System.out.println("\nAs senhas estão diferentes, tente novamente.\n");
		}
		}while(senha1 != senha2);
		
		System.out.println("\nCadastro realizado com sucesso!");
		
		System.out.println("\nNome: " + nome + "\nEmail de acesso: " + email + "\nSenha de acesso: " + senha2);
		
		Cliente cliente = new Cliente(nome, email, senha2);	
		return cliente;
	}
	
}
