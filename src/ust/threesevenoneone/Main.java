package ust.threesevenoneone;

import java.util.Arrays;

public class Main {

    //static boolean win[][];
	static boolean win[][][][];

    public static void main(String[] args) {

	    /*
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
		*/
		final int x = 4 , y = 4 , z = 2 , a = 2;
        win = new boolean[x+1][y+1][z+1][a+1];

        for (int i=0 ; i<=x ; i++){
            for (int j=0 ; j<=y ; j++){
                for (int k=0 ; k<=z ; k++){
                    for (int l=0 ; l<=a ; l++) {
                        if (i == 0 && j == 0  && k == 0  && l == 0) {
                            win[i][j][k][l] = false;
                        }
                        for (int t = 1; t < 2; t++) {
                            if (i - t >= 0) {
                                if (!win[i - t][j][k][l]) {
                                    win[i][j][k][l] = true;
                                }
                            }
                        }
                        for (int t = 1; t < 3; t++) {
                            if (j - t >= 0) {
                                if (!win[i][j - t][k][l]) {
                                    win[i][j][k][l] = true;
                                }
                            }
                        }
                        for (int t = 1; t < 4; t++) {
                            if (k - t >= 0) {
                                if (!win[i][j][k- t][l]) {
                                    win[i][j][k][l] = true;
                                }
                            }
                        }
                        for (int t = 1; t < 5; t++) {
                            if (l - t >= 0) {
                                if (!win[i][j][k][l- t]) {
                                    win[i][j][k][l] = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i=0 ; i<=x ; i++) {
            for (int j = 0; j <= y; j++) {
                for (int k = 0; k <= z; k++) {
                    for (int l = 0; l <= a; l++) {
                       System.out.print("["+i+"]["+j+"]["+k+"]["+l+"]->"+win[i][j][k][l]+" , ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
