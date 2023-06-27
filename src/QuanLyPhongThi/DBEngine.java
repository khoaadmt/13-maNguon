/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPhongThi;

import QuanLyPhongThi.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DBEngine {
 /**
* Serial 1 đối tượng xuống file
* @param fileName file chỉ định
* @param obj: đối tượng cần serial
* @throws Exception
*/
public void LuuFile(String fileName, ArrayList<PhongThi> ds) 
        throws Exception{
    //Tạo luồng ghi file
    FileOutputStream fs=new FileOutputStream(fileName);
    //Tạo luồng để serial đối tượng
    ObjectOutputStream os=new ObjectOutputStream(fs);
    for (PhongThi phongthi : ds) {
        os.writeObject(phongthi);
    }
    //chuyển tải đối tượng tới đích (tập tin)
    //đóng luồng
    fs.close();
    os.close();
}

public ArrayList<PhongThi> DocFile(String fileName) throws Exception{
    ArrayList<PhongThi> ds = new ArrayList<>();
    //Tạo luồng đọc file đã được serial    
    FileInputStream fi=new FileInputStream(fileName);
    //Tạo luồng để Deserialize đối tượng
    ObjectInputStream ois=new ObjectInputStream(fi);
    //Tiến hành khôi phục đối tượng
    PhongThi obj = null;
    while ((obj = (PhongThi) ois.readObject()) != null ) {
        ds.add(obj);
    }
    //đóng luồng
    fi.close();
    ois.close();
    return ds;
}
}
