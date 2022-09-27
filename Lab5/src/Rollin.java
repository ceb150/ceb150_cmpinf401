import java.util.Scanner;
import java.util.Random;


public class Rollin {
	
	public static void RollDice(int freqs, Random outp) {
		int twoCounts=0;
		int threeCounts=0;
		int fourCounts=0;
		int fiveCounts=0;
		int sixCounts=0;
		int sevenCounts=0;
		int eightCounts=0;
		int nineCounts=0;
		int tenCounts=0;
		int elevenCounts=0;
		int twelveCounts=0;
		int i;
		for(i=freqs;i>0;i--) {
			int rolly = outp.nextInt(6) +1;
			int rollyToo = outp.nextInt(6)+1;
			int sum=rolly+rollyToo;
			if(sum==2) {
				twoCounts++;
			}
			else if(sum==3) {
				threeCounts++;
			}
			else if(sum==4) {
				fourCounts++;
			}
			else if(sum==5) {
				fiveCounts++;
			}
			else if(sum==6) {
				sixCounts++;
			}
			else if(sum==7) {
				sevenCounts++;
			}
			else if(sum==8) {
				eightCounts++;
			}
			else if(sum==9) {
				nineCounts++;
			}
			else if(sum==10) {
				tenCounts++;
			}
			else if(sum==11) {
				elevenCounts++;
			}
			else if(sum==12) {
				twelveCounts++;
			}
		}
		System.out.println("2: "+twoCounts+"/"+freqs+"\n3: "+threeCounts+"/"+freqs+"\n4: "+fourCounts+"/"+freqs+"\n5: "+fiveCounts+"/"+freqs+"\n6: "+sixCounts+"/"+freqs+"\n7: "+sevenCounts+"/"+freqs+"\n8: "+eightCounts+"/"+freqs+"\n9: "+nineCounts+"/"+freqs+"\n10: "+tenCounts+"/"+freqs+"\n11: "+elevenCounts+"/"+freqs+"\n12: "+twelveCounts+"/"+freqs);
		
		
		
	}

	public static void main(String[] args) {
		String cont="y";
		while(!cont.equalsIgnoreCase("n")) {
		Scanner inp = new Scanner(System.in);
		System.out.println("How many times do you want to roll?");
		
		String countS = inp.nextLine();
		int count=Integer.parseInt(countS);
		RollDice(count, new Random());
		
		Scanner inpC = new Scanner(System.in);
		System.out.println("Continue? y/n?");
		cont = inpC.nextLine();
		System.out.println("DONE");
		
	}
	}

}
