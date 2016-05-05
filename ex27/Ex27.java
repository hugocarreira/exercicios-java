package ex27;

public class Ex27 {

    
    public static void main(String[] args) {
        ConjuntoDeReais a, b, c;
        
        a = new ConjuntoDeReais(10);
        b = new ConjuntoDeReais(200);
        
        a.adicionar(1);
        a.adicionar(3);
        a.adicionar(11);
        a.adicionar(5);
        a.adicionar(9);
        a.adicionar(3);
        a.adicionar(5);
        
        
        a.imprimir();
        a.remover(11);
        a.imprimir();
        
        b.adicionar(2);
        b.adicionar(6);
        b.adicionar(12);
        b.adicionar(3);
        
        b.imprimir();
        
        c = a.uniao(b);
        c.imprimir();
    }
    
}
