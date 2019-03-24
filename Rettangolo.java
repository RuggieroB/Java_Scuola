import java.util.*;
public class Rettangolo {
    public double base,altezza;
    public Rettangolo(double base,double altezza)
	{
		base=base;
		altezza=altezza;
	}
    public double arearett(double base,double altezza){
        double area;
        area=(base*altezza)/2.0;
        return area;
    }
    public static void main(String[] args) {
        double base1,altezza1,area1,base2,altezza2,area2;
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire base ed altezza del primo rettangolo:\n");
        System.out.print("Base=\t");
        base1=in.nextDouble();
        System.out.print("\nAltezza=\t");
        altezza1=in.nextDouble();
        Rettangolo rett1=new Rettangolo(base1,altezza1);
        area1=rett1.arearett(base1,altezza1);
        System.out.print("\n\nArea=\t"+area1);
        System.out.println("\n\nInserire base ed altezza del secondo rettangolo:\n");
        System.out.print("Base=\t");
        base2=in.nextDouble();
        System.out.print("\n\nAltezza=\t");
        altezza2=in.nextDouble();
        Rettangolo rett2=new Rettangolo(base1,altezza1);
        area2=rett2.arearett(base2,altezza2);
        System.out.print("\nArea=\t"+area2);
        if(area1>area2){
            System.out.print("\n\n\n\nIl primo rettangolo ha area maggiore.\n");
        }else{
            System.out.println("\n\n\n\nIl secondo rettangolo ha area maggiore.\n");
        }
    }
}