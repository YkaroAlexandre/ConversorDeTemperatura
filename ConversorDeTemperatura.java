import java.util.Scanner;

public class ConversorDeTemperatura {
  public static void main(String[] args) {

  // Criando um input.
  Scanner entrada = new Scanner(System.in);

  System.out.println("Olá, digite os graus em celsius para que eu possa converter:");
  double celsius = entrada.nextFloat();

  // Formulas para conversoes dos graus Celsius.
  double kelvin = celsius + 273.15;
  double reaumur = celsius * 0.8;
  double fahrenheit = celsius * 1.8 + 32;
  double rankine = fahrenheit + 459.67;

  // Usando o print format com delimitacao de duas casa decimais.
  System.out.printf("%.2f celsius em Reaumur é: %.2f \n", celsius, reaumur);
  System.out.printf("%.2f celsius em Kelvin é: %.2f \n", celsius, kelvin);
  System.out.printf("%.2f celsius em Fahrenheit é: %.2f \n", celsius, fahrenheit);
  System.out.printf("%.2f celsius em Rankine é: %.2f \n", celsius, rankine);
  }
  
}
