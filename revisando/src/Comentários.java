/**
 * A classe principal do meu programa
 *
 * @author Adolfo
 * @version 1.0
 * @since 1.0
 */
public class Comentários {
    /**
     * Este é o método que inicia o programa
     *
     * @param args
     */
    public static void main(String[] args) {

        //estou imputando a primeira nota
        var nota1 = 10;

        //estou imputando a segunda nota
        var nota2 = 5;

        //A quantidade de notas
        var qtdNotas = 2;

        /*
        Para calcular a média, primeiro eu somo as notas
        depois eu divido pela quantidade.
         */
        double media = (nota1 + nota2)/qtdNotas;

        //imprimindo a média
        System.out.println("Média: " + media);
    }
}
