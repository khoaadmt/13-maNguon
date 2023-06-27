/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDeThi;

import QuanLyDeThi.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CUONG
 */
public class TableDeThi extends AbstractTableModel {
    
     //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã đề thi","Tên đề thi", "Mã môn thi"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<DeThi> dsdt=new ArrayList<>();
    
    public TableDeThi(ArrayList<DeThi> ds) {
        dsdt=ds;
    }
    
    @Override
    public int getRowCount() {
        return dsdt.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsdt.get(rowIndex).getMaDeThi();
            
            case 1: return dsdt.get(rowIndex).getTenDeThi();
            
            case 2: return dsdt.get(rowIndex).getMaMonThi();
            
            default : return null;
        }
    }
    
    public Class getColumnClass(int columnIndex){
        return classes[columnIndex];
    }
    
    public String getColumnName(int column){
        return name[column];
    }
    
}
