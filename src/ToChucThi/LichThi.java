




package ToChucThi;

import QuanLyCanBo.CanBo;
import QuanLyMonThi.MonThi;
import QuanLyPhongThi.PhongThi;
import QuanLyThiSinh.ThiSinh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


public class LichThi implements Serializable{
    private String maLichThi;
    private PhongThi phongthi;
    private String caThi;
    private ArrayList<ThiSinh> dsThiSinh;
    private MonThi monthi;
    private CanBo giamthi1;
    private CanBo giamthi2;

    public LichThi() {
    }

    public LichThi(String maLichThi, PhongThi phongthi, String caThi, ArrayList<ThiSinh> dsThiSinh, MonThi monthi, CanBo giamthi1, CanBo giamthi2) {
        this.maLichThi = maLichThi;
        this.phongthi = phongthi;
        this.caThi = caThi;
        this.dsThiSinh = dsThiSinh;
        this.monthi = monthi;
        this.giamthi1 = giamthi1;
        this.giamthi2 = giamthi2;
    }

    public String getMaLichThi() {
        return maLichThi;
    }

    public void setMaLichThi(String maLichThi) {
        this.maLichThi = maLichThi;
    }

    public PhongThi getPhongthi() {
        return phongthi;
    }

    public void setPhongthi(PhongThi phongthi) {
        this.phongthi = phongthi;
    }

    public String getCaThi() {
        return caThi;
    }

    public void setCaThi(String caThi) {
        this.caThi = caThi;
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public MonThi getMonthi() {
        return monthi;
    }

    public void setMonthi(MonThi monthi) {
        this.monthi = monthi;
    }

    public CanBo getGiamthi1() {
        return giamthi1;
    }

    public void setGiamthi1(CanBo giamthi1) {
        this.giamthi1 = giamthi1;
    }

    public CanBo getGiamthi2() {
        return giamthi2;
    }

    public void setGiamthi2(CanBo giamthi2) {
        this.giamthi2 = giamthi2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.maLichThi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LichThi other = (LichThi) obj;
        if (!Objects.equals(this.maLichThi, other.maLichThi)) {
            return false;
        }
        return true;
    }
}
