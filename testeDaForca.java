import java.util.Scanner;

public class testeDaForca {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int[] lerForcas(int qntPontosForca) {
        int[] forcasCandidatos = new int[qntPontosForca];

        for (int i = 0; i < forcasCandidatos.length; i++) {
            forcasCandidatos[i] = tecladoScanner.nextInt();
        }

        return forcasCandidatos;
    }

    public static void ordenarForcas(int[] forcasCandidatos) {
        int ajuda = 0;

        for (int i = 0; i < forcasCandidatos.length; i++) {
            for (int j = i; j < forcasCandidatos.length; j++) {
                if (forcasCandidatos[j] > forcasCandidatos[i]) {
                    ajuda = forcasCandidatos[j];
                    forcasCandidatos[j] = forcasCandidatos[i];
                    forcasCandidatos[i] = ajuda;
                }
            }
        }

    }

    public static int calcularSomaDosMaiores(int[] forcasCandidatos, int qntCandidatosAceitos) {
        int soma = 0;

        for (int i = 0; i < qntCandidatosAceitos; i++) {
            soma += forcasCandidatos[i];
        }

        return soma;
    }

    public static void mensagem(int somaDasMaioresForcas) {
        System.out.println(somaDasMaioresForcas);
    }

    public static void main(String[] args) {
        while (tecladoScanner.hasNext()) {
            int qntPontosForca = tecladoScanner.nextInt();
            int qntCandidatosAceitos = tecladoScanner.nextInt();
            int[] forcasCandidatos = lerForcas(qntPontosForca);
            ordenarForcas(forcasCandidatos);

            int somaDasMaioresForcas = calcularSomaDosMaiores(forcasCandidatos, qntCandidatosAceitos);

            mensagem(somaDasMaioresForcas);

        }
    }
}
