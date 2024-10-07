package principal;
import java.util.Scanner;

import funcoes.TodasFuncoes;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		TodasFuncoes funcao = new TodasFuncoes();
		
		Boolean menu = true;
		Boolean menuInt = true;
		int esc=0;
		int escInt=0;
		
		System.out.println("Alunos: \nJoão Pedro Cordasso Trento \nRonei Hearter \n\n");
		while(menu)
		{
			menuInt=true;
		
			System.out.println("[1] Cardapio "
					+ "\n[2] Funcionarios "
					+ "\n[3] Mesas "
					+ "\n[4] Pedidos "
					+ "\n[5] Relatorio "
					+ "\n[6] Sair"
					+ "\nInsira sua escolha: ");
			
			esc = scan.nextInt();
			switch(esc)
			{
				case 1:
					while(menuInt)
					{
						System.out.println("[1] adicionar item ao cardapio \n"
								+ "[2] exibir cardapio \n"
								+ "[3] excluir item do cardapio \n"
								+ "[4] disponibilidade dos itens do cardapio \n"
								+ "[5] sair \nsua escolha:");
						escInt = scan.nextInt();
						
						switch(escInt)
						{
							case 1:
								funcao.cadastrarItem();
								break;
								
							case 2:
								funcao.exibirCardapio();
								break;
								
							case 3:
								funcao.excluirItemCardapio();
								break;
							case 4:
								funcao.disponibilidadeItens();
								break;
							case 5:
								menuInt=false;
								break;
								
							default:
								System.out.println("Opção invalida");
						}
					}
					break;
					
				case 2:
					while(menuInt)
					{
						System.out.println("[1] cadastrar funcionario \n"
								+ "[2] exibir funcionarios \n"
								+ "[3] excluir funcionario \n"
								+ "[4] vendas dos garçons \n"
								+ "[5] sair \nsua escolha:");
						escInt = scan.nextInt();
						
						switch(escInt)
						{
							case 1:
								funcao.cadastrarFuncionario();
								break;
								
							case 2:
								funcao.exibirFuncionarios();
								break;
								
							case 3:
								funcao.excluirFuncionario();
								break;
								
							case 4:
								funcao.vendasGarcons();
								break;
								
							case 5:
								menuInt=false;
								break;
								
							default:
								System.out.println("Opção invalida");
						}
					}
					break;
					
				case 3:
					while(menuInt)
					{
						System.out.println("[1] cadastrar mesa \n"
								+ "[2] exibir mesas \n"
								+ "[3] excluir mesa \n"
								+ "[4] vendas das mesas \n"
								+ "[5] disponibilidade \n"
								+ "[6] sair \nsua escolha:");
						escInt = scan.nextInt();
						
						switch(escInt)
						{
							case 1:
								funcao.cadastrarMesa();
								break;
								
							case 2:
								funcao.exibirMesas();
								break;
								
							case 3:
								funcao.excluirMesa();
								break;
								
							case 4:
								funcao.vendasMesas();
								break;
								
							case 5:
								funcao.disponibilidadeMesas();
								break;
								
							case 6:
								menuInt=false;
								break;
								
							default:
								System.out.println("Opção invalida");
						}
					}
					break;
					
				case 4:
					while(menuInt)
					{
						System.out.println("[1] cadastrar pedido \n"
								+ "[2] exibir pedidos \n"
								+ "[3] sair \nsua escolha:");
						escInt = scan.nextInt();
						
						switch(escInt)
						{
							case 1:
								funcao.cadastrarPedido();
								break;
								
							case 2:
								funcao.exibirPedidos();
								break;
								
							case 3:
								menuInt=false;
								break;
								
							default:
								System.out.println("Opção invalida");
						}
					}
					break;
					
				case 5:
					funcao.relatorio();
					break;
					
				case 6:
					menu=false;
					break;
					
				default:
					System.out.println("Opção invalida");
			}
		}

	}

}
