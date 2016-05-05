package ex27;

public class ConjuntoDeReais {

    private float[] numeros;
    private int qtdNumeros;

    public ConjuntoDeReais(int qtdMaxima) {
        numeros = new float[qtdMaxima];
        qtdNumeros = 0;
    }

    public boolean pertence(float n) {
        if(this.posicao(n) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionar(float n) {
        if(qtdNumeros < numeros.length && ! this.pertence(n)) {
            numeros[qtdNumeros] = n;
            qtdNumeros++;
            return true;
        } else {
            return false;
        }
    }

    private int posicao(float n) {
        for(int i = 0; i < qtdNumeros; i++) {
            if(numeros[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(float n) {
        if(this.pertence(n)) {
            int p = posicao(n);
            numeros[p] = numeros[qtdNumeros-1];
            qtdNumeros--;
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        for(int i = 0; i < qtdNumeros; i++) {
            System.out.printf("%.2f ", numeros[i]);
        }
        System.out.println(); //pular de linha
    }

    public int quantidade() {
        return qtdNumeros;
    }

    public float media() {
        if(qtdNumeros == 0) {
            return 0;
        }

        float soma = 0;
        for(int i = 0; i<qtdNumeros; i++) {
            soma += numeros[i];
        }

        return soma / qtdNumeros;

    }

    public float maior() {
        if(qtdNumeros == 0 ) {
            return 0;
        }

        float maior = numeros[0];
        for(int i = 1; i<qtdNumeros; i++) {
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public float menor() {
        if(qtdNumeros == 0 ) {
            return 0;
        }

        float menor = numeros[0];
        for(int i = 1; i<qtdNumeros; i++) {
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public ConjuntoDeReais uniao(ConjuntoDeReais outro) {
        ConjuntoDeReais c;

        c = new ConjuntoDeReais(this.numeros.length + outro.numeros.length);

        for(int i = 0; i<this.qtdNumeros; i++) {
            c.adicionar(this.numeros[i]);
        }

        for(int i = 0;i<outro.qtdNumeros; i++) {
            c.adicionar(outro.numeros[i]);
        }

        return c;
    }
}
