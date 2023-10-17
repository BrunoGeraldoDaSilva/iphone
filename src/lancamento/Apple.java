package lancamento;

import static java.lang.System.out;


import equipamentos.Celular;
import equipamentos.Computador;
import equipamentos.Ipod;
import lancamento.Iphone;
import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;


public class Apple  {
	public static void main(String[]args) {
		Iphone iphone = new Iphone();
		
		//NavegadorInternet navegadorinternet = new NavegadorInternet();
		//AparelhoTelefonico aparelhotelefonico = new AparelhoTelefonico();
		//ReprodutorMusical reprodutormusical = new ReprodutorMusical();
		
		Celular celuar = iphone;
		Computador computador = iphone;
		Ipod ipod = iphone;
		
		celuar.ligar();
		celuar.atender();
		celuar.iniciarCorreioVoz();
		
		computador.adicionarNovaAba();
		computador.exibirPagina();
		computador.atualizarPagina();
		
		ipod.pausar();
		ipod.selecionarMusica();
		ipod.tocar();
	}
}

