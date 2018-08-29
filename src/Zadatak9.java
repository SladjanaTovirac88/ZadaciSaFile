import java.io.FileReader;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class Zadatak9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Unesite ime fajla!");
		String file=input.nextLine();
		FileReader fr=new FileReader(file);
		input.close();
		
		String red,noviRed;
		while(fr.read(red)=!0){
			char c=' ';
			char a=red.charAt(c+1);
			char b=(char)(a-32);
			noviRed=noviRed+b;
	
			for(int i=0;i<red.length();i++){
				if(red.charAt(i)==' '){
					i++;
				a=red.charAt(i);
				b=(char)(a-32);
				noviRed=noviRed+b;
				
				}
			System.out.println(noviRed);
			}
	
	fr.close();
	
	
	
	
	}
	}
}
