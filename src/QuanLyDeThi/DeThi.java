/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyDeThi;

import java.io.Serializable;
import java.util.Objects;


public class DeThi implements Serializable{
    private String maDeThi;
    private String tenDeThi;
    private String maMonThi;

    public DeThi() {
    }

    public DeThi(String maDeThi, String tenDeThi, String maMonThi) {
        this.maDeThi = maDeThi;
        this.tenDeThi = tenDeThi;
        this.maMonThi = maMonThi;
    }

    public String getMaDeThi() {
        return maDeThi;
    }

    public void setMaDeThi(String maDeThi) {
        this.maDeThi = maDeThi;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public String getMaMonThi() {
        return maMonThi;
    }

    public void setMaMonThi(String maMonThi) {
        this.maMonThi = maMonThi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.maDeThi);
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
        final DeThi other = (DeThi) obj;
        if (!Objects.equals(this.maDeThi, other.maDeThi)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeThi{" + "maDeThi=" + maDeThi + ", tenDeThi=" + tenDeThi + ", maMonThi=" + maMonThi + '}';
    }
    
    
}
