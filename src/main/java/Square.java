public class Square extends Board {
    private String squareName;
    private int squareNumber;
    private static int compteur = 0;

    public Square()
    {
        if(compteur == 0)
        {
            this.squareName = "Go";
            compteur++;
        }
        else {
            squareNumber = compteur++;
            this.squareName = "Square " + squareNumber;
        }
    }

    public String getSquareName()
    {
        return squareName;
    }

    public int getSquareNumber()
    {
        return squareNumber;
    }

    public void setSquareName(String newName)
    {
        this.squareName = newName;
    }

    public void setSquareNumber(int newNumber)
    {
        this.squareNumber = newNumber;
    }

}

