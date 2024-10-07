package objetos;

public class Mesa {
	
	private Integer numero;
	private Integer capacidade;
	private Boolean disponivel;
	private Double vendas;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Double getVendas() {
		return vendas;
	}
	public void setVendas(Double vendas) {
		this.vendas = vendas;
	}
	
	public Mesa(Integer numero, Integer capacidade, Boolean disponivel, Double vendas) {
		super();
		this.numero = numero;
		this.capacidade = capacidade;
		this.disponivel = disponivel;
		this.vendas = vendas;
	}
	public Mesa() {
		super();
	}
	
	@Override
	public String toString() {
		return "Mesa [numero=" + numero + ", capacidade=" + capacidade + ", disponivel=" + disponivel + ", vendas=R$"
				+ vendas + "]";
	}
	
	
	
	

}
