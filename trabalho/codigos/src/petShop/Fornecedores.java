package petShop;

public class Fornecedores {

	private String nome;
	private String cnpj;
	private String telefone;
	private boolean excluido = false;
		
	public String getNome() {
		return nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public boolean getExcluido() {
		return excluido;
	}
	
	public int cadastrarNome(String nome){
		if(nome.trim() == "") {
			return 0;
		}
		
		this.nome = nome;
		return 1;
	}
	
	public int cadastrarCnpj(String cnpj){
		Validacao v = new Validacao();
		
		if(cnpj.trim() == "" || cnpj.length() != 14 || v.validaSeTudoEhNumero(cnpj) == 0) {
			return 0;
		}
		
		this.cnpj = cnpj;
		return 1;
	}
	
	public int cadastrarTelefone(String telefone){
		Validacao v = new Validacao();
		
		if(telefone.trim() == "" || telefone.length() != 10 || v.validaSeTudoEhNumero(telefone) == 0) {
			return 0;
		}
		
		this.telefone = telefone;
		return 1;
	}
	
	public void excluirFornecedor() {
		this.excluido = true;
	}
}
