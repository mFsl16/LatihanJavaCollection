package com.faisal.latihan;

public class Pesan {
    private String penerima;
    private String pesan;
    private String uid;

    public Pesan(String penerima, String pesan, String uid) {
        this.penerima = penerima;
        this.pesan = pesan;
        this.uid = uid;
    }

    public void detailPesan() {
        System.out.println("id       : " + this.uid);
        System.out.println("Penerima : " + this.penerima);
        System.out.println("Pesan    : " +  this.pesan);
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
