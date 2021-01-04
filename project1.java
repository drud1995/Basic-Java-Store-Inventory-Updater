/* Name: Daniel Rudzik
Course: CNT 4714 – Spring 2020
Assignment title: Project 1 – Event-driven Enterprise Simulation
Date: Sunday January 26, 2020
*/


import java.io.*;
import javax.swing.*;
import java.awt.*;

public class project1 extends JFrame
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		File file = new File("C:\\Users\\drud1\\Documents\\CNT4714 Project 1\\inventory.txt"); 
		  
		BufferedReader b_reader = new BufferedReader(new FileReader(file)); 
		
		int counter = 0;
		
		String line_buffer; 
		
		while ((line_buffer = b_reader.readLine()) != null) 
			 counter++;
		
		b_reader.close();
		
		BufferedReader b_reader_2 = new BufferedReader(new FileReader(file)); 
		
		books_available books[] = new books_available[counter];
		
		String[] temp_store = new String[3];
		
		int counter_2 = 0;
		
		while ((line_buffer = b_reader_2.readLine()) != null) 
		{
			 System.out.println(line_buffer); 
			 
			 temp_store = line_buffer.split(",");
			 
			// for(int i = 0; i < 3; i++)
			//	 System.out.println(temp_store[i]);
			
			 books[counter_2] = new books_available();
			 
			 books[counter_2].ID = Integer.parseInt(temp_store[0]);
			 books[counter_2].bookname = temp_store[1];
			 books[counter_2].price = Double.parseDouble(temp_store[2]);
			 
			 /*
			 System.out.println(books[counter_2].ID);
			 System.out.println(books[counter_2].bookname);
			 System.out.println(books[counter_2].price);
			 */
			 
			 
			 temp_store = new String[temp_store.length];
			 
			 counter_2++;
		}
		
		b_reader_2.close();
		
		
		for(int i = 0; i < counter; i++)
		{
			System.out.println(books[i].ID);
			System.out.println(books[i].bookname);
			System.out.println(books[i].price);
		}
		
		
		JFrame store_frame = new JFrame("Ye Olde Book Shoppe - Spring 2020");
		//store_frame.setLayout(new GridLayout);
		store_frame.getContentPane().setBackground(Color.BLACK);
	    store_frame.setSize(1400,800);
	    store_frame.setVisible(true);
	    store_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	

}

