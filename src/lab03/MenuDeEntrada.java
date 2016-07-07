package lab03;

public class MenuDeEntrada {
	
	
public static void main(String[] args) {
				
		System.out.println("====Bem-vindo(a) ao EconomizaP2====");
		System.out.println("digite a opcao desejada:");
		System.out.println("1 - Cadastrar um Produto\n2 - Vender um Produto\n3 - Imprimir Balanco\n4 - Sair");
		System.out.print("\nOpcao:");
		
		InputOutput input = new InputOutput();
		
		int minhaopcao = input.lerInteiro();
		
		if (minhaopcao == 1) {
			System.out.println("= = = = Cadastro de Produtos = = = =");
			do {
				System.out.print("Digite o nome do produto: ");
				String nome = input.toString();
				System.out.print("Digite o preco unitario de " + nome + ": ");
				double preco = input.lerDouble();
				System.out.print("Digite o tipo de " + nome + ": ");
				String tipo = input.lerString();
				
				Produto novoProduto = new Produto(nome, tipo, preco);
				
				
			} while (condition);
		}
	}
}
