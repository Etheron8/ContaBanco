public class FormatarConta {

    public static void main(String[] args) {
        try {
            String suaConta = contaformatada("98598");
            System.out.println(suaConta);
        } catch (ContaException e) {
            System.out.println("Sua conta deve 4 digitos numericos");
            e.printStackTrace();
        }
    }

    static String contaformatada(String conta) throws ContaException {
        if (conta.length() != 4)
            throw new ContaException();
        return "5458";
    }
}