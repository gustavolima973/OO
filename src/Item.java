
public abstract class Item {

	public String nome;
	
	public String preco; 
	
	public String quantidade;
	
	
	public Item(String nome, String preco, String quantidade) {
	this.nome = nome;
	this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	} 
}
