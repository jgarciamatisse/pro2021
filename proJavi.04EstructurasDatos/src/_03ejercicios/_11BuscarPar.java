package _03ejercicios;

public class _11BuscarPar {
	public static void main(String[] args) {
		System.out.println(haypares2(new int[] {1,2,4,5,8}));
		System.out.println(haypares2(new int[] {1,3, 5, 7}));
		
	}

	public static boolean haypares1(int v[]) {
		int i = 0;
		while (i < v.length && v[i] % 2 != 0) {
			i++;
		}
		if (v[i] % 2 == 0) return true;
		else return false;

	}
	public static boolean haypares2(int v[]) {
		int i = 0;
		while (i < v.length && v[i] % 2 != 0) {
			i++;
		}
		if (i < v.length) return true;
		else return false;

	}

}
