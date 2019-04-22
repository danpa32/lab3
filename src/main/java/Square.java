public class Square extends Board {
    private String squareName;
    private int squareNumber;


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

