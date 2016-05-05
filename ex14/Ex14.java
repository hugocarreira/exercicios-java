package ex14;


import java.util.Scanner;

public class Ex14 {
    
    public static void main(String [] args) {
        Scanner t = new Scanner(System.in);
        float nota, somaNotas, media, qtdAlunos;
        
        somaNotas = 0;
        int i;
        
        for(i=1; ;i++) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            nota = t.nextFloat();
            
            if(nota == -1) {
                break;
            }
            somaNotas += nota;
        }
        
        qtdAlunos = i - 1;
        
        media = somaNotas / qtdAlunos;
        System.out.printf("A média das notas é: " + media + "\n");
        
    }
}
