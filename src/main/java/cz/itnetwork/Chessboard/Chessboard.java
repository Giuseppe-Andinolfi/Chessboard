package cz.itnetwork.Chessboard;
public class Chessboard {

    public static void main(String[] args) {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if ((i + j) % 2 == 0)
                    System.out.print("██");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }        
    }
    
}
