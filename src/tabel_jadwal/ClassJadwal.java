package tabel_jadwal;

import custom_swing.EventAction;
import custom_swing.ModelAction;
import tabel_jadwal.ModelProfile;
import javax.swing.Icon;

public class ClassJadwal {

    public ClassJadwal() {
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }
    private Icon icon;
    private String name;
    private String str;
    private String spesialis;
    private int waktu;

    public ClassJadwal(Icon icon, String str, String name, String spesialis, int waktu) {
        this.icon = icon;
        this.name = name;
        this.str = str;
        this.spesialis = spesialis;
        this.waktu = waktu;
    }

    public Object[] toRowTable(EventAction event) {
//        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{new ModelProfile(icon, str), name, spesialis, waktu, new ModelAction(this, event)};
          
    }
}
