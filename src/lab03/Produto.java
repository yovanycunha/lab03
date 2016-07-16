package lab03;

public class Produto {
	
	private String nomeProduto;
	private String tipoProduto;
	private double precoUnitario;
	private int qntNoEstoque;
	
	
	public Produto(String nomeProduto, String tipoProduto, double precoUnitario, int qntProduto) {
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.precoUnitario = precoUnitario;
		this.qntNoEstoque = qntProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getTipoProduto() {
		return tipoProduto;
	}


	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}


	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public int getQntNoEstoque() {
		return qntNoEstoque;
	}
	
	public void setQntNoEstoque(int qntNoEstoque) {
		this.qntNoEstoque = this.qntNoEstoque - qntNoEstoque;
	}
	
	@Override
	public String toString() {
		return nomeProduto + "(" + tipoProduto + "). RS " + precoUnitario + " Restante: " + qntNoEstoque;
	}
	
}
