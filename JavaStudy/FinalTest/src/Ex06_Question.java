
public class Ex06_Question {

	public static void main(String[] args) {
		
		goBusan(new Ex06_Train());
		goBusan(new Ex06_Bus());
		goBusan(new Ex06_Airplane());
	}
	
	private static void goBusan(Ex06_Go b) {
		b.go();
	}

}
