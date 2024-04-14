package hellowordprogram;

import java.lang.System.Logger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please! enter your Name");
		FetchName fetchName=new FetchName(null);
		Scanner scanner=new Scanner(System.in);
		fetchName.setName(scanner.next());
		System.out.println("Hello! "+fetchName.getName());
	}

}
