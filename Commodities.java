public class Commodities {
    public static void main(String[] args) {
        
        String produto[] = new String[5];
        produto[0] = "Arroz em Casca Irrigado Sc 60Kg";
        produto[1] = "Café Arábica Tipo 6 Sc 60Kg";
        produto[2] = "Feijão Carioca Sc 60Kg";
        produto[3] = "Açucar Sc 50Kg";
        produto[4] = "Beterraba Comum Sc 20Kg";

        double valor[] = new double[5];
        valor[0] = 89.00;
        valor[1] = 1260.00;
        valor[2] = 400.00;
        valor[3] = 143.65;
        valor[4] = 180.00;

        for (int index = 0; index < produto.length; index++) {
            System.out.println("O " +produto[index]+ " possui um valor de R$"+valor[index]);
            
        }
    }
}
