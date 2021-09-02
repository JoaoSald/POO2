package controle;

import visao.JanelaPrincipal;

public class App {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		JanelaPrincipal jan = new JanelaPrincipal();
		jan.setVisible(true);
		EmpregadoControle empC= new EmpregadoControle(jan);
		
		
	}

}
