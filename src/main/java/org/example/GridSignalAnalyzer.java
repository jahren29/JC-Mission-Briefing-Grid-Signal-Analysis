package org.example;

public class GridSignalAnalyzer {

    // Mission Data: The Scrambled Communications Grid
    // initialization of variable
    char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    // For loop
    public void analyzeWithForLoop(){
        for(int i = 0; i < scrambledGrid.length; i++){
            for(int j = 0; j < scrambledGrid[i].length; j++){
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // For Each
    public void analyzeWithForEach(){
        for (char[] rowArray: scrambledGrid){
            System.out.println("Processing Row with Hash: " + rowArray);
            for (char c: rowArray){
                System.out.println("-> " + c);
            }
        }
    }

    // Hybrid For Each and For Loop
    public  void analyzeWithHybridLoop(){
        for(char[] rowArray: scrambledGrid){
            for(int i = 0; i < rowArray.length; i++){
                System.out.print(rowArray[i]);
            }
            System.out.println();
        }
    }

}
