import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		File file=new File("NewFile.txt");
		if(! file.exists()){
			file.createNewFile();
		}
		Scanner input=new Scanner("NewFile.txt");
		FileReader fr=new FileReader("NewFile.txt");
		
		String red;
		int karakter=0;
		int rijec=0;
		int brojRedova=0;
	
		while(fr.read(red)!=0){
			brojRedova++;
			karakter=karakter+red.length();
		for(int i=0;i<red.length();i++){
			if(red.charAt(i)==' ' && red.charAt(i)=='\n');
				rijec++;
		}
		rijec++;
		}
		System.out.println("Broj karaktera je:"+karakter);
		System.out.println("Boj rijeci je:"+rijec);
		System.out.println("Broj redova u tekstu je:"+brojRedova);
		
	
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
