package ex15;

import java.util.Scanner;

public class Ex15 {

    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int qtdVogais=0, qtdDigitos=0, qtdOutros=0;
        char carac;
        
        for(;;) {
            System.out.printf("Digite um caracter (PONTO para terminar): ");
            
            carac = t.nextLine().charAt(0);
            
            if(carac == '.') {
                break;
            }
            
            switch(carac) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    qtdVogais++;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    qtdDigitos++;
                    break;
                default:
                    qtdOutros++;
            }
        }
        
            System.out.printf("Quantidade de vogais: " + qtdVogais + "\n");
            System.out.printf("Quantidade de digitos: " + qtdDigitos + "\n");
            System.out.printf("Quantidade de demais caracteres: " + qtdOutros + "\n");
    }
    
}
