public class Employe {

    int id;
    String nama;
    String unit;
    String domisili;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDomisili() {
        return this.domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public Employe(int id, String nama, String unit, String domisili) {

        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.domisili = domisili;
    }

    public void spacePrint() {
        System.out.println("    ");
    }

    public void outPrint() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Unit: " + unit);
        System.out.println("Domisili: " + domisili);
    }

}
