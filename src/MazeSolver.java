import java.util.Objects;

public class MazeSolver {
    private int xPos;
    private int yPos;

    public void solveMaze(String[][]array) {
        xPos = 0;
        yPos = 0;
        boolean visited[][] = new boolean[array.length][array[0].length];
        System.out.println("(" + xPos + "," + yPos + ")");
        exploreMaze(array,visited);
      

    }
    private boolean exploreMaze(String[][]array,boolean[][]visited){
        while (xPos < array.length-1||yPos<array[0].length-1)
        {
            visited[xPos][yPos] = true;
            boolean moved = false;
            if (xPos+1<array.length && Objects.equals(array[xPos][yPos], array[xPos + 1][yPos]) && !visited[xPos+1][yPos]) {
                moved = true;
                xPos = xPos + 1;
            } else if (yPos+1<array[0].length && (Objects.equals(array[xPos][yPos], array[xPos][yPos + 1])) && !visited[xPos][yPos+1]) {
                moved = true;
                yPos = yPos + 1;
            } else if (xPos-1>=0 && (Objects.equals(array[xPos][yPos], array[xPos-1][yPos])) && !visited[xPos-1][yPos]) {
                moved = true;
                xPos = xPos - 1;
            } else if (yPos-1>=0 && (Objects.equals(array[xPos][yPos], array[xPos][yPos - 1])) && !visited[xPos][yPos-1]) {
                moved = true;
                yPos = yPos - 1;
            }


            if(moved){
                System.out.println("--->(" + xPos + "," + yPos + ")");
            }
    if(xPos == array.length-1 && yPos == array[0].length - 1){
            System.out.println("-->(" + xPos + "," + yPos + ")");
            return true;
        }
        return false;
    }







}
