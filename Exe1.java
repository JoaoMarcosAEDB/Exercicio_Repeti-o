import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in); 
        int valor;
        int maior = 1;  
        
        do {  
           
            System.out.printf("%dN:", maior);
             valor = leitor.nextInt();      
           
         
          if(valor > 0){
            System.out.println("Positivo");
           }else{
            System.out.println("Negativo");
           }
          maior++;
        } while ( maior < 11);
	}

}
