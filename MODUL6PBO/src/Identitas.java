class PJSK {
    public void Nama(){System.out.println ("Nama Leader");}
    public void Grup(){System.out.println ("Nama Grup\n");}
}
class VS extends PJSK {
    public void Nama(){System.out.println ("Hatsune Miku");}
    public void Grup(){System.out.println ("VIRTUAL SINGER\n");}
}
class LN extends PJSK {
    public void Nama(){System.out.println ("Hoshino Ichika");}
    public void Grup(){System.out.println ("Leo/need\n");}
}
class MJJ extends PJSK {
    public void Nama(){System.out.println ("Hanasato Minori");}
    public void Grup(){System.out.println ("MORE MORE JUMP!\n");}
}
class VBS extends PJSK {
    public void Nama(){System.out.println ("Azusawa Kohane");}
    public void Grup(){System.out.println ("Vivid BAD SQUAD\n");}
}
class WS extends PJSK {
    public void Nama(){System.out.println ("Tenma Tsukasa");}
    public void Grup(){System.out.println ("Wonderlands x Showtime\n");}
}
class NC extends PJSK {
    public void Nama(){System.out.println ("Yoisaki Kanade");}
    public void Grup(){System.out.println ("25-ji, Nightcord de.\n");}
}
public class Identitas {
    public static void main (String[] args){
        PJSK p = new PJSK();
        VS v = new VS();
        LN l = new LN();
        MJJ m = new MJJ();
        VBS b = new VBS();
        WS w = new WS();
        NC n = new NC();
        System.out.println("Karakter Project Sekai");
        p.Nama(); p.Grup();
        System.out.println("#1");
        v.Nama(); v.Grup();
        System.out.println("#2");
        l.Nama(); l.Grup();
        System.out.println("#3");
        m.Nama(); m.Grup();
        System.out.println("#4");
        b.Nama(); b.Grup();
        System.out.println("#5");
        w.Nama(); w.Grup();
        System.out.println("#6");
        n.Nama(); n.Grup();
        
    }
}
