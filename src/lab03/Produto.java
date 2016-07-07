package lab03;

public class Produto {
	
	String nomeProduto;
	String tipoProduto;
	double precoUnitario;
	
	
	public Produto(String nomeProduto, String tipoProduto, double precounitario) {
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.precoUnitario = precounitario;			
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
	
	
	
}
