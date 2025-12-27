package LeetCode;
import java.util.*;

class maximumHappinessSum {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        Integer tamanhoList = happiness.length;
        Long soma = 0L;
        Integer valor = 0;
        for (int r = 0; r < k; r++) {
            valor = happiness[tamanhoList - r - 1] - r;
            if (valor <= 0) {
                break;
            }
            ;
            soma += valor;
        }
        return soma;
    }
}


//queue
//Criancas = happines
//k - quantidade de crianças selecionadas
//etapas
// - Selecionou primeiro
// - Subtrai 1 de todos os restantes
// - Seleciona o maior
// - Soma o primeiro com o segundo selecionado
//assim vai


