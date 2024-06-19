import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu primeiro nome");
    String nome = sc.next();
    
    System.out.println("Digite seu sobrenome");
    String sobrenome = sc.next();

    System.out.println("seu nome completo é: " + nome + sobrenome);

    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();

    System.out.println("Digite sua Massa:");
    int massa = sc.nextInt();

    System.out.println("DIgite sua altura");
    double altura = sc.nextInt();

    System.out.println("A fórmula usada para calcula o IMC é: peso dividido pela altura ao quadrado");
 
    double alturamento = altura / 100;
    double alturaquadrada = alturamento * alturamento; 
    double pesofinal = massa / alturaquadrada;

    System.out.println("Massa:");
    System.out.println(massa+" KG");
    System.out.println("");
    System.out.println("IMC:");
    System.out.println(pesofinal);
    
   
  

  
    
    

  
    System.out.println("");

    
  
    
 



    sc.close();
  
  }

  
}