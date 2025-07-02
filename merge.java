public class merge {
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
}
