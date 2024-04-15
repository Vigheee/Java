package hellowordprogram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please enter your name");
		Scanner scanner=new Scanner(System.in);
		FetchName fetchName=new FetchName(scanner.next());
		System.out.println("Hello! "+ fetchName.getUserName());
	}

}
