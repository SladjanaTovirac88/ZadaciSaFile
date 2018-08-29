import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Unesite ime filea!");
		String file=input.nextLine();
		FileReader fr=new FileReader(file);
		input.close();
		String red,rijec,najduza;
		while(fr.read(red)!=null){
			for(int i=0;i<red.length();i++){
				if(rijec.length()>najduza.length()){
					najduza=rijec;
					System.out.println(najduza);
				}
			}
		}
		fr.close();
	
	
	}

}
