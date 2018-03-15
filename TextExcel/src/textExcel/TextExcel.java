//Sena Hernandez
//March 13 2018
// 1st Perriod

package textExcel;

import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    Scanner input = new Scanner (System.in);
	    Spreadsheet grid = new Spreadsheet();
	    while (!(input.nextLine().toLowerCase().equals("quit"))){
	    	String command = input.nextLine();
	    	System.out.println(grid.processCommand(command));
	    // Add your command loop here
	}
	}
}
