import java.util.Random;
import java.util.Scanner;

public class Mayin_Tarlasi {
        int rowNumber,colNumber,size;
        int [][] map;
        int[][] board;
        boolean game = true;

        Scanner s = new Scanner(System.in);
        Random r = new Random();

    Mayin_Tarlasi(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;

    }
    public void run() {
        int row, col=0,success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun Başladı !");
        while(game){
            print(board);
            System.out.print("Satır : " );
            row = s.nextInt();
            System.out.print("Sütun : " );

            if(row < 0  || row >= rowNumber){
                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            if(col < 0  || col >= colNumber){
                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            col = s.nextInt();
            if(map[row][col] != -1){
                checkMine(row,col);
                success++;
                if(success == (size - (size/4))){
                    System.out.println("Başardınız ! Hiç bir mayına basmadınız.");
                    break;
                }
            }else{
                game = false;
                System.out.println("GAME OVER");
            }

        }
    }
    public void checkMine(int r, int c){
        if(board[r][c] == 0){
            if((c < colNumber -1)&& (map[r][c +1] == -1)){
                board[r][c]++;
            }
            if((r < rowNumber-1) && (map[r+1][c] == -1)){
                board[r][c]++;
            }
            if((r > 0) && (map[r-1][c] == -1)){
                board[r][c]++;
            }
            if((c > 0) && (map[r][c - 1] == -1)){
                board[r][c]++;
            }
            if(board[r][c] == 0){
                board[r][c] = -2;            }
        }
        
    }
    public void prepareGame(){
        int randRow, randCol,count=0;
        while(count != (size/4)){
            randRow = r.nextInt(rowNumber);
            randCol = r.nextInt(colNumber);
            if(map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            
        }
    }
    }
    public void print(int[][]arr){ // Dışarıdan aldığı değeri belirtiyor olmam lazım.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
