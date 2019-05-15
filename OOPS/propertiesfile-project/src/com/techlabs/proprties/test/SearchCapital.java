package com.techlabs.proprties.test;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.proprties.ReadFromPropertyFile;

public class SearchCapital {

	public static void main(String args[]) throws IOException {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the initial of any capital of state to search");
		String capital=scn.nextLine();
		ReadFromPropertyFile read=new ReadFromPropertyFile();
		read.readFromFile(capital);
	}

}
