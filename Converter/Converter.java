import java.util.Scanner;

public class Converter {
    static void celsiusFunction(float temp){
        double tempC = temp * 1.8 + 32;
        System.out.println(tempC);
    }
    static void fahrenheitFunction(float temp){
        double tempF = (temp - 32) / 1.8;
        System.out.println(tempF);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a temperatura:");
        float temp = s.nextFloat();

        System.out.println("Deseja converter para Celsius (1) ou Fahrenheit (2)?");
        int escolha = s.nextInt();
        if (escolha == 1){
            celsiusFunction(temp);
        } else if(escolha == 2){
            fahrenheitFunction(temp);
        }
    }
}