/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.queen;

/**
 *
 * @author Aldi
 */
public class test {
    public static void main(String args[])
    {
        int N = 4;
        int[][] map = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map[i][j]+", ");
            }
            System.out.println("");
        }
    }
}
