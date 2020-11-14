/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan52siapakamu;

/**
 *
 * @author andreas
 */
public class Dosen extends Manusia {
    private String nip, mataKuliah;
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMataKuliah() {
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya " + this.getNama() + " umur " + this.getUmur() 
                + " tahun sedang mengajar matakuliah " + this.getMataKuliah());
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
