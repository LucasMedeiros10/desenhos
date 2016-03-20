package br.univel.classeabstrata;

// public class ExM implements Desenho {
class ExM extends DesenhoAbstrato {

	public static int SIZE = 8;
	

	
	@Override
	protected void desenhar() {
				
		for (int linha = 1; linha <= SIZE; linha++) {
			for (int col = 1; col <= SIZE; col++) {
				if (col > linha) {
					System.out.print(" ");
				} else {
					System.out.print(col + " ");
				}
			}
			System.out.print("\n");
		}
	}



	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "M";
	}
	

}