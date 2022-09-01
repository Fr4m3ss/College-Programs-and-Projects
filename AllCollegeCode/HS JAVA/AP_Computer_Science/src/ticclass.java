//Frankie Messina

public class ticclass {
	
public void printBoard()
{
	System.out.println("  (0,0)  |  (0,1)  |  (0,2)   ");
	System.out.println("------------------------------");
	System.out.println("  (1,0)  |  (1,1)  |  (1,2)   ");
	System.out.println("------------------------------");
	System.out.println("  (2,0)  |  (2,1)  |  (2,2)   ");
}
public void setSpot1(int x, int y, String[][] b)
{
	b[x][y] = "O";
}

public void setSpot2(int x, int y, String[][] b)
{
	b[x][y] = "X";
}

public boolean determineWinner1(String[][]b)
{
	if(b[0][0].equals("O")&& b[1][0].equals("O") && b[2][0].equals("O"))
            return true;
        else if (b[0][1].equals("O") && b[1][1].equals("O") && b[2][1].equals("O")) 
            return true; 
        else if (b[0][2].equals("O") && b[1][2].equals("O") &&b[2][2].equals("O")) //columns
            return true;
        else if (b[0][0].equals("O")&& b[0][1].equals("O") && b[0][2].equals("O"))
            return true;
        else if (b[1][0].equals("O") && b[1][1].equals("O") && b[1][2].equals("O")) 
            return true;
        else if (b[2][0].equals("O") && b[2][1].equals("O") &&b[2][2].equals("O")) //rows
            return true;
        else if (b[0][0].equals("O") && b[1][1].equals("O") && b[2][2].equals("O")) 
            return true;
        else if (b[0][2].equals("O") && b[1][1].equals("O") &&b[2][0].equals("O"))//diag
            return true;
	return false;
}
	
public boolean determineWinner2(String[][]b)
{
	if(b[0][0].equals("X")&& b[1][0].equals("X") && b[2][0].equals("X"))
        return true;
    else if (b[0][1].equals("X") && b[1][1].equals("X") && b[2][1].equals("X")) 
        return true; 
    else if (b[0][2].equals("X") && b[1][2].equals("X") &&b[2][2].equals("X")) //columns
        return true;
    else if (b[0][0].equals("X")&& b[0][1].equals("X") && b[0][2].equals("X"))
        return true;
    else if (b[1][0].equals("X") && b[1][1].equals("X") && b[1][2].equals("X")) 
        return true;
    else if (b[2][0].equals("X") && b[2][1].equals("X") &&b[2][2].equals("X")) //rows
        return true;
    else if (b[0][0].equals("X") && b[1][1].equals("X") && b[2][2].equals("X")) 
        return true;
    else if (b[0][2].equals("X") && b[1][1].equals("X") &&b[2][0].equals("X"))//diag
        return true;
return false;
}

public boolean isBoardFull(String[][]b)
{
	for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (b[i][j].equals("")) 
                return false;
       
    return true;
}


}
