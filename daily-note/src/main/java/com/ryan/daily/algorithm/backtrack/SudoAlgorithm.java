package com.ryan.daily.algorithm.backtrack;

/**
 * @ClassName SudoAlgorithm
 * @Description 数独求解
 * @Author fengyc
 * @Date 2023/5/4
 * @Version 1.0
 **/
public class SudoAlgorithm {
    //待求解数独
    static int[][] board1 = new int[][]{
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}};

    public static void main(String[] args) {

        //待求解数独
        int[][] board = new int[][]{
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}};
        //横向进行填充，数组下表从0开始，如果当row为9时，则表示已经填充完毕
        resolve(board, 0, 0);
    }

    private static void resolve(int[][] board, int row, int col) {
        if (row == 9) {
            print(board1);
            print(board);
            return;
        }
        if (board[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isValid(board, row, col, i)) {
                    board[row][col] = i;
                    next(board, row, col);
                    board[row][col] = 0;
                }
            }
        } else {
            next(board, row, col);
        }
    }

    private static void next(int[][] board, int row, int col) {
        if (col + 1 == 9) {
            resolve(board, row + 1, 0);
        } else {
            resolve(board, row, col + 1);
        }
    }

    private static boolean isValid(int[][] board, int row, int col, int val) {
        //判断行是否满足
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == val) {
                return false;
            }
        }
        //判断列是否满足
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == val) {
                return false;
            }
        }
        //判断当前九宫格是否满足
        for (int r = row / 3 * 3, x = r; x < r + 3; x++) {
            for (int c = col / 3 * 3, y = c; y < c + 3; y++) {
                if (board[x][y] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void print(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("============================");
    }


}
