package 상속예제1;

public class MouseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mouse m = new Mouse();
		m.left();
		m.right();
		m.drag();
		
		System.out.println();
		wheelMouse wm = new wheelMouse();
		wm.right();
		wm.scroll();
		
		System.out.println();
		humanMouse hm = new humanMouse();
		hm.left();
		hm.reduce();
		
	}

}
