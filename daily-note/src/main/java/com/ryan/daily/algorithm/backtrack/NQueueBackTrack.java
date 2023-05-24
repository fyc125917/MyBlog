package com.ryan.daily.algorithm.backtrack;

/**
 * @ClassName NQueueBackTrack
 * @Description N皇后
 * 给你⼀个 N×N 的棋盘，让你放置 N 个皇后，使得它们不能互相攻击。
 * PS：皇后可以攻击同⼀⾏、同⼀列、左上左下右上右下四个⽅向的任意单位。
 * TODO 关键因素在于，如何判断当前节点是否安全，可放入，重点关注左上、右上的判断逻辑，结合 4*4 方格进行梳理
 * TODO 此代码没有进行已放置皇后，在后续无解时的回溯动作，是因为在每次放入当前列时，都会将当前列进行清空操作。
 * @Author fengyc
 * @Date 2023/5/4
 * @Version 1.0
 **/
public class NQueueBackTrack {
    //解的个数
    static int count = 0;
    //N阶棋盘
    static final int N = 4;
    //代表棋盘    1  代表不可放入   0 可放入
    static int[][] arr = new int[N][N];

    public static void main(String[] args) {
        nqueue(0);
    }

    private static void nqueue(int row) {
        if (row == N) {
            count++;
            System.out.println("第 " + count + " 个解");
            print(arr);
            return;
        }
        //遍历当前行的列
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                //放入前，将当前列进行置空操作，并将当前节点放入皇后
                for (int i = 0; i < N; i++) {
                    arr[row][i] = 0;
                }
                arr[row][col] = 1;
                nqueue(row + 1);
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        //当前棋子的上方  列固定，遍历行   如果存在为 1 则不可放入
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) {
                return false;
            }
        }
        //当前棋子左上方。 列-1   行-1 可固定当前棋子的左上方向，停止条件是  行列均>=0
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (arr[r][c] == 1) {
                return false;
            }
        }
        //当前棋子右上方，   行-1 列+1  固定棋子的右上方位置    停止条件是  行>=0  列 < N
        for (int r = row - 1, c = col + 1; r >= 0 && c < N; r--,c++) {
            if (arr[r][c] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println("========================");
    }


}
