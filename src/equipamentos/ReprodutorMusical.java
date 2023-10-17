package equipamentos;

/**
 * comportamento esperado
 * Reprodutor Musical: 
 * tocar, pausar, selecionarMusica
 * **/
import static java.lang.System.out;

public class ReprodutorMusical implements Ipod{
	public void tocar() {
		out.println("Tocar");
	}
	public void pausar() {
		out.println("Pausar");
	}
	public void selecionarMusica() {
		out.println("Selecionar musica");
	}
}