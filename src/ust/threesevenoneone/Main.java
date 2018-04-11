package ust.threesevenoneone;

import java.util.Arrays;

public class Main {

    static boolean win[][];

    public static void main(String[] args) {

        final int x = 3 , y = 2;
        win = new boolean[x+1][y+1];

        for (int i=0 ; i<=x ; i++){
            for (int j=0 ; j<=y ; j++){
                  if (i == 0 && j==0){
                      win[i][j] = false;
                  }
                  if (i>0){
                      if (j>1){
                          win[i][j] = !win[i][j-2] || !win[i][j-1] || !win[i-1][j];
                      } if (j>0) {
                          win[i][j] = !win[i][j-1] || !win[i-1][j];
                      } else {
                          win[i][j] = !win[i-1][j];
                      }
                  } else {
                      if (j>1) {
                          win[i][j] = !win[i][j-2] || !win[i][j-1];
                      } else if (j>0) {
                          win[i][j] = !win[i][j-1];
                      }
                  }
            }
        }
        System.out.println(win[0][2]);
    }
}
