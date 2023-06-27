/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonThi;

import QuanLyMonThi.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CUONG
 */
public class TableMonThi extends AbstractTableModel {
    
     //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã môn thi",
        "Tên môn thi", "Số tín chỉ", "Hình thức thi", "Thời gian làm bài"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,
        Integer.class,String.class,Integer.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<MonThi> dsmt=new ArrayList<>();
    
    public TableMonThi(ArrayList<MonThi> ds) {
        dsmt=ds;
    }
    
    @Override
    public int getRowCount() {
        return dsmt.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsmt.get(rowIndex).getMaMon();
            
            case 1: return dsmt.get(rowIndex).getTenMon();
            
            case 2: return dsmt.get(rowIndex).getSoTC();
            
            case 3: return dsmt.get(rowIndex).getHinhThucThi();
            
            case 4: return dsmt.get(rowIndex).getThoiGianLamBai();
            
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
