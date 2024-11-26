class Mobil {
    // Deklarasi
    private String merk, type, warna;
    private double harga;
    // Setter
    public void setMerk (String merk){this.merk = merk;}
    public void setType (String wype){this.type = type;}
    public void setWarna (String warna ){this.warna = warna;}
    public void setHarga (double harga){this.harga = harga;}
    // Getter
    public String getMerk (){return merk;}
    public String getType (){return type;}
    public String getWarna (){return warna;}
    public double getHarga (){return harga;}
    // Method Tambahan (Cashback)
    public double CashBack(){
        double cashback = 0.1 * getHarga();
        double total = getHarga() - cashback;
        return total;
    }
    public void Keterangan(){
        System.out.println ("Harga Mobil setelah dikurangi Cashback = " + CashBack());
    }
}
