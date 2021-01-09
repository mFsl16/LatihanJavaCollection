package com.faisal.latihan;

import java.util.ArrayList;

public class Kontak {
    private String nama;
    private String noHp;
    private String email;
    private ArrayList<Pesan> listPesan;

    public Kontak(String nama, String noHp, String email, ArrayList<Pesan> listPesan) {
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
        this.listPesan = listPesan;
    }

    public Kontak(String nama, String noHp, String email) {
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
        this.listPesan = new ArrayList<>();
    }

    public void detailKontak() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("No Hp   : " + this.noHp);
        System.out.println("Email   : " + this.email);
        System.out.println("---------------------------------");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Pesan> getListPesan() {
        return listPesan;
    }

    public void setListPesan(ArrayList<Pesan> listPesan) {
        this.listPesan = listPesan;
    }
}
