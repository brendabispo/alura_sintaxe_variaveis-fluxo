
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais!");

		int idade = 17;
		int quantidadePessoas = 0;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		} else {
			System.out.println("Você tem menos de 18 anos!");

			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado!");
			} else {
				System.out.println("Infelizmente, você não pode entrar!");
			}

		}

	}

}
