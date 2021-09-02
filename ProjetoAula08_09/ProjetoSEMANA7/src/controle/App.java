package controle;

import modelo.Empregado;
import visao.JanelaPrincipal;

public class App {
	
	public static void main(String[] args) {
		
		JanelaPrincipal jan= new JanelaPrincipal();
		jan.setVisible(true);
		Empregado e= new Empregado();
		EmpregadoControle empC= new EmpregadoControle(jan,e);
	}

}
