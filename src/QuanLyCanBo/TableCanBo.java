/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyCanBo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CUONG
 */
public class TableCanBo extends AbstractTableModel {
    
     //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã cán bộ","Tên cán bộ"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<CanBo> dscb=new ArrayList<>();
    
    public TableCanBo(ArrayList<CanBo> ds) {
        dscb=ds;
    }
    
    @Override
    public int getRowCount() {
        return dscb.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dscb.get(rowIndex).getMaCB();
            
            case 1: return dscb.get(rowIndex).getTenCB();
            
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
