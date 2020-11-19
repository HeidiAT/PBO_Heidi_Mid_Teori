import java.util.Scanner;

class Tipe34 extends Tipe
{
	void getTipe34()
	{
		b = 480000;
		System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
			j = input.nextInt();
		tothar = j * b;
		System.out.println("Total Harga: Rp "+tothar);
		System.out.print("Masukkan Bayar: Rp ");
			bayar = input.nextInt();
		k = bayar - tothar;
	}
}