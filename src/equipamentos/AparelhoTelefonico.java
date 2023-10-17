package equipamentos;
/**
 * comportamento esperado
 * Aparelho Telefônico: 
 * ligar, atender, iniciarCorreioVoz
 * **/
import static java.lang.System.out;

public class AparelhoTelefonico implements Celular{
	public void ligar() {
		out.println("Fazer ligações");
	}
	public void atender() {
		out.println("Atender");
	}
	public void iniciarCorreioVoz() {
		out.println("Iniciar chamada de correio de voz");
	}
}