/*
46.Permutations
Given an array nums of distinct integers, return all the possible permutations.
You can return the answer in any order.

Yun-Chi Hsiao
Jul.29th.2021
 */

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private List<List<Integer>> finalList = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        List<Integer> list = new ArrayList<>();
        List<Integer> input = new ArrayList<>();

        for(int num : nums){
            input.add(num);
        }

        for(int i = 0; i < input.size(); i++){
            int num = input.get(i);
            list.add(num);
            input.remove(i);
            explore(input, list);
            list.remove(list.size() - 1);
            input.add(i, num);
        }

        return finalList;
    }

    private void explore(List<Integer> input, List<Integer> list) {
        if(input.size() == 0) {
            finalList.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < input.size(); i++) {
            int num = input.get(i);
            list.add(num);
            input.remove(i);
            explore(input, list);
            list.remove(list.size() - 1);
            input.add(i, num);
        }
    }
}
