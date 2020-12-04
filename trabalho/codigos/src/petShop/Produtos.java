package petShop;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produtos() {}
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getPrecoDesconto(Double desconto) {
		if(desconto <= 1 && desconto >=0) {
			return preco*desconto;
		}
		
		return -1;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public int alterarPreco(double preco) {
		if(preco <= 0) {
			return 0;
		}
		
		this.preco = preco;
		return 1;
	}
	
	public int remover(int quantidade){
		if(((this.quantidade - quantidade) < 0) || (quantidade <= 0)) {
			return 0;
		}
		
		this.quantidade -= quantidade;		
		return 1;
	}
	
	public int adicionar(int quantidade) {
		if(quantidade <= 0) {
			return 0;
		}
		
		this.quantidade += quantidade;
		return 1;
	}
}
