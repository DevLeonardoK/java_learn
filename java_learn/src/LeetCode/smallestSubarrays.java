//package LeetCode;
//
//import java.util.*;
//
//public class smallestSubarrays{
//    public static void main(String[] args) {
//        //System.out.println(Integer.toBinaryString(1));
//        System.out.println(Integer.parseInt(Integer.toBinaryString(2)) | Integer.parseInt(Integer.toBinaryString(4)));
//    }
//}

package LeetCode;

import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int[] smallestSubarrays(int[] nums) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> saida = new ArrayList<>();
        int count= 0;
        int contador = 1;
        lista = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] max = new int[nums.length];

        int acc = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            acc |= nums[i];
            max[i] = acc;
        }

        for (int r =0; r< nums.length; r++){
            count=0;
            contador =0;



            for (int j=r; j< nums.length; j++){
                count |= nums[j];

                contador++;
                if (count == max[r]){
                    saida.add(contador);
                    break;
                }


            }


        }


        return saida.stream().mapToInt(i->i).toArray();
    }
}