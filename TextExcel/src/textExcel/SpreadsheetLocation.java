package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
   private int num;
   private char character;
   
    public int getRow()
    {
        return num-1;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return character;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	String letter=cellName.substring(0,1).toUpperCase();
    	character=letter.charAt(0);
    	num=Integer.parseInt(cellName.substring(1));
    
        // TODO: Fill this out with your own code
    }

}
