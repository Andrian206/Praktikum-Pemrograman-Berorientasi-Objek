public class ProgramBalok {
    public static void main (String[] args){
        double p, l, t, vlm, lpb, kbl;
        p = 4;
        l = 3;
        t = 2;
        vlm = p * l * t;
        lpb = 2 * ((p * l) + (p * t) + (l * t));
        kbl = 4 * (p + l + t);
        System.out.println("Program Balok");
        System.out.println("Volume          : "+vlm);
        System.out.println("Luas Permukaan  : "+lpb);
        System.out.println("Keliling        : "+kbl);
    }
}
