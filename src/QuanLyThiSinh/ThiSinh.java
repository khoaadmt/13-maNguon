/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThiSinh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ThiSinh implements Serializable {
    private String soBD, hoTen, ngaySinh, gioiTinh;

    public ThiSinh() {
    }
    
    public ThiSinh(String soBD, String hoTen, String ngaySinh, String gioiTinh) {
        this.soBD = soBD;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public ThiSinh(String soBD) {
        this.soBD = soBD;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.soBD);
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
        final ThiSinh other = (ThiSinh) obj;
        if (!Objects.equals(this.soBD, other.soBD)) {
            return false;
        }
        return true;
    }

    public String getSoBD() {
        return soBD;
    }

    public void setSoBD(String soBD) {
       
        this.soBD = soBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    @Override
    public String toString(){
        return "So bao danh: " + soBD + ",Ho ten:" + hoTen + ",Gioi tinh: " + 
                gioiTinh + ",Ngay Sinh: " + ngaySinh;
    }
    
}