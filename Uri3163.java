import java.util.Scanner;
public class Uri3163{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String linha;
        int    filaAtual=0;
        FilaDoIsidro f_1, f_2, f_3, f_4;
        StringBuilder resultado = new StringBuilder();

        f_1 = new FilaDoIsidro();
        f_2 = new FilaDoIsidro();
        f_3 = new FilaDoIsidro();
        f_4 = new FilaDoIsidro();

        // parte 1: leitura - inserção dos aviões nas respectivas filas
        while (teclado.hasNext()){
            linha = teclado.nextLine();
            if (linha.equals("0")){
                break;
            }
            else if (linha.equals("-1")){
                filaAtual = -1;
            }
            else if (linha.equals("-2")){
                filaAtual = -2;
            }
            else if (linha.equals("-3")){
                filaAtual = -3;
            }
            else if (linha.equals("-4")){
                filaAtual = -4;
            }
            else{ // só pode ser código de avião
                if (filaAtual == -1){
                    f_1.inserir(linha);
                }
                else if (filaAtual == -2){
                    f_2.inserir(linha);
                }
                else if (filaAtual == -3){
                    f_3.inserir(linha);
                }
                else if (filaAtual == -4){
                    f_4.inserir(linha);
                }
            }
        }

        // agora é a hora de retirar das filas segundo o critério definido
        // Oeste - norte - sul - leste (-1, -3, -2, -4)
        while (! (f_1.isEmpty() && f_2.isEmpty() && f_3.isEmpty() && f_4.isEmpty()) ){
            if (!f_1.isEmpty()){
               resultado.append(f_1.retirar()+ " ");   
            }
            if (!f_3.isEmpty()){
                resultado.append(f_3.retirar() + " ");                
            }
            if (!f_2.isEmpty()){
                resultado.append(f_2.retirar() + " ");
            }
            if (!f_4.isEmpty()){
                resultado.append(f_4.retirar() + " ");
            }
        }
        System.out.println(resultado.toString().trim());
    }


    private static class FilaDoIsidro{
        private int inicio;
        private int fim;
        private int total;
        private String elementos[];
        public static final int TAMANHO=1000;

        public FilaDoIsidro(){
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
}



