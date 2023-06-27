/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPhongThi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
/**
 *
 * @author ASUS
 */
public class PhongThi implements Serializable {
    private String maPT;
    private String tenPT;
    private int soLuongTS;

    public PhongThi() {
    }

    public PhongThi(String maPT, String tenPT, int soLuongTS) {
        this.maPT = maPT;
        this.tenPT = tenPT;
        this.soLuongTS = soLuongTS;
    }

    public String getMaPT() {
        return maPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public int getSoLuongTS() {
        return soLuongTS;
    }

    public void setSoLuongTS(int soLuongTS) {
        this.soLuongTS = soLuongTS;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maPT);
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
        final PhongThi other = (PhongThi) obj;
        if (!Objects.equals(this.maPT, other.maPT)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhongThi{" + "maPT=" + maPT + ", tenPT=" + tenPT + ", soLuongTS=" + soLuongTS + '}';
    }
    
}
   

 
    