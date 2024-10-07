package funcoes;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Funcionario;
import objetos.ItemCardapio;
import objetos.Mesa;
import objetos.Pedido;

public class TodasFuncoes {
	
	public static Scanner scan = new Scanner(System.in);
	
	ArrayList<Funcionario> ListaDeFuncionarios = new ArrayList<>();
	ArrayList<Mesa> ListaDeMesas = new ArrayList<>();
	ArrayList<ItemCardapio> Cardapio = new ArrayList<>();
	ArrayList<Pedido> ListaDePedidos = new ArrayList<>();
	
	// FUNCIONARIOS
	Integer idFuncionario = 0;
	public void cadastrarFuncionario() {
		
		idFuncionario++;
		
		System.out.println("Insira o nome do funcionario: ");
		String nome = scan.next();
		
		System.out.println("Insira o cargo do funcionario: ");
		String cargo = scan.next();
		
		Double totalVendas = 0.0;
		Integer vendas=0;
		
		Funcionario funcionario = new Funcionario(nome, idFuncionario, cargo, totalVendas, vendas);
		
		ListaDeFuncionarios.add(funcionario);
		
	}
	
	public void exibirFuncionarios() {
		
		for (Funcionario funcionario : ListaDeFuncionarios) 
		{
			System.out.println(funcionario);
		}
		
	}
	
	public void exibirGarcons() {
		
		for (Funcionario funcionario : ListaDeFuncionarios) 
		{
			if(funcionario.getCargo().equalsIgnoreCase("garcon") || funcionario.getCargo().equalsIgnoreCase("garçon"))
			{
				System.out.println(funcionario);
			}
		}
		
	}
	
	public void excluirFuncionario() {
		
		exibirFuncionarios();
		
		System.out.println("Insira o id do funcionario que deseja excluir: ");
		Integer idFuncionarioExcluido = scan.nextInt();
		
		Funcionario funcionarioExcluido=null;
		Boolean encontrado=false;
		for (Funcionario funcionario : ListaDeFuncionarios) 
		{
			if(funcionario.getId()==idFuncionarioExcluido)
			{
				funcionarioExcluido=funcionario;
				encontrado=true;
			}
		}
		
		if(encontrado)
		{
			ListaDeFuncionarios.remove(funcionarioExcluido);
		}
		else
		{
			System.out.println("Funcionario não encontrado");
		}
		
	}
	
	public void vendasGarcons() {
		
		for (Funcionario funcionario : ListaDeFuncionarios) 
		{
			if(funcionario.getCargo().equalsIgnoreCase("garcon") || funcionario.getCargo().equalsIgnoreCase("garçon") || funcionario.getCargo().equalsIgnoreCase("garcom") || funcionario.getCargo().equalsIgnoreCase("garçom"))
			{
				System.out.println(funcionario.getNome() + "(ID " + funcionario.getId() + "): R$" + funcionario.getTotalVendas());
			}
		}
	}
	
	// MESAS
	public void cadastrarMesa() {
		
		System.out.println("Insira o numero da mesa: ");
		Integer numero = scan.nextInt();
		
		System.out.println("Insira quantos lugares tem a mesa: ");
		Integer capacidade = scan.nextInt();
		
		System.out.println("A mesa está disponivel?: \n[1] sim \n[2] não \nsua escolha: ");
		Integer esc = scan.nextInt();
		scan.nextLine(); // limpa teclado
		
		Boolean disponivel=null;
		if(esc==1)
		{
			disponivel=true;
		}
		else if(esc==2)
		{
			disponivel=false;
		}
		else
		{
			System.out.println("Escolha Invalida");
		}
		
		Double vendas=0.0;
		
		Mesa mesa = new Mesa(numero, capacidade, disponivel, vendas);
		ListaDeMesas.add(mesa);
		
	}
	
	public void exibirMesas() {
		
		for (Mesa mesa : ListaDeMesas) 
		{
			System.out.println(mesa);
		}
		
	}
	
public void excluirMesa() {
		
		exibirMesas();
		
		System.out.println("Insira o numero da mesa que deseja excluir: ");
		Integer numeroMesaExcluida = scan.nextInt();
		
		Mesa mesaExcluida=null;
		Boolean encontrada=false;
		for (Mesa mesa : ListaDeMesas) 
		{
			if(mesa.getNumero()==numeroMesaExcluida)
			{
				mesaExcluida=mesa;
				encontrada=true;
			}
		}
		
		if(encontrada)
		{
			ListaDeMesas.remove(mesaExcluida);
		}
		else
		{
			System.out.println("Mesa não encontrado");
		}
		
	}

	public void disponibilidadeMesas() {
	
		Boolean menu=true;
		Boolean encontrada=false;
	
		for (Mesa mesa : ListaDeMesas)
		{
			System.out.println("Mesa " + mesa.getNumero() +": Disponivel: " + mesa.getDisponivel());
		}
			System.out.println("Deseja alterar a disponibilidade de alguma mesa? \n[1] sim \n[2] não \nsua escolha: ");
			int esc = scan.nextInt();
	
		if(esc==1)
		{
			System.out.println("Qual o numero da mesa que deseja alterar: ");
			int numero = scan.nextInt();
		
			for (Mesa mesa : ListaDeMesas)
			{
				if(mesa.getNumero()==numero)
				{
					mesa.setDisponivel(!mesa.getDisponivel());
					encontrada=true;
				}
			}
			for (Mesa mesa : ListaDeMesas)
			{
				System.out.println("Mesa " + mesa.getNumero() + ": " + mesa.getDisponivel());
			}
			menu=false;
			
			if(!encontrada)
			{
				System.out.println("Mesa " + numero + " não encontrada");
			}
		}
		else if(esc==2)
		{
			menu=false;
		}
		else
		{
			System.out.println("Escolha invalida");
		}

}
	
	public void vendasMesas() {
		
		for (Mesa mesa : ListaDeMesas) 
		{
			System.out.println("Mesa " + mesa.getNumero() + ": R$" + mesa.getVendas());
		}
	}
	
	// ITENS CARDAPIO
	Integer idItem = 0;
	public void cadastrarItem() {
		
		idItem++;
		
		System.out.println("Insira o nome do item: ");
		String nome = scan.nextLine();
		
		System.out.println("Insira o preço do item: ");
		Double preco = scan.nextDouble();
		
		System.out.println("O produto está disponivel?: \n[1] sim \n[2] não \nsua escolha: ");
		Integer esc = scan.nextInt();
		scan.nextLine(); // limpa teclado
		
		Boolean disponivel=null;
		if(esc==1)
		{
			disponivel=true;
		}
		else if(esc==2)
		{
			disponivel=false;
		}
		else
		{
			System.out.println("Escolha Invalida");
		}
		
		ItemCardapio itemCardapio = new ItemCardapio(nome, idItem, preco, disponivel);
		Cardapio.add(itemCardapio);
		
	}
	
	public void exibirCardapio() {
		
		for (ItemCardapio itemCardapio : Cardapio)
		{
			System.out.println(itemCardapio);
		}
		
	}
	
	public void excluirItemCardapio() {
		
		exibirCardapio();
		
		System.out.println("Insira o codigo do item que deseja excluir: ");
		Integer codigoItemExcluido = scan.nextInt();
		
		ItemCardapio itemExcluido=null;
		Boolean encontrado=false;
		for (ItemCardapio itemCardapio : Cardapio) 
		{
			if(itemCardapio.getCodigo()==codigoItemExcluido)
			{
				itemExcluido=itemCardapio;
				encontrado=true;
			}
		}
		
		if(encontrado)
		{
			Cardapio.remove(itemExcluido);
		}
		else
		{
			System.out.println("Item não encontrado");
		}
		
	}
	
	public void disponibilidadeItens() {
		
		Boolean menu=true;
		Boolean encontrado=false;
		
		for (ItemCardapio itemCardapio : Cardapio)
		{
			System.out.println(itemCardapio.getNome() + "(codigo " + itemCardapio.getCodigo() + "): disponivel: " + itemCardapio.getDisponivel());
		}
		
		System.out.println("Deseja alterar a disponibilidade de algum item? \n[1] sim \n[2] não \nsua escolha: ");
		int esc = scan.nextInt();
		
		if(esc==1)
		{
			System.out.println("Qual o codigo do item deseja alterar: ");
			int codigo = scan.nextInt();
			
			for (ItemCardapio itemCardapio : Cardapio)
			{
				if(itemCardapio.getCodigo()==codigo)
				{
					itemCardapio.setDisponivel(!itemCardapio.getDisponivel());
					encontrado=true;
				}
			}
			for (ItemCardapio itemCardapio : Cardapio)
			{
				System.out.println(itemCardapio.getNome() + ": " + itemCardapio.getDisponivel());
			}
			if(!encontrado)
			{
				System.out.println("Item " + codigo + " não encontrado");
			}
			menu=false;
		}
		else if(esc==2)
		{
			menu=false;
		}
		else
		{
			System.out.println("Escolha invalida");
		}
	}
	
	public void cadastrarPedido() {
		
		Boolean funcionarioDisp=false;
		Boolean mesaDisp=false;
		Boolean itemDisp=false;
		
		if(ListaDeFuncionarios.size() > 0) 
		{
			funcionarioDisp=true;
		}
		else
		{
			System.out.println("Nenhum funcionario cadastrado...");
		}
		
		
		for (Mesa  mesa: ListaDeMesas) 
		{
			if(mesa.getDisponivel())
			{
				mesaDisp=true;
			}
		}
		if(!mesaDisp)
		{
			System.out.println("Nenhuma mesa disponivel...");
		}
		
		for (ItemCardapio itemCardapio : Cardapio) 
		{
			if(itemCardapio.getDisponivel())
			{
				itemDisp=true;
			}
		}
		if(!itemDisp)
		{
			System.out.println("Nenhum item disponivel...");
		}
		
		Mesa mesaPedido=null;
		Funcionario funcionarioPedido=null;
		ItemCardapio itemPedido=null;
		Double totalPedido=0.0;
		
		if(mesaDisp && funcionarioDisp && itemDisp)
		{
			Boolean menu = true;
			while(menu)
			{
				System.out.println("Qual a mesa do pedido? ");
				for (Mesa mesa : ListaDeMesas) 
				{
					if(mesa.getDisponivel()==true)
					{
						System.out.println(mesa);
					}
				}
				System.out.println("Insira o numero da mesa: ");
				Integer numero = scan.nextInt(); 
				for (Mesa mesa : ListaDeMesas) 
				{
					if(mesa.getNumero()==numero)
					{
						if(mesa.getDisponivel())
						{
							mesaPedido=mesa;	
							menu=false;
						}
						else
						{
							System.out.println("Mesa indisponivel");
						}
					}
				}
			}
			menu=true;
			

			while(menu)
			{
				System.out.println("Quem é o funcionarios responsavel? ");
				exibirFuncionarios();
				System.out.println("Insira o ID do funcionario:");
				Integer idFuncionario = scan.nextInt();
				for (Funcionario funcionario : ListaDeFuncionarios) 
				{
					if(funcionario.getId()==idFuncionario)
					{
						funcionarioPedido=funcionario;
						menu=false;
					}
					else
					{
						System.out.println("Funcionario não encontrado");
					}
				}
			}
			menu=true;
			
			Integer idItem=1;
			
			ArrayList<ItemCardapio> ListaDoPedido = new ArrayList<>();
			while(menu)
			{
				System.out.println("Qual o codigo do item do pedido: ");
				for (ItemCardapio itemCardapio : Cardapio) 
				{
					if(itemCardapio.getDisponivel()==true)
					{
						System.out.println(itemCardapio);
					}
				}
				idItem = scan.nextInt(); 
				
				for (ItemCardapio item : Cardapio)
				{
					if(item.getCodigo()==idItem)
					{
						if(item.getDisponivel())
						{
							ListaDoPedido.add(item);
							funcionarioPedido.setTotalVendas(funcionarioPedido.getTotalVendas()+item.getPreco());
							funcionarioPedido.setVendas(funcionarioPedido.getVendas()+1);
							
							mesaPedido.setVendas(mesaPedido.getVendas()+item.getPreco());
							
							totalPedido+=item.getPreco();
						}
						else
						{
							System.out.println("Item indisponivel");
						}
					}
				}
				
				Boolean menuInterno=true;
				while(menuInterno)
				{
					System.out.println("Deseja adicionar mais algum item? \n[1] sim \n[2] não \nsua escolha: ");
					Integer esc = scan.nextInt();
					if(esc==1)
					{
						menuInterno=false;
					}
					else if(esc==2)
					{
						menu=false;
						menuInterno=false;
					}
					else
					{
						System.out.println("Opção indivalida");
					}
				}
				
			}
			
			Pedido pedido = new Pedido(mesaPedido, funcionarioPedido, ListaDoPedido);
			ListaDePedidos.add(pedido);
			
			System.out.println(pedido);
			System.out.println("Total do Pedido: R$" + totalPedido);
		}
		
	}
	
	public void exibirPedidos() {
		
		for (Pedido pedido : ListaDePedidos)
		{
			System.out.println(pedido);
		}
	}
	
	public void relatorio() {
		
		Double receita=0.0;
		
		for (Funcionario funcionario : ListaDeFuncionarios) 
		{
			receita+=funcionario.getTotalVendas();
		}
		
		System.out.println("TOTAL: R$" + receita + "\n");
		vendasGarcons();
		vendasMesas();
		
	}
}
