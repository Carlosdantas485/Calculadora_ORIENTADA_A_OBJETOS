package entitties;

public class Operacoes {

	public static float soma(float resultado, float valor){
		
		resultado = resultado + valor;  
		
		return resultado;
	}
	
	public static float subtrair(float resultado, float valor){
		
		resultado = resultado - valor;  
		
		return resultado;
	}
	
	public static float dividir(float resultado, float valor){
		
		resultado = resultado / valor;  
		
		return resultado;
	}
	
	public static float multiplicar(float resultado, float valor){
		resultado = resultado * valor;  
		
		return resultado;
	}
	
	public static float elevarQuadrado(float resultado){
		resultado = resultado * resultado;  
		
		return resultado;
	}
	
	public static float elevarCubo(float resultado){
		resultado = resultado * resultado * resultado;  
		
		return resultado;
	}
	
	public static float raizQuadrada(float resultado){
		
		resultado = (float) Math.sqrt(resultado);
		
		return resultado;
	}
	
	public static float raizCubica(float resultado){
		
		resultado = (float) Math.pow(resultado, 1.0/3.0);
		
		return resultado;
	}
	
	public static float log(float resultado){
		
		resultado = (float) Math.log10(resultado);
		
		return resultado;
	}
	
	public static void menu(){
		System.out.printf("==========================================");
		System.out.printf("\n\t\t\t\t\n");
		
		System.out.println("\nEscolha a opcao desejada ");
		System.out.println("( 1 ) - Soma ");
		System.out.println("( 2 ) - Subtracao");
		System.out.println("( 3 ) - dividir ");
		System.out.println("( 4 ) - mutiplicar");
		System.out.println("( 5 ) - Elevar ao quadrada");
		System.out.println("( 6 ) - Elevar ao cubica");
		System.out.println("( 7 ) - Raiz quadrada");
		System.out.println("( 8 ) - Raiz cubica");
		System.out.println("( 9 ) - mutiplicar");
		System.out.println("( 0 ) - ZERAR ");
		System.out.println("( SAIR )");
		System.out.println("( HISTORICO )");
		System.out.printf("==========================================\n");
	}
	
	
}
