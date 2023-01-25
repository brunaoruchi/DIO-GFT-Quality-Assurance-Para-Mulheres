// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class DesafioMediaDeIdade {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int idade1 = leitor.nextInt();
    int idade2 = leitor.nextInt();
    int idade3 = leitor.nextInt();

    int mediaIdades = (idade1 + idade2 + idade3) / 3;

    if (mediaIdades < 0) {
      System.out.println("Média de idade inválida");
    } else {
      if (mediaIdades < 26) {
        System.out.println("Jovem!");
      } else if (mediaIdades > 25 && mediaIdades < 60) {
        System.out.println("Adulta!");
      } else {
        System.out.println("Idosa!");
      }
    }
  }
}