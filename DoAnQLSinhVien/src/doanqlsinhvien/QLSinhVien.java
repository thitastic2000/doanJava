/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanqlsinhvien;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Pham Triet Khanh Thi
 */
public class QLSinhVien {
    //Mang chua thong tinh danh sach sinh vien
    ArrayList<SinhVien>listSV;
    
    //Constructor mac dinh
    public QLSinhVien() {
        listSV = new ArrayList<>();
    }

    //Constructor co tham so
    public QLSinhVien(ArrayList<SinhVien> listSV) {
        this.listSV = listSV;
    }

    //Phuong thuc them
    public void add(SinhVien sv)
    {
        listSV.add(sv);
    }
    
    //Phuong thuc sua
    public void edit(SinhVien sv)
    {
        for(SinhVien s : listSV)
        {
            if(s.getMaSo().equals(sv.getMaSo()))
            {
                s.setNganh(sv.getNganh());
                s.setHoTen(sv.getHoTen());
                s.setDiem(sv.getDiem());
                s.setGioiTinh(sv.getGioiTinh());
                s.setEmail(sv.getEmail());
                s.setLop(sv.getLop());
                s.setNamSinh(sv.getNamSinh());
                s.setKhoa(sv.getKhoa());
                return;
            }
        }
    }
    
    //Phuong thuc xoa
    public void remove(SinhVien sv)
    {
        int i = 0;
        for(SinhVien s : listSV)
        {
            if(s.getMaSo().equals(sv.getMaSo()))
            {
                listSV.remove(i);
                return;
            }
            i++;
        }
    }
    
    //Phuong thuc doc file
    public void readfromFile(String filepath)
    {
        ArrayList<SinhVien>temp = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            temp = (ArrayList<SinhVien>)ois.readObject();
            ois.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error to read file");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Class not found!");
        }
        listSV = temp;
    }
    
    //Phuong thuc ghi file
    public void exportToFile(String filepath)
    {
        try{
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listSV);
            oos.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Can't save file!");
        }
    }
    
    //Phuong thuc lay do dai
    public int getLength()
    {
        return listSV.size();
    }
    
    //Phuong thuc chon
    public SinhVien select(int index)
    {
        return listSV.get(index);
    }
    
    public SinhVien select(String MaSo)
    {
        for(SinhVien s : listSV)
        {
            if(s.getMaSo().equals(MaSo))
            {
                return s;
            }
        }
        return null;
    }
    
    //Phuong thuc sap xep theo ten
        public void SortbyName()
    {
        Collections.sort(listSV, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien sv, SinhVien sv1) {
                return sv1.getHoTen().compareTo(sv.getHoTen());
            }
        });
    }
            
    //Phuong thuc sap xep theo MSSV
        public void SortbyMSSV()
    {
        Collections.sort(listSV, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien sv, SinhVien sv1) {
                return sv.getMaSo().compareTo(sv1.getMaSo());
            }
        });
    }
            
    //Phuong thuc sap xep theo lop
        public void SortbyClass()
    {
        Collections.sort(listSV, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien sv, SinhVien sv1) {
                return sv.getLop().compareTo(sv1.getLop());
            }
        });
    }
            
    //Phuong thuc sap xep theo diem
        public void SortbyScore()
    {
        Collections.sort(listSV, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiem() < sv2.getDiem()) {
                    return 1;
                } else {
                    if (sv1.getDiem() == sv2.getDiem()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }
    public ArrayList<SinhVien> getList()
    {
        return this.listSV;
    }
    
    public ArrayList<SinhVien> search(String key)
    {
        ArrayList<SinhVien>result = new ArrayList<>();
        for(SinhVien item : listSV)
        {
            if(item.getMaSo().equals(key) || item.getHoTen().equals(key))
            {
                result.add(item);
            }
        }
        return result;
    }
    
    public void mergeItem(ArrayList<SinhVien> sv)
    {
        for(SinhVien item : listSV)
        {
            for(SinhVien item2 : sv)
            {
                if(item.getMaSo().equals(item2.getMaSo()))
                {
                    item.setHoTen(item2.getHoTen());
                    item.setEmail(item2.getEmail());
                    item.setGioiTinh(item2.getGioiTinh());
                    item.setDiem(item2.getDiem());
                    item.setKhoa(item2.getKhoa());
                    item.setLop(item2.getLop());
                    item.setNamSinh(item2.getNamSinh());
                    item.setNganh(item2.getNganh());
                }
            }
        }
    }
}
