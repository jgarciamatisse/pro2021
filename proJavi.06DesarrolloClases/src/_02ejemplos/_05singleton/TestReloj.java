package _02ejemplos._05singleton;

public class TestReloj {
	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			System.out.println(Reloj.getInstance().getHora());
		}
	}

}
