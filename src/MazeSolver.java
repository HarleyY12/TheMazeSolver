
public class MazeSolver {
    private int xPos;
    private int yPos;

    public void solveMaze(String[][]array) {
        xPos = 0;
        yPos = 0;
        System.out.println("(" + xPos + "," + yPos + ")--->");
        int totalCorrectPaths = 0;
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                if(array[i][j]=="."){
                    totalCorrectPaths = totalCorrectPaths + 1;
                }
            }
        }






        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[xPos][yPos] == array[xPos + 1][yPos]) {
                    xPos = xPos + 1;
                    System.out.println("(" + xPos + "," + yPos + ")--->");
                } else if ((array[xPos][yPos] == array[xPos][yPos + 1])) {
                    yPos = yPos + 1;
                    System.out.println("(" + xPos + "," + yPos + ")--->");
                }

            }


        }







    }
}
