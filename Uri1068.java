import java.util.Scanner;
public class Uri1068{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        PilhaDoIsidro p;
        String expr;        
        boolean correct;

        while ( teclado.hasNext() ) {
            correct = true;
            p = new PilhaDoIsidro();
            expr = teclado.nextLine();
            for (int pos=0; pos < expr.length() && correct; pos++){
                if (expr.charAt(pos) == '('){
                    p.push(expr.charAt(pos));
                }
                else if (expr.charAt(pos) == ')'){
                    if (p.isEmpty()){
                        correct = false;
                    }
                    else{
                        char x = p.pop();
                    }
                }
            }
            if (p.isEmpty() && correct){
                System.out.println("correct");
            }
            else{
                System.out.println("incorrect");
            }
        }
    }

    /* vou criar uma classe Pilha pra poder funfar */
    private static class PilhaDoIsidro{
        private int topo;
        private char elementos[];

        public PilhaDoIsidro(){
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
    
}