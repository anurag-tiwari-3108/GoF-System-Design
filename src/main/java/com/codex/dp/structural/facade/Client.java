package com.codex.dp.structural.facade;

public class Client {
	
	public static void main(String [] args){
		
		String bookName = BookFacade.getInstance().getBookNameByAuthor("Anurag");
		
		System.out.println("Book by the author "+bookName);
	}

}
