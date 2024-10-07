package objetos;

import java.util.ArrayList;

public class Pedido {
	
	private Mesa mesaDoPedido;
	private Funcionario funcionarioDoPedido;
	private ArrayList<ItemCardapio> itensDoPedido = new ArrayList<>();
	
	public Mesa getMesaDoPedido() {
		return mesaDoPedido;
	}
	public void setMesaDoPedido(Mesa mesaDoPedido) {
		this.mesaDoPedido = mesaDoPedido;
	}
	public Funcionario getFuncionarioDoPedido() {
		return funcionarioDoPedido;
	}
	public void setFuncionarioDoPedido(Funcionario funcionarioDoPedido) {
		this.funcionarioDoPedido = funcionarioDoPedido;
	}
	public ArrayList<ItemCardapio> getItensDoPedido() {
		return itensDoPedido;
	}
	public void setItensDoPedido(ArrayList<ItemCardapio> itensDoPedido) {
		this.itensDoPedido = itensDoPedido;
	}
	
	public Pedido(Mesa mesaDoPedido, Funcionario funcionarioDoPedido, ArrayList<ItemCardapio> itensDoPedido) {
		super();
		this.mesaDoPedido = mesaDoPedido;
		this.funcionarioDoPedido = funcionarioDoPedido;
		this.itensDoPedido = itensDoPedido;
	}
	public Pedido() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pedido: \nmesa: " + mesaDoPedido.getNumero() + "; \nfuncionario responsavel: " + funcionarioDoPedido.getNome()
				+ "; \nitens do pedido=" + itensDoPedido;
	}
	
	

}
