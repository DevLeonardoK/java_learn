package LeetCode;

import java.util.*;

public class pascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;

        List<List<Integer>> resultado = new ArrayList<>();

        resultado.add(Arrays.asList(1));

        for(int i =1; i< rows; i++){
            List<Integer> anterior = resultado.get(i-1);
            List<Integer> atual = new ArrayList<>();
            atual.add(1);
            for(int j =0; j< anterior.size() -1; j++){
                atual.add(anterior.get(j) + anterior.get(j+1));
            }
            atual.add(1);
            resultado.add(atual);
        }

        return resultado;

    }
}
