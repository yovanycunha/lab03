package lab03;

public class Estoque {
	
	private int tamanho;
	private Produto[] arrayProdutos;
	private int indice;
	
		
	public Estoque() {
		this.tamanho = 3;
		this.arrayProdutos = new Produto[tamanho];
		this.indice = 0;
	}
	
	public int getTamanhoArrayProduto(){
		return indice;
	}
	
	
	
	

	public Produto[] aumentaArray(Produto[] arrayProdutos) {
		Produto[] novoArray = new Produto[tamanho * 2];
		for (int i = 0; i < arrayProdutos.length; i++) {
			novoArray[i] = arrayProdutos[i];
		}
		return novoArray;
	}
		
	public Produto[] adicionaProdutos(Produto novoProduto) {
		if (indice == arrayProdutos.length) {			
			arrayProdutos =  aumentaArray(arrayProdutos);
			arrayProdutos[indice] = novoProduto;
		}
		else{
			arrayProdutos[indice] = novoProduto;
		}
		indice ++;
		return arrayProdutos;
	}
	
	public Produto buscaProduto(String nomeProduto) {
		int pos = 0;
		boolean produtoEncontrado = false;
		while (pos < indice) {
			if (nomeProduto.equalsIgnoreCase(arrayProdutos[pos].getNomeProduto())){
				produtoEncontrado = true;
				break;
			}else{
				pos++;
			}			
		}
		if(produtoEncontrado == true){
			return arrayProdutos[pos];
		}else{
			return null;
		}
	}
	
	
	@Override
	public String toString() {
		String resultado = "";
		String FIM_DE_LINHA = System.lineSeparator();		
		for (int i = 0; i < indice; i++) {
			resultado += (i+1) + ")" + arrayProdutos[i].toString() + FIM_DE_LINHA;			
		}
		return resultado;
	}
	
}