package lancamento;

import static java.lang.System.out;

import equipamentos.Celular;
import equipamentos.Computador;
import equipamentos.Ipod;

public class Iphone implements Computador, Celular, Ipod {
	public void ligar() {
		out.println("Ligando via iphone");
	}
	public void atender() {
		out.println("Atendendo via iphone");
	}
	public void iniciarCorreioVoz() {
		out.println("Iniciando correio de voz via iphone");
		out.println();
	}
	public void exibirPagina() {
		out.println("Exibindo pagina via iphone");
	}
	public void adicionarNovaAba() {
		out.println("Adicionando nova aba via iphone");
	}
	public void atualizarPagina() {
		out.println("Atualizando pagina via iphone");
		out.println();
	}
	public void tocar() {
		out.println("Tocando via iphone");
	}
	public void pausar() {
		out.println("Pausando via iphone");
	}
	public void selecionarMusica() {
		out.println("Selecionando musica via iphone");
	}
}
