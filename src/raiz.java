import java.util.Scanner;

public class raiz{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float a, b, c;
		double x2;
		double x1;
		double delta;
		
		System.out.printf("Digite o A: ");
		a = ler.nextFloat();
		
		System.out.printf("Digite o B: ");
		b = ler.nextFloat();
		
		System.out.printf("Digite o C: ");
		c = ler.nextFloat();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (a == 0) {
			System.out.printf("Esta equação não possui raiz real");
		}if(delta < 0) {
			System.out.printf("Esta equação não possui raiz real");
		}else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("Delta = %.4f\n", delta);
			System.out.printf("X1 = %.4f\n", x1);
			System.out.printf("X2 = %4f", x2);
		}
	}
}