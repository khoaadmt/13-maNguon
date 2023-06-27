/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyCanBo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class CanBo implements Serializable {

    private String maCB;
    private String tenCB;

    public CanBo() {
    }
    
    public CanBo(String maCB, String tenCB) {
        this.maCB = maCB;
        this.tenCB = tenCB;
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getTenCB() {
        return tenCB;
    }

    public void setTenCB(String tenCB) {
        this.tenCB = tenCB;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.maCB);
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
        final CanBo other = (CanBo) obj;
        if (!Objects.equals(this.maCB, other.maCB)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CanBo{" + "maCB=" + maCB + ", tenCB=" + tenCB + '}';
    }
    
    
}

