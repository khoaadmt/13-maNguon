/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyThiSinh;

import QuanLyThiSinh.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CUONG
 */
public class TableThiSinh extends AbstractTableModel {
    
     //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Số báo danh", "Họ tên", "Ngày sinh", "Giới tính" };
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class, String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<ThiSinh> dsts=new ArrayList<>();
    
    public TableThiSinh(ArrayList<ThiSinh> ds) {
        dsts=ds;
    }
    
    @Override
    public int getRowCount() {
        return dsts.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsts.get(rowIndex).getSoBD();
            
            case 1: return dsts.get(rowIndex).getHoTen();
            
            case 2: return dsts.get(rowIndex).getNgaySinh();
            
            case 3: return dsts.get(rowIndex).getGioiTinh();
            
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
