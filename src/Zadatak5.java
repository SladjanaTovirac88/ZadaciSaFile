import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite ime fajla!");
		String file=input.nextLine();
		FileReader fr=new FileReader(file);
		input.close();
		
		String red,noviRed;
		while(fr.read(red)!=null){
				if(red.length()<55){
					System.out.println(red);
				}
				else if(red.length()>=55){
					for(int i=0;i<40;i++){
						noviRed=noviRed+red.charAt(i);
					System.out.println(noviRed+"...<Read More>");	
					}
				}
		fr.close();
		
		

	}

	}
}
