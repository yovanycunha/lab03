package lab03;

public class Supermercado {
	
	private Estoque estoque;
	private double totalArrecadado;
	private Input input;
	private double totalPodeArrecadar;
	
	public Supermercado() {
		this.input = new Input();
		this.estoque = new Estoque();
		this.totalArrecadado = 0.0;
		this.totalPodeArrecadar = 0.0;
	}
	
		
	public void cadastraProduto() {
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = input.lerString();
		System.out.print("Digite o preco unitario do produto: ");
		double precoUnitario = input.lerDouble();
		System.out.print("Digite o tipo do produto: ");
		String tipoProduto = input.lerString();
		System.out.print("Digite a quantidade no estoque: ");
		int quantidadeProduto = input.lerInteiro();
		
		Produto novoProduto = new Produto(nomeProduto, tipoProduto, precoUnitario, quantidadeProduto);
		estoque.adicionaProdutos(novoProduto);
		totalPodeArrecadar += precoUnitario * quantidadeProduto;
		System.out.println(quantidadeProduto + " \"" + nomeProduto + " \" cadastrado(s) com sucesso.");

	}
	
	public void venda() {
		System.out.print("Digite o nome do produto: ");
		String nomeProduto = input.lerString();
		if (estoque.buscaProduto(nomeProduto) == null) {
			System.out.println("==>" + nomeProduto + " nao cadastrado no sistema.");
		}else{
			System.out.println("==>" + estoque.buscaProduto(nomeProduto).toString());
			System.out.print("\nDigite a quantidade que deseja vender: ");
			int qntVender = input.lerInteiro();
			if(qntVender > estoque.buscaProduto(nomeProduto).getQntNoEstoque()){
				System.out.println("Nao e possivel vender pois nao ha " + nomeProduto + " suficiente.");
			}else{
				estoque.buscaProduto(nomeProduto).setQntNoEstoque(qntVender);
				totalArrecadado = estoque.buscaProduto(nomeProduto).getPrecoUnitario() * qntVender;
				System.out.println("==>" + toString());
			}
		}
	}
	
	public void imprimeBalanco() {
		if(estoque.getTamanhoArrayProduto() == 0){
			System.out.println("Nao ha produtos cadastrados");
		}else{
			System.out.println("Produtos cadastrados:\n");
			System.out.println(estoque.toString());
			System.out.println("\n" + toString());
		}
	}
	
	@Override
	public String toString() {
		return "Total Arrecadado: RS " + totalArrecadado + "\nTotal que pode ser arrecadado: RS " + totalPodeArrecadar;
	}

		
}
