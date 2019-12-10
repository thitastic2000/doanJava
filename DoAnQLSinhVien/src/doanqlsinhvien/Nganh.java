/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanqlsinhvien;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dokis
 */
public class Nganh {
    private ArrayList<String>nganh;

    //Constructor mac dinh

    public Nganh() {
        nganh = new ArrayList<>();
    }
    
    
    public void createNganh(String khoa)
    {
        try {
            nganh.clear();
            if(khoa == "CNTT")
        {
            nganh.add("Công nghệ phần mềm");
            nganh.add("Đồ họa");
            nganh.add("Mạng máy tính");
        }
        else if(khoa == "Ngoại ngữ")
        {
            nganh.add("Tiếng Hàn");
            nganh.add("Tiếng Nhật");
            nganh.add("Tiếng Anh");
        }
        else if(khoa == "Cơ khí")
        {
            nganh.add(("Ô tô"));
            nganh.add("Chế tạo máy");
        }
        else if(khoa == "Điện tử")
        {
            nganh.add("Vi mạch");
            nganh.add("Điện tử");
        }
        else{
            nganh.add("");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Undefined error!");
        }
    }
    
    public int getLength()
    {
        return nganh.size();
    }
    
    public String getValueOf(int number)
    {
        return nganh.get(number);
    }
    
    public void clear()
    {
        nganh.clear();
    }
    
}
