package interfaces.iniciais;

import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import interfaces.programa.InterfaceCliente;

public class LoginCliente {

	public static void view(List<Cliente> cliente, Scanner sc){
		
		Cliente clienteSelecionado = null;
		boolean emailExiste = false;
		sc.nextLine();
		
		while(emailExiste == false){
			System.out.print("0 - Sair ");
			System.out.print("\nInforme seu email: ");
			String email = sc.nextLine();
			
			if(email.equals("0")){
					break;
				}
				
			
			if(cliente.size() == 0) {
					
				System.out.println("Email não encontrado");
					
			} else {
			
				for(int i = 0; i < cliente.size(); i++){
					if(cliente.get(i).getEmail().equals(email)) {
						emailExiste = true;
						clienteSelecionado = cliente.get(i);
					} else if(i + 1 == cliente.size()){
						System.out.println("Email não encontrado");
					}
				}
			}
				
			}
		
		if(emailExiste != false){
			
			System.out.print("Informe sua senha: ");
			int senha = sc.nextInt();
			
			if(senha == clienteSelecionado.getSenha()){
				
				System.out.println("\nOlá " + clienteSelecionado.getNome());
				InterfaceCliente.view(clienteSelecionado, sc);
				
			}else {
				System.out.println("Senha incorreta\n");
			}
		}
	}
}
