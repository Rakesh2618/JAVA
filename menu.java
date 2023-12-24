package com.jspider.Cardekhocasestudy.menu;

import java.util.Scanner;

import com.jspider.Cardekhocasestudy.operations.operations;

public class menu 
{
  private static operations operation=new operations();
  private static boolean loop = true;
  public static void main(String[] args) 
  {
	while(loop)
	{
		menu();
		
	}
  }
private static void menu() 
{
	System.out.println("===========MENU==========\n" 
			+ "1. Add/Remove Car Details \n" 
			+ "2. Search Car Details \n"
			+ "3. Edit Car Details \n" 
			+ "4. Exit");
	Scanner obj=new Scanner(System.in);
	System.out.print("\nEnter your choice : ");
	int choice1 = obj.nextInt();
	switch (choice1) {
	case 1:
		System.out.println("===========MENU==========\n"
							+ "1. Add Car Details \n"
							+ "2. Remove Car Details \n"
							+ "3. Go Back To Main Menu");
		System.out.print("\nEnter your choice : ");
		int choice2 = obj.nextInt();
		switch (choice2) {
		case 1:
			operation.addCarDetails();
			break;

		case 2:
			operation.removeCarDetails();
			break;
			
		case 3:
			menu();
			break;
			
		default:
			System.out.println("\nInvalid choice. Try again..!!");
			break;
		}
		break;
	case 2:
		System.out.println("===========MENU==========\n"
							+ "1. Search Car By Name \n"
							+ "2. Search Car By Brand \n"
							+ "3. Search Car By Fuel Type \n"
							+ "4. Search All Cars \n"
							+ "5. Go Back To Main Menu");
		int choice3 = obj.nextInt();
		switch(choice3) {
		case 1:
			operation.searchByName();
			break;
		case 2:
			operation.searchByBrand();
			break;
		case 3:
			operation.searchByFuelType();
			break;
		case 4:
			operation.getAllCarDetails();
			break;
		case 5:
			menu();
			break;
		default:
			System.out.println("\nInvalid choice. Try again..!!");
			break;
		}
		break;
	case 3:
		operation.editCarDetails();
		break;
	case 4:
		System.out.println("Thank you..!!");
		loop = false;
		obj.close();
		break;

	default:
		System.out.println("\nInvalid choice. Try again..!!");
		break;
	}
}

	
	
}

  
  
