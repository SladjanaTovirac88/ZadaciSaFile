import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;

public class Zadatak8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Unesite ime od fajla!");
		String ime=input.nextLine();
		FileReader fr=new FileReader(ime);
		input.close();
	
		String red,noviRed;
		while(fr.read(red)!=null){
			for(int i=0;i<red.length();i++){
				if(red.charAt(i)!=' '){
					noviRed+=red.charAt(i);
				}
				System.out.println(noviRed);
			}
		}
	fr.close();
	
	
	
	}

}
