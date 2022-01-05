package calc;

import java.util.Scanner;

public class Calc {
	
    public static void main(String [] args) {
		menu();
	}

	public static void menu(){

			int opcao;
			Scanner teclado = new Scanner(System.in);

			do {

				System.out.println("-Seja bem-vindo(a) a sua calculadora-");
				System.out.println("Escolha uma opção por favor!!");
				System.out.println("1. Soma");
				System.out.println("2. Subtração");
				System.out.println("3. Multiplicação");
				System.out.println("4. Divisão");
				System.out.println("0. Sair");
				System.out.print("Operação: ");


				opcao = teclado.nextInt();

				if(opcao > 4) {
					System.out.print("Opcao Errada\n");
					menu();
				}else if(opcao == 0){
					System.exit(0);
				}

				numeros(opcao);

			}while(opcao !=0);


	}

    public static void numeros(int opcao) {

    	String valor1;
		String valor2;

		Scanner teclado = new Scanner(System.in);

		do {
    		
			System.out.print("Digite o primeiro valor:");
			valor1 = teclado.nextLine();

		}while(!checaNumero(valor1));

        do{

			System.out.print("Digite o segundo valor:");
			valor2 = teclado.nextLine();

         }while(!checaNumero(valor2));
        
        float resultado;
        
        if(opcao == 1) {
        	
            resultado = Float.parseFloat(valor1) + Float.parseFloat(valor2);
        	System.out.print(resultado+"\n");

        }else if(opcao == 2) {
        	
            resultado = Float.parseFloat(valor1) - Float.parseFloat(valor2);
        	System.out.print(resultado+"\n");

        }else if(opcao == 3) {
        	
        	resultado = Float.parseFloat(valor1) * Float.parseFloat(valor2);
        	System.out.print(resultado+"\n");
        	
        }else if(opcao == 4) {

        	if(Float.parseFloat(valor2) != 0) {

        	resultado= Float.parseFloat(valor1) / Float.parseFloat(valor2);
        	System.out.print(resultado+"\n");

        	}else {

        	System.out.print("Divis�o por 0\n");

        	}
        }
    }

	public static boolean checaNumero(String valor) {

	boolean check;

	if(valor.matches("[0-9]")){
		check = true;
	}else{
		System.out.println("Tente novamente");
		check = false;
	}
		return check;
	}
}
