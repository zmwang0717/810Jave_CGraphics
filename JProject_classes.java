package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

//JProject_classes

public class JProject extends JFrame{
	//private elements here
	
	//GUI part
	public JProject{}
	//Constructor of the frame
	
	class MenuListener implements ActionListener{}
	//The actionlistener reacts to the operation on Menu
	
	public void actionPerformed(ActionEvent e){}
	//React to the operations, like press buttons
	
	//Details reaction can be written separately in private methods
	
	JMenuBar getMenu(){}
	//Setup the MenuBar and Menu
	
	 void inputGrade(){}
	 //Method that put the grade
	 //Need to determine the kind of data structure used to store the grade
	 /*
	  Notice that categories of information we should include from a grade are:
	  Student Name/ID
	  Grade
	  possible maximum of grade(default can be 100)
	  category(which assignment it is?)
	  */
	 
	 public double mathMean(dataType[] g){}
	 //Return the Mean Value of given array.
	 //Data type TBD, might it be likedlist, array, or hashmap?
	 
	 public double mathMedian(dataType[] g){}
	 //Return the Median Value of given array.
	 
	 public double mathVariance(dataType[] g){}
	 //Return the Variance Value of given array.
	 
	 //Add more math methods if needed!
	 
	 public void drawingBackgroud(){}
	 //A common method that all drawing methods might call
	 
	 public void drawingLabel(){}
	 //A common method that all drawing methods might call
	 
	 public void drawingHistogramSingle(dataType[] g,String studentName){}
	 //Drawing line chart for a certain student's all assignments
	 
	 public void drawingHistogram(dataType[] g,String categoryName){}
	 //Drawing Histogram base on grades of all student on one category(one test or assignment or project)
	 
	 public void drawingHistogramAll(dataType[] g){}
	 //Drawing Histogram base on all grades of all student on all categories
	 
	 //Add more Drawing methods if needed!
	 
	 public static void main (String[] args) {}
	 //main function, create instances of objects here.
}


