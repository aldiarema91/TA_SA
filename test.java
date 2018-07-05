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
    
	void printMap(int Map[][], int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + Map[i][j]
                                 + " ");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int sd=0;
        Scanner in = new Scanner(System.in);
        while (true) {            
            System.out.print("Map = ");
            sd = in.nextInt();
            if (sd>3) {
            	int Map[][] = new int[sd][sd];
                printMap(Map, sd);
                break;
            }
            System.out.println("Masukan lebih dari 3");
        }
    }
}
