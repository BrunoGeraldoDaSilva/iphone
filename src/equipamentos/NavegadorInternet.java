package equipamentos;

/**
 * Comportamento esperado
 * Navegador na Internet: 
 * exibirPagina, adicionarNovaAba, atualizarPagina
 * **/
import static java.lang.System.out;

public class NavegadorInternet implements Computador{
	public void exibirPagina() {
		out.println("Exibir pagina");
	}
	public void adicionarNovaAba() {
		out.println("Adicionar uma nova aba");
	}
	public void atualizarPagina() {
		out.println("Atualizar pagina");
	}
}
