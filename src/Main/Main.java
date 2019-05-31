package Main;

import java.util.Scanner;

import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class  Main  implements IArtist, IChef, IDriver, IWorker{
	int input = -1 ;
	String choice;
	Scanner scan = new Scanner (System.in);
	public Main() {
		// TODO Auto-generated constructor stub
	System.out.println("Simulasi kelompok kemampuan\n");
	System.out.println("0:Gordon Ramsay\n");
	System.out.println("1:Hamilton\n");
	System.out.println("2:Leornado\n");
	System.out.println("3:Michael Scott\n");
	System.out.println("4:Toby\n");
	System.out.println("5:Tony Stark\n");
	System.out.println("Input number : ");
	input = scan.nextInt();scan.nextLine();
	
	if(input == 0) {
		
		System.out.println("Gordon Ramsay\n");
		System.out.println("choice(info/paint/cook/drive/work): ");
		choice = scan.nextLine();
		if(choice == "info") {
			System.out.println("Bertanggung jawab menciptakan dan menyusun menu, menentukan harga makanan,");
		}
	else if(choice == "cook") {
		System.out.println("Bertanggung jawab menciptakan dan menyusun menu, menentukan harga makanan,");
		
	} else {
		System.out.println("Pesan Error tidak ada implementasi selain cook &info");
	}
   }
	else if(input == 1) {
		System.out.println("Hamilton\n");
		System.out.println("choice(info/paint/cook/drive/work): ");
		choice = scan.nextLine();
		if(choice == "info") {
			System.out.println("\"Seorang yang mengendarai kendaraan dan bekerja\",");
		}
	else if(choice == "drive") {
		System.out.println(" Seorang yang mengendarai kendaraan ");
		
			}else if(choice == "work") {
				System.out.println(" Seorang yang bekerja");
			}  
	
	else {
		System.out.println("Pesan Error tidak ada implementasi selain drive, info , & work");
	}
	}
	
	else if (input == 2){
		System.out.println("Leornado\n");
		System.out.println("choice(info/paint/cook/drive/work): ");
		choice = scan.nextLine();
		if(choice == "paint") {
			System.out.println("Seorang yang Menggambar lukisan");
		}
	
	else {
		System.out.println("Pesan Error tidak ada implementasi selain drive, info , & work");
	}
	 }
	
	else if(input == 3) {
		System.out.println("Michael Scott\n");
		System.out.println("choice(info/paint/cook/drive/work): ");
		choice = scan.nextLine();
		if(choice == "info") {
			System.out.println("Seorang yang mengendarai kendaraan, bekerja & melukis");
		}
	else if(choice == "drive") {
		System.out.println(" Seorang yang mengendarai kendaraan ");
		
			}else if(choice == "work") {
				System.out.println(" Seorang yang bekerja");
			}
			else if(choice == "paint") {
				System.out.println(" Seorang yang melukis");
			}
	
	else {
		  System.out.println("Pesan Error tidak ada implementasi selain drive, info , work dan melukis");
	     }
	  }
	
	else if (input == 4) {
		System.out.println("Toby");
		System.out.println("choice(info/paint/cook/drive/work): ");
		if(choice == "info") {
			System.out.println("Orang yang tidak berguna");
		}
		else {
			System.out.println("Pesan error tidak ada implementasi sama sekali");
		}
	}
	
	else if (input == 5) {
		System.out.println("TonyStark");
		System.out.println("choice(info/paint/cook/drive/work):");
		if(choice == "info") {
			System.out.println("Seorang yang mengendarai kendaraan, bekerja , melukis & memasak");
		}
	else if(choice == "drive") {
		System.out.println(" Seorang yang mengendarai kendaraan ");
		
			}else if(choice == "work") {
				System.out.println(" Seorang yang bekerja");
			}
			else if(choice == "paint") {
				System.out.println(" Seorang yang melukis");
			}
			else if(choice == "cook") {
			System.out.println("Bertanggung jawab menciptakan dan menyusun menu, menentukan harga makanan,");
		}
	}
 }
	
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

}
