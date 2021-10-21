package MarketPlace;

import java.util.Scanner;

public class Cliente extends Pessoa {

	Scanner scan = new Scanner(System.in);
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void CadastrarCliente() {
		System.out.println("----- Cadastro de Cliente -----\n");
		System.out.print("Nome: ");
		setNome(scan.nextLine());
		System.out.print("CPF: ");
		setCpf(scan.nextLine());
		System.out.print("Celular: ");
		setCel(scan.nextLine());
		System.out.print("Rua: ");
		setRua(scan.nextLine());
		System.out.print("Número: ");
		setNum(scan.nextLine());
		System.out.print("Bairro: ");
		setBairro(scan.nextLine());
		System.out.print("Cidade: ");
		setCidade(scan.nextLine());
		System.out.print("Estado: ");
		setEstado(scan.nextLine());
		System.out.print("CEP: ");
		setCep(scan.nextLine());		
	}
	
	public void AtualizarCadastroCliente() {
		
	}
	
	
}
