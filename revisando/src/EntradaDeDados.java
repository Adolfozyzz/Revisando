import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota da Prova Semestral");
        float ps = entrada.nextFloat();
        System.out.println("Informe a nota do TCC");
        float tcc = entrada.nextFloat();
        System.out.println("Informe a nota da av1");
        float av1 = entrada.nextFloat();
        System.out.println("Informe a nota da av2");
         float av2 = entrada.nextFloat();

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2)/2)* 0.2;
        System.out.println("A média final é " + mediaFinal);

        if(mediaFinal>=6)
            System.out.println("Aprovado");
        else if (mediaFinal>=3)
            System.out.println("Está de exame");
            else
            System.out.println("reprovado");
        }

    }

