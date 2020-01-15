import java.util.Scanner;

public class pajak{
	public static void main(String[] args) {
		float gaji1,tunjangan,bjabatan, pengurang;
    	float netto,pph21,pphtotal;
	    float bpjs;
	    float total, total2;
	    float iuran = 100000;

	    //pph21
	    gaji1 = Integer.parseInt(BSalary.getText());
	    tunjangan =  (Integer.parseInt(FoodAll.getText()) + (Integer.parseInt(TransAll.getText())));
	    bjabatan = ((gaji1) * 5)/100;
	    pengurang = bjabatan + iuran;

	    netto = gaji1 - pengurang;
	    pph21 = netto + tunjangan;
	    pphtotal = (gaji1 + tunjangan) - pph21;

	    String pph21S = Float.toString(pphtotal);
	    PPh.setText(String.valueOf(pph21S));


	    //bpjs
	    bpjs = ((gaji1 + tunjangan) * 4)/100;

	    String bpjsS = Float.toString(bpjs);
	    BPJS.setText(String.valueOf(bpjsS));


	    //net salary
	    total = pphtotal + bpjs;
	    total2 = (gaji1 + tunjangan) - total;

	    String nettoS = Float.toString(total2);
	    NSalary.setText(String.valueOf(nettoS));
	}
}