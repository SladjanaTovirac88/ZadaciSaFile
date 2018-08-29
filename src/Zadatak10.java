import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class Zadatak10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		File file=new File("brojevi.txt");
		System.out.println("Broj cifara koje su ucitane:");
		int broj=input.nextInt();
		PrintWriter output=new java.io.PrintWriter("brojevi.txt");
		int [] brojevi=new int[broj];
		for(int i=0;i<brojevi.length;i++){
			brojevi[i]=(int)(Math.random()*100);
			output.println(brojevi[i]);
			FileReader fr=new FileReader("brojevi.txt");
			String red;
			while(fr.read(red)!=null){
				if(Integer.parseInt(red)%2!=0){
					System.out.println(Integer.parseInt(red));
				}
			}
		}
	output.close();
	
	}

}
