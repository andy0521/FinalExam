package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	int seq;
	String name;
	int price;
	int kcal;
	List<Menu>menu=new ArrayList<>();
	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}
public Menu(int seq ,String name ,int price ,int kcal){
	super();
	this.kcal=kcal;
	this.name=name;
	this.price=price;
	this.seq=seq;
	
}
	public void on(){
	
	for(int j=0;j<=menu.size();j++)
		
		for (int i=0;i<=menu.size();i++){
			Menu m =menu.get(seq);
			seq++;
			System.out.println(m.getSeq()+")"+m.getName());
			break;
		}

	}
	 
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
}
