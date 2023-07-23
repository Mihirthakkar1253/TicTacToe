package com.mihir.Greedy;
import java.util.*;

public class TicTacToe_Game {
    public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
           boolean gameOver=false;
           String player="0";
           String[][]board=new String[3][3];
           for(int i=0;i<board.length;i++){
               for(int j=0;j<board[0].length;j++){
                   board[i][j]=" ";
               }

           }
           while(!gameOver){
               int a=sc.nextInt();
               int b=sc.nextInt();
               if(board[a][b]!=" "){
                   System.out.println("enter valid input");
                   continue;
               }
              board[a][b]=player;
               for(int i=0;i<board.length;i++){
                   for(int j=0;j<board[0].length;j++){
                       System.out.print(board[i][j]+" | ");

                   }
                   System.out.println();


               }
               if(player.equals("0")){
                  gameOver= hasWin(player,board,a,b);

                  if(gameOver){

                      System.out.println("player 0 is win");
                  }
                  player="X";
               }
               else if(player.equals("X")){
                   gameOver= hasWin(player,board,a,b);
                   if(gameOver){

                       System.out.println("player X is win");
                   }
                   player="0";
               }

           }
    }
    public static boolean hasWin(String s,String[][]board,int a,int b){
        boolean ans=true;
        for(int i=0;i<board.length;i++){
            if(board[a][i]!=s){
                ans=false;
            }
        }
        if(ans){
            return true;
        }
        ans=true;
        for(int i=0;i<board.length;i++){
            if(board[i][b]!=s){
             ans= false;
            }
        }
        if(ans){
            return true;
        }

        ans=true;
            int i=0;
            int j=0;
            while(i<board.length&&j<board[0].length){
                if(board[i][j]!=s){
                    ans= false;
                }
                i++;
                j++;
            }
        if(ans){
            return true;
        }
        ans=true;
        i=0;
        j=board[0].length-1;
        while(j>=0&&i<board.length){
           if( board[i][j]!=s){
               ans= false;
           }
            i++;
            j--;
        }
        if(!ans){
            return false;
        }
            return true;
    }

}
