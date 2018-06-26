package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileReader fr;
Menu m = new Menu(0, null, 0, 0);

try {
	fr = new FileReader("menu.txt");
	BufferedReader in = new BufferedReader(fr);	
	String line = in.readLine();
	while (line !=null) {
		String[] token = line.split(",");
		int seq=Integer.parseInt(token[0]);
		String name=token[1];
		int price=Integer.parseInt(token[2]);
		int kcal=Integer.parseInt(token[3]);
		m.menu.add(new Menu(seq,name,price,kcal));
		m.on();
		
		line = in.readLine();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch(IOException e){
	e.printStackTrace();
}

	}
}

	