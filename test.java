package nqueens;

import java.util.Scanner;

public class NQueens
{
    
    
    public static void main(String args[])
    {
        int sd=0;
        Scanner in = new Scanner(System.in);
        while (true) {            
            System.out.print("Map = ");
            sd = in.nextInt();
            if (sd>3) {
                int Map[][] = new int[sd][sd];
                Map[0][0] = 1;
                
                
                for (int i = 0; i < sd; i++){
                    for (int j = 0; j < sd; j++){
                        //cek kesamping
                        for (int k = 0; k < j; k++) {
                            if (Map[k][i]==1) {
                                System.out.print("a");
                            }
                        }
                        //cek kolom
                        for (int k = 0; k < i; k++) {
                            if (Map[k][j]==1) {
                                System.out.print("a");
                            }
                        }
                        //cek miring
                        for (int a=i, b=j; a>=0 && b>=0; a--, b--){
                            if (Map[a][b]==1) {
                                System.out.print("a");
                            }
                        }
                        System.out.print(" " + Map[i][j]+ " ");
                    }
                    System.out.println();
                }
                break;
            }
            System.out.println("Masukan lebih dari 3");
        }
    }
    void printMap(int N, int mape[][])
    {
        
    }
}

