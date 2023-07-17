public class Strings {
    public static void main(String[] args) {

        //Com tipos manifestos
        String escola1 = "Fiap";


        String escola2 = new String("Fiap");

        {
            boolean isEqual = (escola2.equals(escola1));
            System.out.println("Igual: " + isEqual);
        }
    }
}
