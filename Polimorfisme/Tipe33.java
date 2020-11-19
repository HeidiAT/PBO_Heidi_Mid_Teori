import java.util.Scanner;

class Tipe33 extends Tipe
{
	void getTipe33()
	{
		b = 450000;
		System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
			j = input.nextInt();
		tothar = j * b;
		System.out.println("Total Harga: Rp "+tothar);
		System.out.print("Masukkan Bayar: Rp ");
			bayar = input.nextInt();
		k = bayar - tothar;
	}
}