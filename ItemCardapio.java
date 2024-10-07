package objetos;

public class ItemCardapio {
	
	private String nome;
	private Integer codigo;
	private Double preco;
	private Boolean disponivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public ItemCardapio(String nome, Integer codigo, Double preco, Boolean disponivel) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.disponivel = disponivel;
	}
	public ItemCardapio() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "ItemCardapio [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", disponivel=" + disponivel
				+ "]";
	}
	
	
	
	

}
