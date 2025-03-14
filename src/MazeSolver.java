import java.util.Objects;

public class MazeSolver {
    private int xPos;
    private int yPos;

    public void solveMaze(String[][]array) {
        xPos = 0;
        yPos = 0;
        int totalCorrectPaths = 0;
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                if(Objects.equals(array[i][j], ".")){
                    totalCorrectPaths = totalCorrectPaths + 1;
                }
            }
        }
        System.out.println("Number of possible paths:" +totalCorrectPaths);
        System.out.print("(" + xPos + "," + yPos + ")--->");

        for(int i = 0;i<totalCorrectPaths;i++){
            int[][]passedPaths = new int[totalCorrectPaths][totalCorrectPaths];

            if ((Objects.equals(array[xPos][yPos], array[xPos + 1][yPos])) &&  passedPaths[i][i] != passedPaths[xPos+1][yPos] ){
                xPos = xPos + 1;
                passedPaths[i][i] = passedPaths[xPos][yPos];
                System.out.print("(" + xPos + "," + yPos + ")--->");
            } else if ((Objects.equals(array[xPos][yPos], array[xPos][yPos + 1]))  && passedPaths[i][i] != passedPaths[xPos][yPos+1]) {
                yPos = yPos + 1;
                passedPaths[i][i] = passedPaths[xPos][yPos];

                System.out.print("(" + xPos + "," + yPos + ")--->");
            }else if((Objects.equals(array[xPos][yPos], array[xPos-1][yPos]))  && passedPaths[i][i] != passedPaths[xPos-1][yPos]){
                yPos = yPos - 1;
                passedPaths[i][i] = passedPaths[xPos][yPos];

                System.out.print("(" + xPos + "," + yPos + ")--->");

            }else if((Objects.equals(array[xPos][yPos], array[xPos][yPos-1]))  && passedPaths[i][i] != passedPaths[xPos][yPos-1]){
                xPos = xPos - 1;
                passedPaths[i][i] = passedPaths[xPos][yPos];

                System.out.print("(" + xPos + "," + yPos + ")--->");




            }







        }
        System.out.println(totalCorrectPaths);
    }








}
