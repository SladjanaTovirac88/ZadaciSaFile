import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Zadatak4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ArrayList<String>ListOfStrings=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite ime filea!");
		String file=input.nextLine();
		FileReader fr=new FileReader(file);
		input.close();
		String red,rijec;
		while(fr.read(red)!=null){
			for(int i=0;i<ListOfStrings.size();i++){
				if(red.charAt(i)!=' '){
					rijec=rijec+red.charAt(i);
				}
			}
			for(int i=ListOfStrings.size()-1;i>=0;i++){
				System.out.println(ListOfStrings.get(i)+" ");
			}
		}
		fr.close();
	
	
	}

}
