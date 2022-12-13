import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	public static ArrayList<Entree> readEntree(String fileName){
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		String inputP="data\\entree.txt";
		
		try {
			FileReader fr = new FileReader(inputP);
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			while((line=br.readLine())!=null) {
				String[]temp = line.split("@@");
				String name=temp[0];
				String desc=temp[1];
				String calo=temp[2];
				int cal=Integer.parseInt(calo);
				new Entree(name,desc,cal);
				br.close();
				fr.close();
			}
		}
			catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		return entrees;
		}
	public static ArrayList<Salad> readSalad(String fileName){
		ArrayList<Salad> salads = new ArrayList<Salad>();
		String inputP="data\\salad.txt";
		
		try {
			FileReader fr = new FileReader(inputP);
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			while((line=br.readLine())!=null) {
				String[]temp = line.split("@@");
				String name=temp[0];
				String desc=temp[1];
				String calo=temp[2];
				int cal=Integer.parseInt(calo);
				new Salad(name,desc,cal);
				br.close();
				fr.close();
			}
		}
			catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		return salads;
	}
	public static ArrayList<Side> readSide(String fileName){
		ArrayList<Side> sides = new ArrayList<Side>();
		String inputP="data\\side.txt";
		
		try {
			FileReader fr = new FileReader(inputP);
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			while((line=br.readLine())!=null) {
				String[]temp = line.split("@@");
				String name=temp[0];
				String desc=temp[1];
				String calo=temp[2];
				int cal=Integer.parseInt(calo);
				new Side(name,desc,cal);
				br.close();
				fr.close();
			}
		}
			catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		return sides;
	}
	public static ArrayList<Dessert> readDessert(String fileName){
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		String inputP="data\\salad.txt";
		
		try {
			FileReader fr = new FileReader(inputP);
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			while((line=br.readLine())!=null) {
				String[]temp = line.split("@@");
				String name=temp[0];
				String desc=temp[1];
				String calo=temp[2];
				int cal=Integer.parseInt(calo);
				new Dessert(name,desc,cal);
				br.close();
				fr.close();
			}
		}
			catch (FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		return desserts;
	}
		}
	

