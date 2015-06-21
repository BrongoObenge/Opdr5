package nl.company.controller;

public class SomeBaseClass {
	String console;
	
	public void print(String text){
		console += text+"\n";
		System.out.println(text);
	}
}
