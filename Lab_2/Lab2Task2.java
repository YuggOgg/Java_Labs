public class Lab2Task2 {
    public static void main(String[] args){
        int xCoord = 3, yCoord = -2;
        System.out.println(DetermineQuadrant(xCoord, yCoord));
    }

    private static int DetermineQuadrant(int x, int y){
        if (x > 0 && y > 0){ return 1; }
        if (x < 0 && y > 0){ return 2; }
        if (x < 0 && y < 0){ return 3; }
        if (x > 0 && y < 0){ return 4; }
        else { return 0; }
    }
}
