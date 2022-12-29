
public class TestaFatorial {

	public static void main(String[] args) {

		int f = 1;

		for (int n = 1; n <= 10; n++) {

			f *= n;

			System.out.println("O fatorial de " + n + " é: " + f);
		}
	}
}
