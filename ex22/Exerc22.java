package exerc22;


public class Exerc22 {

    public static void main(String[] args) {
        Data d;
        
        d = new Data(2, 5, 2016);
        
        if(d.ehValida()) {
            System.out.println("OK");
            if(d.ehBissexto()) {
                System.out.println("É bissexto");
            } else {
                System.out.println("Não é bissexto");
            }
            d.imprime();
        } else {
            System.out.println("Data Inválida");
        }
    }
}
