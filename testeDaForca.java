import java.util.Scanner;

public class testeDaForca {
    
    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int[] lerForcas(int qntPontosForca){
        int[] forcasCandidatos = new int[qntPontosForca];

        for (int i = 0; i < forcasCandidatos.length; i++) {
            forcasCandidatos[i] = tecladoScanner.nextInt();
        }

        return forcasCandidatos;
    }

    public static void ordenarForcas(int[] forcasCandidatos, int inicio, int fim){
        int meio = 0;

        if (inicio < fim - 1) {
             meio = (inicio + fim) / 2;
             ordenarForcas(forcasCandidatos, inicio, meio);
             ordenarForcas(forcasCandidatos, meio, fim);
            doMerge(forcasCandidatos, inicio, meio, fim);
        }
    }

    public static void doMerge(int[] forcasCandidatos, int inicio, int meio, int fim){
        int i = inicio, j = meio, k = 0;

        int[] vetorAux = new int[fim - inicio];

        while (i < meio && j < fim) {
            if (forcasCandidatos[i] <= forcasCandidatos[j]) {
                vetorAux[k++] = forcasCandidatos[i++];
            } else{
                vetorAux[k++] = forcasCandidatos[j++];
            }
        }

        while (i < meio) {
            vetorAux[k++] = forcasCandidatos[i++];
        }

        while (j < fim) {
            vetorAux[k++] = forcasCandidatos[j++];
        }

        for (int l = inicio; l < fim; ++l) {
            forcasCandidatos[i] = vetorAux[l - inicio];
        }

    }

    public static int calcularSomaDosMaiores(int[] forcasCandidatos, int qntCandidatosAceitos){
        int soma = 0;
        
        for (int i = forcasCandidatos.length - qntCandidatosAceitos; i <= forcasCandidatos.length; i++) {
            soma += forcasCandidatos[i];
        }

        return soma;
    }

    public static void mensagem(int somaDasMaioresForcas){
        System.out.println(somaDasMaioresForcas);
    }
    
    public static void main(String[] args) {
        while (tecladoScanner.hasNext()) {
            int qntPontosForca = tecladoScanner.nextInt();
            int qntCandidatosAceitos = tecladoScanner.nextInt();
            int[] forcasCandidatos = lerForcas(qntPontosForca);
            int inicio = 0;
            int fim = forcasCandidatos.length;
            ordenarForcas(forcasCandidatos, inicio, fim);

            int somaDasMaioresForcas = calcularSomaDosMaiores(forcasCandidatos, qntCandidatosAceitos);

            mensagem(somaDasMaioresForcas);
            
        }
    }
}
