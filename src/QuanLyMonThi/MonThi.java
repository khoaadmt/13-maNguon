/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyMonThi;

import QuanLyDeThi.DeThi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class MonThi implements Serializable{
    private String maMon;
    private String tenMon;
    private int soTC;
    private String hinhThucThi;
    private int thoiGianLamBai;
    
    public MonThi() {
    }

    public MonThi(String maMon, String tenMon, int soTC, 
            String hinhThucThi, int thoiGianLamBai) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTC = soTC;
        this.hinhThucThi = hinhThucThi;
        this.thoiGianLamBai = thoiGianLamBai;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getHinhThucThi() {
        return hinhThucThi;
    }

    public void setHinhThucThi(String hinhThucThi) {
        this.hinhThucThi = hinhThucThi;
    }

    public int getThoiGianLamBai() {
        return thoiGianLamBai;
    }

    public void setThoiGianLamBai(int thoiGianLamBai) {
        this.thoiGianLamBai = thoiGianLamBai;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maMon);
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
        final MonThi other = (MonThi) obj;
        if (!Objects.equals(this.maMon, other.maMon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MonThi{" + "maMon=" + maMon + ", tenMon=" + tenMon + ", soTC=" + soTC + ", hinhThucThi=" + hinhThucThi + ", thoiGianLamBai=" + thoiGianLamBai + '}';
    }

    
}
    

