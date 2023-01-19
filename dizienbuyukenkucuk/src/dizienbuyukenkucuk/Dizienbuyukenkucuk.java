
package dizienbuyukenkucuk;

import java.util.Scanner;

public class Dizienbuyukenkucuk {

    public static void main(String[] args) {
        Scanner k1 =new Scanner (System.in);
        int A[][]=new int [3][4];
        for (int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                A[i][j]=k1.nextInt();
        int enb=A[0][0];
        for (int i =0;i<3;i++){
            for(int j=0;j<4;j++){
                if (enb<A[i][j]){enb=A[i][j];}
                System.out.println(enb);
                
            }
        int sayac=0;
        for(int i =0;i<3;i++)
            for(int j=0;j<4;j++)
                if(A[i][j]==enb) sayac++;
            System.out.println(i+"inci satir"+j+"inci sutun");
        }
        
        }
    }
    
}
