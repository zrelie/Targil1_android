package com.example.elie.targil1;

public class GameBoard {
    public int board[][];

    public GameBoard (){
        board = new int[3][3];
        int i = 0;
        int j = 0;
        for(;i<3;i++)
            for(;j<3;j++)
                board[i][j] = -1;
    }

    public void one_move(String sell, int XorO) {
        int i = 0;
        int j = 0;
        if (sell.equals("L_U")) {
            i = 0;
            j = 0;
        }
        if (sell.equals("L_M")) {
            i = 1;
            j = 0;
        }
        if (sell.equals("L_D")) {
            i = 2;
            j = 0;
        }
        if (sell.equals("M_U")) {
            i = 0;
            j = 1;
        }
        if (sell.equals("L_M")) {
            i = 1;
            j = 1;
        }
        if (sell.equals("L_D")) {
            i = 2;
            j = 2;
        }
        if (sell.equals("R_U")) {
            i = 0;
            j = 2;
        }
        if (sell.equals("L_M")) {
            i = 1;
            j = 2;
        }
        if (sell.equals("L_D")) {
            i = 2;
            j = 2;
        }
        board[i][j] = XorO;
    }

    public String[] Check_who_won() {
        int i;
        int j;
        String arr_won[] = new String[4];
        String X = "X_Won";
        String O = "O_Won";
        String Draw = "Draw";

        for(i = 0; i < 3; i++)
            for(j = 0; j < 3; j++)
                if(board[i][j] == -1)
                    return  arr_won;

        if (board[1][1] == 1) {
            if (board[0][1] == 1 && board[2][1] == 1) {
                arr_won[0] = X;
                arr_won[1] = "M_M";
                arr_won[2] = "M_U";
                arr_won[3] = "M_D";
                return arr_won;
            } else if (board[1][0] == 1 && board[1][2] == 1) {
                arr_won[0] = X;
                arr_won[1] = "M_M";
                arr_won[2] = "L_M";
                arr_won[3] = "R_M";
                return arr_won;
            } else if (board[0][0] == 1 && board[2][2] == 1) {
                arr_won[0] = X;
                arr_won[1] = "M_M";
                arr_won[2] = "L_U";
                arr_won[3] = "R_D";
                return arr_won;
            } else if (board[0][2] == 1 && board[2][0] == 1) {
                arr_won[0] = X;
                arr_won[1] = "M_M";
                arr_won[2] = "R_U";
                arr_won[3] = "L_D";
                return arr_won;
            }
        }
       else if (board[0][0] == 1) {
            if (board[0][1] == 1 && board[0][2] == 1) {
                arr_won[0] = X;
                arr_won[1] = "L_U";
                arr_won[2] = "L_M";
                arr_won[3] = "L_D";
                return arr_won;
            } else if (board[1][0] == 1 && board[2][0] == 1) {
                arr_won[0] = X;
                arr_won[1] = "L_U";
                arr_won[2] = "M_U";
                arr_won[3] = "R_U";
                return arr_won;
            }
        }
        else if (board[2][2] == 1) {
            if (board[2][1] == 1 && board[2][0] == 1) {
                arr_won[0] = X;
                arr_won[1] = "R_D";
                arr_won[2] = "L_D";
                arr_won[3] = "M_D";
                return arr_won;
            } else if (board[1][2] == 1 && board[0][2] == 1) {
                arr_won[0] = X;
                arr_won[1] = "R_D";
                arr_won[2] = "R_M";
                arr_won[3] = "R_U";
                return arr_won;
            }
        }
        if (board[1][1] == 0) {
            if (board[0][1] == 0 && board[2][1] == 0) {
                arr_won[0] = O;
                arr_won[1] = "M_M";
                arr_won[2] = "M_U";
                arr_won[3] = "M_D";
                return arr_won;
            } else if (board[1][0] == 0 && board[1][2] == 0) {
                arr_won[0] = O;
                arr_won[1] = "M_M";
                arr_won[2] = "L_M";
                arr_won[3] = "R_M";
                return arr_won;
            } else if (board[0][0] == 0 && board[2][2] == 0) {
                arr_won[0] = O;
                arr_won[1] = "M_M";
                arr_won[2] = "L_U";
                arr_won[3] = "R_D";
                return arr_won;
            } else if (board[0][2] == 0 && board[2][0] == 0) {
                arr_won[0] = O;
                arr_won[1] = "M_M";
                arr_won[2] = "R_U";
                arr_won[3] = "L_D";
                return arr_won;
            }
        }
          else if (board[0][0] == 0) {
                if (board[0][1] == 0 && board[0][2] == 0) {
                  arr_won[0] = O;
                  arr_won[1] = "L_U";
                  arr_won[2] = "L_M";
                  arr_won[3] = "L_D";
                  return arr_won;
            }
                else if (board[1][0] == 0 && board[2][0] == 0) {
                  arr_won[0] = O;
                  arr_won[1] = "L_U";
                  arr_won[2] = "M_U";
                  arr_won[3] = "R_U";
                  return arr_won;
            }
        }
           else if (board[2][2] == 0) {
            if (board[2][1] == 0 && board[2][0] == 0) {
                arr_won[0] = O;
                arr_won[1] = "R_D";
                arr_won[2] = "L_D";
                arr_won[3] = "M_D";
                return arr_won;
            } else if (board[1][2] == 0 && board[0][2] == 0) {
                arr_won[0] = O;
                arr_won[1] = "R_D";
                arr_won[2] = "R_M";
                arr_won[3] = "R_U";
                return arr_won;
            }
        }

            arr_won[0] = Draw;
            return arr_won;



    }



}
