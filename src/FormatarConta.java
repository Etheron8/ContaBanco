public class FormatarConta {
    public static void main(String[] args) {

        try {
            String newConta = contaFormatada("6519");
            System.out.println("Sua Nova Conta é " + newConta);
        } catch (ContaException e) {
            // TODO Auto-generated catch block
            System.out.println("Sua Conta deve ter exatamente 4 Digitos numericos !!");
            e.printStackTrace();
        }
    }

    static String contaFormatada(String conta) throws ContaException {
        if (conta.length() != 4)
            throw new ContaException();
        return conta;
    }
}