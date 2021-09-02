package questao02;

public class ThreadContadorSegundos extends Thread {
	
	public JanPrincipal jan;
	public int i=0;
	Thread thread= new Thread();
	
	
	public ThreadContadorSegundos(JanPrincipal j) {
		this.jan=j;
	
	
}
@SuppressWarnings("static-access")
public void contador() {
		
		for (i =0; i < 1000; i++) {
			try {
				this.jan.getLblSegundos().setText(Integer.toString(i));
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}


public void run() {
	contador();
}

}

