public class Main
{
	public static void main(String[] args)
	{
		Tipe tipe = new Tipe();
		Biaya bia = new Biaya();
		
		tipe.getTipe();
		bia.getBiaya();
		System.out.println();
		System.out.println("Nama = " +tipe.nama); 
		System.out.println("Total harga = " +bia.tothar);
		System.out.println("Bayar = " +bia.bayar); 
		System.out.println("Kembalian = " +bia.k); 
	}
}