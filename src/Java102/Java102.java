package Java102;
import java.util.Scanner;
public class Java102 {
public static void main(String[] args) {
	double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
	Scanner input = new Scanner(System.in);
	System.out.print("Ücret tutarını girin:");
	tutar = input.nextDouble();
	kdvTutar = tutar + kdvOran;
	kdvliTutar = tutar + kdvTutar;
	
	System.out.println("Kdvsiz tutar:" +tutar);
	System.out.println("Kdv oranı:" +kdvOran);
	System.out.println("Kdv tutar:" +kdvTutar);
	System.out.println("Kdvli tutar:" +kdvliTutar);


}

}