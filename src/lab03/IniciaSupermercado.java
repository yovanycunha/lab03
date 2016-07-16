package lab03;

public class IniciaSupermercado {
	
	private int minhaOpcao;
	private Supermercado caixa;
	private Input input;
	private String repeteOperacao;

	public IniciaSupermercado() {
		this.minhaOpcao = 0;
		this.caixa = new Supermercado();
		this.input = new Input();
	}

	public int menu() {
		System.out.println("Digite a opcao desejada:");
		System.out.println("1 - Cadastrar um Produto\n2 - Vender um Produto\n3 - Imprimir Balanco\n4 - Sair");
		System.out.print("\nOpcao: ");
		
		int minhaOpcao = input.lerInteiro();
		
		return minhaOpcao;
	}

	public void inicia() {
		
		System.out.println("= = = = Bem-vindo(a) ao EconomizaP2= = = =");
		
		do {
			System.out.println("");
			minhaOpcao = menu();
			switch (minhaOpcao) {
			case 1:
				System.out.println("= = = =Cadastro de Produtos= = = =");
				do {
					repeteOperacao = "";
					caixa.cadastraProduto();
					System.out.print("Deseja cadastrar outro produto? ");
					repeteOperacao = input.lerString();
				} while (repeteOperacao.equalsIgnoreCase("Sim"));			
				break;
				
			case 2:
				System.out.println("= = = =Venda de Produtos= = = =");
				do {
					repeteOperacao = "";
					caixa.venda();
					System.out.print("Deseja vender outro produto? ");
					repeteOperacao = input.lerString();
				} while (repeteOperacao.equalsIgnoreCase("Sim"));
				break;
				
			case 3:
				System.out.println("= = = =Impressao de Balanco= = = =");
				caixa.imprimeBalanco();
				break;
			}
		} while (minhaOpcao != 4);
		
		
		
		
	}
	
}
