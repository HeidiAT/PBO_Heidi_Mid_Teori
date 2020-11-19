import java.util.Scanner;

class Biaya extends Tipe
{
	void getBiaya()
	{
		System.out.print("Masukkan Tipe Rumah: ");
			tipe = input.nextInt();
		if (tipe == 31)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 100000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
		}
		else if (tipe == 32)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 125000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
		}
		else if (tipe == 33)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 450000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
		}
		else if (tipe == 34)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 480000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
		}
		else if (tipe == 35)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 500000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
		}
		else if (tipe == 40)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 550000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
		}
		else
			System.out.println("Pilihan Anda salah!! Silahkan Pilih Tipe pada Daftar");
	}
}