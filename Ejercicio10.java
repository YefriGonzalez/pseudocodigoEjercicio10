import java.util.*;
public class Ejercicio10{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int sumatoria=0;
		int multiploDe6=0;
		int sumatoriaDe1a10=0;
		int numero1;
		int numero2;
		while(sumatoria<=1000){
			System.out.print("\nIngrese el primer numero: ");
			numero1=scanner.nextInt();
			System.out.print("Ingrese el segundo numero: ");
			numero2=scanner.nextInt();
			sumatoria=sumatoria+numero1+numero2;
			System.out.print("Suma: "+sumatoria);
			if ((numero1%6)==0) {
				multiploDe6=multiploDe6+1;
			}
			if ((numero2%6)==0) {
				multiploDe6=multiploDe6+1;
			}
			if (numero1<=10 && numero1>=1) {
				sumatoriaDe1a10=sumatoriaDe1a10+numero1;
			}
			if (numero2<=10 && numero2>=1) {
				sumatoriaDe1a10=sumatoriaDe1a10+numero2;
			}
		}
		System.out.println("\nCantidad de numeros ingresados que son multiplos de 6: "+multiploDe6);
		System.out.println("Sumatoria de numeros que se encuentran entre 1 y 10 : "+sumatoriaDe1a10);
	}
}