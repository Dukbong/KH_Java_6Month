package com.jsh.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_TicTacToe {
	
	static String[] arrs = {"1","2","3","4","5","6","7","8","9"};
    static String[] arr = arrs.clone();
    
    public static void GameStart() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("Tic Tac Toe Game!");
            System.out.println();
            System.out.print("Do you want to play game? (AnyKey/N) >> ");
            arr = arrs.clone();
            String answer = br.readLine();

            if(answer.equalsIgnoreCase("N")) {
                System.out.println("Bye~");
                System.exit(0);
            }

            System.out.println();
            System.out.println("Player1 = O");
            System.out.println("Player2 = X");
            showTable();

            int count = 0;
            roop : while(count < 5) {
                count++;
                System.out.println();
                
                while(true){
                    System.out.print("Player 1 Enter the Number : ");
                    String player1 = br.readLine();
                    boolean player1Check = check(player1);
                    if(!player1Check) {
                        continue;
                    }
                    arr[Integer.parseInt(player1) - 1] = "O";
                    System.out.println();
                    showTable();
                    boolean win1 = winner(count);
                    if(win1){
                        break roop;
                    }
                    break;
                }
                
                while(true){
                    System.out.print("Player 2 Enter the Number : ");
                    String player2 = br.readLine();
                    boolean player2Check = check(player2);
                    if(!player2Check) {
                        continue;
                    }
                    arr[Integer.parseInt(player2) - 1] = "X";
                    System.out.println();
                    showTable();
                    boolean win2 = winner(count);
                    if(win2){
                        break roop;
                    }
                    
                    break;
                }
            }
            
        }

    }

    public static void showTable() {
        System.out.println("-------------------");
        for(int i = 0; i < 9; i = i + 3) {
            System.out.println("|  " + arr[i] + "  |  " + arr[i+1] + "  |  " + arr[i+2] + "  |");
            System.out.println("-------------------");
        }
    }

    public static boolean check(String str) {
        if(!(Arrays.asList(arr).contains(str)) || arr[Integer.parseInt(str) - 1].equals("O") || arr[Integer.parseInt(str) - 1].equals("X")) {
            System.out.println("Error!");
            return false;
        }
        return true;
    }

    public static boolean winner(int count) {
        for(int i = 0; i < 8; i++) {
            String win = "";

            switch(i) {
            case 0:
                win = arr[0]+arr[1]+arr[2];
                break;
            case 1:
                win = arr[3]+arr[4]+arr[5];
                break;
            case 2:
                win = arr[6]+arr[7]+arr[8];
                break;
            case 3:
                win = arr[0]+arr[3]+arr[6];
                break;
            case 4:
                win = arr[1]+arr[4]+arr[7];
                break;
            case 5:
                win = arr[2]+arr[5]+arr[8];
                break;
            case 6:
                win = arr[0]+arr[4]+arr[8];
                break;
            case 7:
                win = arr[2]+arr[4]+arr[6];
                break;
            }
            if(win.equals("XXX")) {
                System.out.println("Winner is Player2");
                System.out.println();
                return true;
                // System.exit(0);
            } else if(win.equals("OOO")) {
                System.out.println("Winner is Player1");
                System.out.println();
                return true;
                // System.exit(0);
            }
        }
        if(count == 5){
            System.out.println("Draw Game");
            return true;
        }
        return false;
    }
}

