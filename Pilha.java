public class Pilha{
    private int topo;
    private char elementos[];

    public Pilha(){
        this.topo = -1;
        elementos = new char[1000];
    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public void push(char e){
        topo++;
        elementos[topo] = e;
    }

    public char pop(){
        char ele = elementos[topo];
        topo--;
        return ele;
    }
}