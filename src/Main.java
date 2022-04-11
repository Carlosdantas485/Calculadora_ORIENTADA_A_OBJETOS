import java.util.Locale;
import java.util.Scanner;

import entitties.Operacoes;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		float valorTotal;
		System.out.println("Digite um valor");
		valorTotal = sc.nextFloat();
		
		float valorDigitado;
		
		int i;
		String historicoExecucao = "\n";
		String escolha;
		
		for (i = 1; i > 0; i++) {
			
			Operacoes.menu();
			
			escolha = sc.next().toUpperCase();
			
			if(escolha.matches("SAIR")){
				System.out.println("\nSAIU");
				i = -1;
			}
			
			else if(escolha.matches("1")){
				
				System.out.printf("%.2f + ", valorTotal);
				
				valorDigitado = sc.nextFloat();
				
				historicoExecucao += valorTotal + " + " + valorDigitado+ "";
				
				valorTotal = Operacoes.soma(valorTotal, valorDigitado);
				historicoExecucao += " = " + valorTotal + "\n\n";
				
				System.out.printf("%.2f\n", valorTotal);
				
			}
			
			else if(escolha.matches("2")){
				System.out.printf("%.2f - ", valorTotal);
				
				valorDigitado = sc.nextFloat();
				historicoExecucao += valorTotal + " - " + valorDigitado;
				valorTotal = Operacoes.subtrair(valorTotal, valorDigitado);
				historicoExecucao += " = " + valorTotal + "\n\n";
				
				System.out.printf("%.2f\n", valorTotal);
				
			}
			
			else if(escolha.matches("3")){
				System.out.printf("%.2f / ", valorTotal);
				
				valorDigitado = sc.nextFloat();
				historicoExecucao += valorTotal + " / " + valorDigitado;
				valorTotal = Operacoes.dividir(valorTotal, valorDigitado);
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
				
			}
			
			else if(escolha.matches("4")){
				System.out.printf("%.2f * ", valorTotal);
				
				valorDigitado = sc.nextFloat();
				historicoExecucao += valorTotal + " * " + valorDigitado;
				valorTotal = Operacoes.multiplicar(valorTotal,valorDigitado );
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
				
			}
			
			else if(escolha.matches("5")){
				System.out.printf("%.2f - ", valorTotal);
				historicoExecucao += valorTotal + " ^2 ";
				valorTotal = Operacoes.elevarQuadrado(valorTotal);
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
				
			}
			
			else if(escolha.matches("6")){
				System.out.printf("%.2f - ", valorTotal);
				historicoExecucao += valorTotal + " ^3 ";
				valorTotal = Operacoes.elevarCubo(valorTotal);
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
				
			}
			
			else if(escolha.matches("7")){
				System.out.printf("%.2f Raiz ", valorTotal);
				historicoExecucao +=  "Raiz quadrada de " + valorTotal;
				valorTotal = Operacoes.raizQuadrada(valorTotal);
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
			}
			
			else if(escolha.matches("8")){
				System.out.printf("%.2f Raiz ", valorTotal);
				historicoExecucao += "Raiz cubica de " + valorTotal;
				valorTotal = Operacoes.raizCubica(valorTotal);
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
			}
			else if(escolha.matches("9")){
				System.out.printf("%.2f Raiz ", valorTotal);
				historicoExecucao += "LOG DE " + valorTotal;
				valorTotal = Operacoes.log(valorTotal);
				historicoExecucao += " = " + valorTotal + "\n\n";
				System.out.printf("%.2f\n", valorTotal);
			}
			else if(escolha.matches("0")){
				System.out.println("Digite um valor\n");
				valorTotal = sc.nextFloat();
				historicoExecucao += "ZEROU A CALCULADORA\n\n";
			}
			else if(escolha.matches("HISTORICO")){
				System.out.println("\n" + historicoExecucao);
			}
			
			
			System.out.printf("\n\t\t\t\t%.2f\n", valorTotal);
			
		}
		
		sc.close();
	}	
}
