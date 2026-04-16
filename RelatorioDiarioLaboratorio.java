import java.util.Locale;
import java.util.Scanner;

public class RelatorioDiarioLaboratorio { 
    
   public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in); 

        System.out.println("=== Relatorio Diario Do Laboratorio ==="); 

        System.out.print("Quantidade De Amostras Processadas: "); 
        int amostras = entrada.nextInt(); 

        System.out.print("Tempo Total Gasto (Minutos): "); 
        double tempoTotalMin = entrada.nextDouble(); 

        System.out.print("Numero De Resultados Validos: "); 
        int validos = entrada.nextInt(); 

        double tempoMedio = calcularTempoMedio(tempoTotalMin, amostras); 
        double percentualValidos = calcularPercentualValidos(validos, amostras); 

        System.out.println("\n=== Indicadores ==="); 
        System.out.println("Tempo Medio Por Amostra (min): " + formatar2Casas(tempoMedio)); 
        System.out.println("Percentual De Resultados Validos (%): " + formatar2Casas(percentualValidos)); 

        entrada.close(); 
    } 

    public static double calcularTempoMedio(double tempoTotalMin, int amostras) { 
        return tempoTotalMin / amostras; 
    } 

    public static double calcularPercentualValidos(int validos, int amostras) { 
        double razaoValidos = validos / (double) amostras; 
        return razaoValidos * 100.0; 
    } 

    public static String formatar2Casas(double valor) { 
        return String.format(Locale.US, "%.2f", valor); 
    } 
}

    
