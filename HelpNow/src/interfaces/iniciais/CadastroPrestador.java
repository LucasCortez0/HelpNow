package interfaces.iniciais;

import java.util.List;
import java.util.Scanner;

import application.Inicializador;
import entities.Categoria;
import entities.Prestador;

public class CadastroPrestador {
	
	public static Prestador view(Scanner sc, List<Prestador> prestadores, List<Categoria> categorias) {
		
		String email = null;
		
		System.out.print("\nDigite seu nome: ");
		String nome = sc.next();
			
		System.out.print("Digite seu email: "); 
		email = sc.next();	
			
		boolean emailValido = false;
		while(emailValido == false) {	
			if(prestadores.size() > 0) {
				for (int i = 0; i < prestadores.size(); i++) {
					if (email.equals(prestadores.get(i).getEmail())) {
						System.out.print("Este email já está cadastrado! \nDigite novamente: ");
						email = sc.next();
					}else if(i + 1 == prestadores.size()){
						emailValido = true;
					}
				}
			}else {
				emailValido = true;
			}
		}
			
		int senha1, senha2;
		do {
		System.out.print("Crie uma senha: ");
		senha1 = sc.nextInt();
		System.out.print("Confirme a senha: ");
		senha2 = sc.nextInt();
		if(senha1 != senha2) {
			System.out.println("As senhas estão diferentes, tente novamente.\n");
		}
		}while(senha1 != senha2);
		
		boolean cargoJaSelecionado = false;
		byte categoriaSelecionada = -1;
		byte cargoSelecionado = 0;
		byte area = 0;
		Categoria categoria = null;
		
		while(cargoJaSelecionado == false) {
			System.out.println();
			System.out.println("Selecione a categoria que deseja atuar: ");
			System.out.print(Inicializador.exibirCategorias());	
			System.out.print("Selecione: ");
			categoriaSelecionada = sc.nextByte();
			System.out.println();
			if(categoriaSelecionada < 1 || categoriaSelecionada > 5) {
				System.out.println("Categoria não encontrada");
			}else {
				categoriaSelecionada -= 1;
				categoria = categorias.get(categoriaSelecionada);
				System.out.println(categoria);
				while(area < 1 || area > categoria.getTamanhoLista() + 1) {
					System.out.print("Selecione àrea: ");
					area = sc.nextByte();
					if(area < 1 || area > categoria.getTamanhoLista() + 1){
						System.out.println("Opção invalida!");
					}else {
						cargoJaSelecionado = true;
					}
				}
			
			}
		}
		
		double valorServico = 0.0;
		
		if(categoriaSelecionada == 4) {
			System.out.print("Informe o valor por KM rodado: R$");
			valorServico = sc.nextDouble();
		}else {
			System.out.print("Informe o valor do serviço: R$");
			valorServico = sc.nextDouble();
		}
		
		System.out.println("\nCadastro realizado com sucesso!");
		
		System.out.println("\nNome: " + nome + "\nEmail de acesso: " + email + "\nSenha de acesso: " + senha2);
		
		Prestador prestador = new Prestador(nome, email, senha2, categoria, categoria.getCargo(area - 1), valorServico);	
		return prestador;
		
	}
	
	
}
