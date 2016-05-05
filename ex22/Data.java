
package exerc22;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    public char sep;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean ehValida() {
        if(ano > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= this.ultimoDiaMes()) 
            return true;
        else 
            return false;
    }
    
    public boolean ehBissexto() {
        return ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0));
        // boolean vai retornar true or false
        // não precisa de um if
    }
    
    private int ultimoDiaMes() {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        }
        else if(mes == 2) {
                return ehBissexto() ? 29 : 28;
        }
        else {
            return 0;
        }
    }
  
    
    public void imprime() {
        imprime('/');
    }

    
    public void imprime(char sep) {
        if(ehValida())
            System.out.printf("%02d%c%02d%c%04d\n", dia, sep, mes, sep, ano);
        else
            System.out.print("INVÁLIDA");
    }
           
    
}
