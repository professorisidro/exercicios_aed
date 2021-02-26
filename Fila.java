public class Fila{
    private int inicio;
    private int fim;
    private int total;
    private String elementos[];
    public static final int TAMANHO=100;

    public Fila(){
        inicio = 0;
        fim    = 0;
        total  = 0;
        elementos = new String[TAMANHO];
    }

    public boolean isEmpty(){
        return (total == 0);
    }
    public boolean isFull(){
        return (total == TAMANHO);
    }
    public void inserir(String ele){
        elementos[fim] = ele;
        fim = (fim + 1)%TAMANHO;
        total++;
    }
    public String retirar(){
        String elemento = elementos[inicio];
        inicio = (inicio + 1)%TAMANHO;
        total--;
        return elemento;
    }

}