/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanqlsinhvien;

import java.io.Serializable;

/**
 *
 * @author Pham Triet Khanh Thi
 */
public class SinhVien implements Serializable{
    private String MaSo;
    private String HoTen;
    private String NamSinh;
    private String Email;
    private String Nganh;
    private String Khoa;
    private float Diem;
    private String GioiTinh;
    private String Lop;
    
    //Constructor mac dinh
    public SinhVien() {
    }
    
    //Constructor co tham so

    public SinhVien(String MaSo, String HoTen, String NamSinh, String Email, String Nganh, String Khoa, float Diem, String GioiTinh, String Lop) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.Email = Email;
        this.Nganh = Nganh;
        this.Khoa = Khoa;
        this.Diem = Diem;
        this.GioiTinh = GioiTinh;
        this.Lop = Lop;
    }
    

    /**
     * @return the MaSo
     */
    public String getMaSo() {
        return MaSo;
    }

    /**
     * @param MaSo the MaSo to set
     */
    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    /**
     * @return the HoTen
     */
    public String getHoTen() {
        return HoTen;
    }

    /**
     * @param HoTen the HoTen to set
     */
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    /**
     * @return the NamSinh
     */
    public String getNamSinh() {
        return NamSinh;
    }

    /**
     * @param NamSinh the NamSinh to set
     */
    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Nganh
     */
    public String getNganh() {
        return Nganh;
    }

    /**
     * @param Nganh the Nganh to set
     */
    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    /**
     * @return the Khoa
     */
    public String getKhoa() {
        return Khoa;
    }

    /**
     * @param Khoa the Khoa to set
     */
    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    /**
     * @return the Diem
     */
    public float getDiem() {
        return Diem;
    }

    /**
     * @param Diem the Diem to set
     */
    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

    //toString
    @Override
    public String toString() {
        return "SinhVien{" + "MaSo=" + MaSo + ", HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", Email=" + Email + ", Nganh=" + Nganh + ", Khoa=" + Khoa + ", Diem=" + Diem + '}';
    }

    /**
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    /**
     * @return the Lop
     */
    public String getLop() {
        return Lop;
    }

    /**
     * @param Lop the Lop to set
     */
    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    
    
}
