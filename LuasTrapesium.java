public class LuasTrapesium {
    public double alas;
    public double tinggi;
    public double atas;

    public LuasTrapesium(double alas, double tinggi, double atas){
        this.alas = alas;
        this.tinggi = tinggi;
        this.atas = atas;

    public double hitungKeliling(){
        double sisMiring = Math.sqrt(Math.pow((atas-alas)/2,2) + Math.pow(tinggi,2));
        return alas + atas + 2* sisMiring;

    }

}
