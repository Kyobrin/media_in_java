import java.util.Locale;
import java.util.Scanner;

public class media {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite suas notas abaixo:");
		System.out.print("Nota 1:");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2:");
		double nota2 = sc.nextDouble();
		System.out.print("Nota 3:");
		double nota3 = sc.nextDouble();
		System.out.print("Nota 4:");
		double nota4 = sc.nextDouble();
		System.out.print("Nota 5:");
		double nota5 = sc.nextDouble();
		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10 || nota5 < 0 || nota5 > 10) {
		    System.out.println("Alguma nota digitada é inválida, tente novamente!");
		} else {
		    double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
		
		if (media <= 4.00) {
			System.out.printf("A media das suas notas e: %.1f\n", media);
			System.out.println("REPROVADO");
		}
		else if (media >= 5.0 && media <= 6.0) {
			System.out.printf("A media das suas notas e: %.1f\n", media);
			System.out.println("RECUPERACAO");
		}
		else if (media > 6.0) {
			System.out.printf("A media das suas notas e: %.1f\n", media);
			System.out.println("APROVADO");
		}

	sc.close();
		}
	}
}
	
