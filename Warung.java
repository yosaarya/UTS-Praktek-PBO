package UTS_PBO;
import java.util.Scanner;
public class Warung
{
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Menu Restoran : ");
			System.out.println("*********************************");
			System.out.println("1. Nasi Goreng		3. Nasi Gudeg");
			System.out.println("2. Nasi Rawon		4. Jus Jeruk");
			System.out.println("*********************************");
			System.out.println("5. Hitung Total		6. Keluar");
			System.out.println("");

			int harga = 0;
			int h1 = 15000, h2 = 15000, h3 = 15000, h4 = 4000;
			String menu = "";
			String menu1 = "Nasi Goreng ", menu2 = "Nasi Rawon ", menu3 = "Nasi Gudek ", menu4 = "Jus Jeruk ";

			for (String i = "Y"; i.equals("Y")||i.equals("y"); )
			{
			System.out.print("Masukkan Nomor Pesanan : ");
			int inNomor = scan.nextInt();
			if (inNomor == 1)
			{
			    menu = menu + menu1;
			    harga = harga + h1;
			}
			    else if (inNomor == 2)
			    {
			    	menu = menu + menu2;
			        harga = harga + h2;
			    }
			        else if (inNomor == 3)
			        {
			        	menu = menu + menu3;
			            harga = harga + h3;
			        }else if (inNomor == 4)
			        {
			        	menu = menu + menu4;
			            harga = harga + h4;
			        }else if (inNomor == 5 ){
			            System.out.println("*********************************");
			            System.out.println("Menu yang di pilih adalah : "+ menu);
			            System.out.println("Total pembayaran sebesar : " +harga);
			            System.out.println("*********************************");
			            System.out.print("Uang yang dibayarkan : ");
			            int inBayar = scan.nextInt();
			            int tot = inBayar-harga;
			            System.out.println("Uang kembalian : "+tot);
			            System.out.println("*********************************");
			            System.out.println("Terima Kasih Atas Kunjungan Anda! ^_^");
			            System.exit(0);
			        }else if (inNomor == 6){
			            System.exit(0);
			        }
			             else
			            {
			                System.out.println("Nomor yang dipilih tidak ada di menu.");
			            }

			}
		}
    }
}