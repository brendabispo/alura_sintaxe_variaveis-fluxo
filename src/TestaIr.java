
public class TestaIr {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("O seu IR é de 7.5% e pode deduzir o valor de 142.80 reais.");
		}
		else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("O seu IR é de 15% e pode deduzir o valor de 354.80 reais.");
		}
		else if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("O seu IR é de 22.5% e pode deduzir o valor de 636.13 reais.");
		}
		else if (salario <= 1903.98) {
			System.out.println("O seu IR é de 0% e pode deduzir o valor de 0 reais.");
		} else {
			System.out.println("O seu IR é de 27.5% e pode deduzir o valor de 869.36 reais.");
		}

	}

}
