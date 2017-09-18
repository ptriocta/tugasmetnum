import java.util.Scanner;
import java.lang.Math;

public class aritmatikademo
{

	public static void main (String [] args)
	{

	Scanner input = new Scanner (System.in);

	int x  ;
	int y ;
	int pil;
	int hasil;
	int i ;
	int menu =0;
	

	//Menu

	while (menu==0){
	
	System.out.print("\n");

 	System.out.println("========================================");
	System.out.println("=======menu aritmatika=======");
 	System.out.println("==  1. penjumlahan		==");
	System.out.println("==  2. pengurangan		==");
 	System.out.println("==  3. perkalian		==");
 	System.out.println("==  4. pangkat			==");
	System.out.println("==  5. f(x)=2x^2-3x+1		==");
	System.out.println("==  6. keluar			==");
 	System.out.println("========================================");

 	System.out.print("Masukkan Pilihan Anda : ");

 	pil = Integer.parseInt(input.next());

 	switch(pil)
	{
 
  		case 1 :{
     			System.out.print("input x=");
			x= input.nextInt();

			System.out.print("input y=");
			y= input.nextInt();

			//Penjumlahan

			System.out.println("penjumlahan");
			System.out.println(" x+y="+(x+y));

			break;     
			}
    
  		case 2 :{   
			System.out.print("input x=");
			x= input.nextInt();

			System.out.print("input y=");
			y= input.nextInt();

     			//Pengurangan	

			System.out.println("pengurangan ");
			System.out.println(" x-y="+(x-y));

			break;
     			} 
    
  		case 3 :{
			System.out.print("input x=");
			x= input.nextInt();

			System.out.print("input y=");
			y= input.nextInt();

     			//Perkalian

			System.out.println("perkalian");
			System.out.println(" x*y="+(x*y ));
			break;
    			}
    
  		case 4 :{
			System.out.print("input x=");
			x= input.nextInt();
		
			System.out.print("input y=");
			y= input.nextInt();

    		 	//Pangkat

			System.out.println("pangkat");
			System.out.println(" x pangkat y =" + Math.pow(x,y));
	
     
			break;
    			}

 		case 5 :{
			System.out.print("input x=");
			x= input.nextInt();

			System.out.print("input y=");
			y= input.nextInt();

     			System.out.println("f(x)");
	
			for (i=x;i<=y;i++) {
				hasil = (2*i*2)-((3*i)+1);
     				System.out.println(" hasil =" +hasil);
				}

			break;
   			}

		case 6	: {
			System.out.print("\n");
			System.out.print("TERIMAKASIH, SAMPAI JUMPA ^^");
			System.out.print("\n");
			System.exit(0);
			break;
			}
     		
		default:

			break;

			}
	}
	}
}
