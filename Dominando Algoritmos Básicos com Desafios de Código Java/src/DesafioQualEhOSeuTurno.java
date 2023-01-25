// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class DesafioQualEhOSeuTurno {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    char turno = leitor.next().toUpperCase().charAt(0);

    switch (turno) {
      case 'M':
        System.out.println("Bom Dia!");
        break;
      case 'V':
        System.out.println("Boa Tarde!");
        break;
      case 'N':
        System.out.println("Boa Noite!");
        break;
      default:
        System.out.println("Turno inválido!");
        break;
    }

  }
}