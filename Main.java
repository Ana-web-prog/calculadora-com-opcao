import java.util.Scanner;

class Main {
	
	public static double soma (double N1, double N2) {
		double soma = N1 + N2;
		return soma;
	}
	
	public static double Subtracao (double N1, double N2) {
		double Subtracao =  N1 - N2;
		return Subtracao;
	}
	
	public static double Multiplicacao (double N1, double N2) {
		double Multiplicacao =  N1 * N2;
		return Multiplicacao;
	}
		
	public static double Divisao (double N1, double N2) {
		double Divisao =  N1 / N2;
		return Divisao;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Informe a operacao:");
		int opcao = sc.nextInt();
		System.out.println ("Informe o primeiro numero:");
		double N1 = sc.nextDouble();
		System.out.println ("Informe o segundo numero:");
		double N2 = sc.nextDouble();
		
		switch (opcao) {
		case 1:
			System.out.println ("1: Soma");
			double Soma = N1 + N2;
			System.out.println (+Soma);
			break;
		case 2:
			System.out.println ("2: Subtracao");
			double Subtracao = N1 - N2;
			System.out.println (+Subtracao);
			break;
		case 3:
			System.out.println ("3: Multiplicacao");
			double Multiplicacao = N1 * N2;
			System.out.println (+Multiplicacao);
			break;
		case 4:
			System.out.println ("4: Divisao");
			double Divisao = N1 / N2;
			System.out.println (+Divisao);
			break;
			default:
				System.out.println ("Opcao invalida!");
			
		}

	}

}