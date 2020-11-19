import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Tipe tipe = new Tipe();
		Tipe31 t31 = new Tipe31();
		Tipe32 t32 = new Tipe32();
		Tipe33 t33 = new Tipe33();
		Tipe34 t34 = new Tipe34();
		Tipe35 t35 = new Tipe35();
		Tipe40 t40 = new Tipe40();
		Scanner input = new Scanner(System.in);
		int tp;
		
		tipe.getTipe();
		System.out.print("Masukkan Tipe Rumah: ");
			tp = input.nextInt();
		if (tp == 31)
		{
			t31.getTipe31();
			System.out.println();
			System.out.println("Nama = " +tipe.nama); 
			System.out.println("Total harga = " +t31.tothar);
			System.out.println("Bayar = " +t31.bayar); 
			System.out.println("Kembalian = " +t31.k); 
		}
		else if (tp == 32)
		{
			t32.getTipe32();
			System.out.println();
			System.out.println("Nama = " +tipe.nama); 
			System.out.println("Total harga = " +t32.tothar);
			System.out.println("Bayar = " +t32.bayar); 
			System.out.println("Kembalian = " +t32.k); 
		}
		else if (tp == 33)
		{
			t33.getTipe33();
			System.out.println();
			System.out.println("Nama = " +tipe.nama); 
			System.out.println("Total harga = " +t33.tothar);
			System.out.println("Bayar = " +t33.bayar); 
			System.out.println("Kembalian = " +t33.k); 
		}
		else if (tp == 34)
		{
			t34.getTipe34();
			System.out.println();
			System.out.println("Nama = " +tipe.nama); 
			System.out.println("Total harga = " +t34.tothar);
			System.out.println("Bayar = " +t34.bayar); 
			System.out.println("Kembalian = " +t34.k); 
		}
		else if (tp == 35)
		{
			t35.getTipe35();
			System.out.println();
			System.out.println("Nama = " +tipe.nama); 
			System.out.println("Total harga = " +t35.tothar);
			System.out.println("Bayar = " +t35.bayar); 
			System.out.println("Kembalian = " +t35.k); 
		}
		else if (tp == 40)
		{
			t40.getTipe40();
			System.out.println();
			System.out.println("Nama = " +tipe.nama); 
			System.out.println("Total harga = " +t40.tothar);
			System.out.println("Bayar = " +t40.bayar); 
			System.out.println("Kembalian = " +t40.k); 
		}
		else
			System.out.println("Pilihan Anda salah!! Silahkan Pilih Tipe pada Daftar");
	}
}