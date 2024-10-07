package objetos;
public class Funcionario {
	
	private String nome;
	private Integer id;
	private String Cargo;
	private Double totalVendas;
	private Integer vendas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public Double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(Double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public Integer getVendas() {
		return vendas;
	}
	public void setVendas(Integer vendas) {
		this.vendas = vendas;
	}
	
	public Funcionario(String nome, Integer id, String cargo, Double totalVendas, Integer vendas) {
		super();
		this.nome = nome;
		this.id = id;
		Cargo = cargo;
		this.totalVendas = totalVendas;
		this.vendas = vendas;
	}
	public Funcionario() {
		super();
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", id=" + id + ", Cargo=" + Cargo + ", totalVendas=R$" + totalVendas
				+ ", quanidadeVendas=" + vendas + "]";
	}
	
	
	
	
}

