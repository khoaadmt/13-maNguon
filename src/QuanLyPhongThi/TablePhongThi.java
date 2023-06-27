/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyPhongThi;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CUONG
 */
public class TablePhongThi extends AbstractTableModel {

    public static void setModel(TablePhongThi tablePhongThi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã phòng thi","Tên phòng thi", "Số lượng thí sinh"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,Integer.class};      
    //Tạo một đối tượng arrayList có tên dsSV.
    ArrayList<PhongThi> dspt=new ArrayList<>();
    
    public TablePhongThi(ArrayList<PhongThi> ds) {
        dspt=ds;
    }
    
    @Override
    public int getRowCount() {
        return dspt.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dspt.get(rowIndex).getMaPT();
            
            case 1: return dspt.get(rowIndex).getTenPT();
            
            case 2: return dspt.get(rowIndex).getSoLuongTS();
            
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
