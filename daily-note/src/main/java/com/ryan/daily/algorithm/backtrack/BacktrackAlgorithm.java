package com.ryan.daily.algorithm.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName BacktrackAlgorithm
 * @Description 回溯算法
 * @Author fengyc
 * @Date 2023/5/4
 * @Version 1.0
 **/
public class BacktrackAlgorithm {

    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] init = {1, 2, 3};
        permute(init);
        for (List<Integer> integers : result) {
            System.out.println(integers.toString());
        }
    }

    static List<List<Integer>> permute(int[] args) {
        //存放路径
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(args,track);
        return result;
    }
    //路径记录在track中
    //选择列表：原始数组列表中，尚未出现在track中的元素
    //结束条件：原始数组中的所有元素，都出现在track中
    static void backtrack(int[] args, LinkedList<Integer> track) {
        //如果所有路径都走过，即路径长度和原始数组长度一致，则为一条完整的路径
        if (args.length == track.size()) {
            //将完整的路径加入结果集中
            result.add(new LinkedList<>(track));
            return;
        }
        for (int arg : args) {
            //如果路径中已经走过该节点，则忽略
            if (track.contains(arg)) {
                continue;
            }
            //如果路径中没有走过该节点，则加入
            track.add(arg);
            //递归调用，遍历原始数组，寻找下一个未走过的节点。
            backtrack(args, track);
            //遍历完成，移除最后一个节点，回退一步，再寻找下一条路径
            track.removeLast();
        }
    }
}
