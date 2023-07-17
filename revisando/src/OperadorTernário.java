import java.util.Scanner;

public class OperadorTernário {
    /**
     * implemente um programa que recebe a quantidade de laranjas que
     * o cliente deseja comprar e se o pagamento será por pix ou não(boolean).
     * Caso a quantidade de laranjas seja menor do que 10,
     * o valor de cada laranja será R$2,50. Caso seja maior ou igual a 10,
     * o valor será R$ 2,00.
     * Se o pagamento for no pix, será adicionado um desconto de 10%.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de laranjas: ");
        var laranjas = entrada.nextInt();

        System.out.println("A forma de pagamento é PIX? (true ou false)");
        boolean pix = entrada.nextBoolean();

        double valor = laranjas <10 ? 2.5 : 2;
        double desconto = pix == true ? .9 : 1;

        double valorFinal = valor * laranjas * desconto;
        System.out.println("VALOR : " + valorFinal);

    }
}
