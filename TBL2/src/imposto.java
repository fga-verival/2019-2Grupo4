import java.util.Scanner;

public class imposto{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double ano;
        double aplicacao_inicial;
        double taxa_juros;
        double taxa_juros_anual;
        double rendimento_bruto = 0;
        double imposto_de_renda = 0;
        double rendimento_liquido = 0;


        System.out.println("Digite número de anos da aplicação:");
        ano = sc.nextDouble();
        
        System.out.println("Digite o valor da aplicação inicial:");
        aplicacao_inicial = sc.nextDouble();

        System.out.println("Digite a taxa de juros anual:");
        taxa_juros = sc.nextDouble();

        taxa_juros_anual = taxa_juros / 100;
        

        //1 ano = 365 dias
        
        // ano <= 180
        if(ano <= 0.493150685){

            rendimento_bruto = aplicacao_inicial * (ano * taxa_juros_anual);
            imposto_de_renda = rendimento_bruto * 0.225;
            rendimento_liquido = ((aplicacao_inicial + (rendimento_bruto - imposto_de_renda)) / aplicacao_inicial) * 100 - 100;
        }                        

        // ano > 180 dias e < 360 dias
        else if(ano > 0.493150685 && ano <= 0.98630137){

            rendimento_bruto = aplicacao_inicial * (ano * taxa_juros_anual);
            imposto_de_renda = rendimento_bruto * 0.20;
            rendimento_liquido = ((aplicacao_inicial + (rendimento_bruto - imposto_de_renda)) / aplicacao_inicial)* 100 - 100;
        }   
        
        // ano > 180 dias e <= 360 dias
        else if(ano > 0.98630137 && ano <=1.97260274){

            rendimento_bruto = aplicacao_inicial * (ano * taxa_juros_anual);
            imposto_de_renda = rendimento_bruto * 0.175;
            rendimento_liquido = ((aplicacao_inicial + (rendimento_bruto - imposto_de_renda)) / aplicacao_inicial) * 100 - 100;
        }     
        
        // ano > 360 dias e <= 720 dias                 
        else if(ano > 1.97260274){

            rendimento_bruto = aplicacao_inicial * (ano * taxa_juros_anual);
            imposto_de_renda = rendimento_bruto * 0.15;
            rendimento_liquido = ((aplicacao_inicial + (rendimento_bruto-imposto_de_renda))/aplicacao_inicial)*100-100;
        }

        System.out.println("Rendimento Bruto: R$ " + rendimento_bruto);
        System.out.println("Imposto de Renda: R$ " + imposto_de_renda);
        System.out.println("Rendimemento Liquído (%): " + rendimento_liquido);

    }
}