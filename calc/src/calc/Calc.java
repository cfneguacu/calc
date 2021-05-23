package calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
	
    public static void main(String [] args) { 
   
    int opcao=0;
  
    Scanner teclado = new Scanner(System.in);
    
    do {

    System.out.println("-Seja bem-vindo(a) a sua calculadora-");
    System.out.println("Escolha uma o por favor!!");
    System.out.println("1. Soma");  
    System.out.println("2. Subtracao");  
    System.out.println("3. Multiplicacao");  
    System.out.println("4. Divisao");  
    System.out.println("0. Sair");  
    System.out.print("Operação: "); 
   
    
    opcao = teclado.nextInt();  
    
    if(opcao > 4) {
    	System.out.print("Opcao Errada\n");
    	main(null);
    }else if (opcao == 0) {
    	System.exit(0);
    }
  
  	Soma(opcao);
  
    }while(opcao !=0);
    
    }

    public static void Soma(int opcao) {
    	
    	

    	float valor1 = 0;
    	boolean check = false;
    	
    	do {
    		
    		Scanner teclado = new Scanner(System.in);
    		
        	try {
    			System.out.print("Digite o primeiro valor:");
    			
    			valor1 = teclado.nextFloat();
    			check = true;
    			
    		    
    	 }catch(InputMismatchException ex) {
    			
    		    check = false; 
    			System.out.println("Vamos começar denovo, digite apenas números teste");
    			
    	 }
        	
    	 }while(check==false);
       
    	//check = false;
    	float valor2 = 0;

        do{	
        	
        	Scanner teclado = new Scanner(System.in);
        	
            try {
            		
            	
        			System.out.print("Digite o segundo valor:");
        			
        			valor2 = teclado.nextFloat();
        			check = true;
        		    
        	 }catch(InputMismatchException ex) {
        			
        		    check = false; 
        			System.out.println("Vamos começar denovo, digite apenas números teste");
        			
        	 }
            	
         }while(check==false);
        
        float resultado;
        
        if(opcao == 1) {
        	
            resultado = valor1 + valor2;
        	System.out.print(resultado+"\n");

        }else if(opcao == 2) {
        	
            resultado = valor1 - valor2;
        	System.out.print(resultado+"\n");

        }else if(opcao == 3) {
        	
        	resultado = valor1 * valor2;
        	System.out.print(resultado+"\n");
        	
        }else if(opcao == 4) {
        	
        	if(valor2 != 0) {
        		
        	resultado= valor1 / valor2;
        	System.out.print(resultado+"\n");
        	
        	}else {
        		
        	System.out.print("Divisão por 0\n");
        	
        	}
        }
    }
}
