package com.faisal.latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFunction {

    private static  Scanner scanner = scanner = new Scanner(System.in);;

    public static int konfirmasi (String pesan) {
        System.out.println(pesan);
        System.out.println("1. ya");
        System.out.println("2. tidak");
        System.out.print("Masukan pilihan : ");
        int isKonfirm = scanner.nextInt();
        return isKonfirm;
    }

    public static void tambahKontak(ArrayList<Kontak> kontakList) {
        System.out.print("\t\tMasukan Nama  : ");
        String nama = scanner.next();
        System.out.print("\t\tMasukan No Hp : ");
        String noHp = scanner.next();
        System.out.print("\t\tMasukan email : ");
        String email = scanner.next();

        int konfirm = MainFunction.konfirmasi("Apakah anda ingin menyimpan kontak ?");

        if (konfirm == 1) {
            kontakList.add(new Kontak(nama, noHp, email));
            System.out.println("Kontak berhasil di simpan");
        }
    }

    public static void lihatKontak(ArrayList<Kontak> kontakList) {
        boolean isGoback = false;
        int no = 0;
        while (!isGoback) {
            for (var kontak : kontakList) {
                no++;
                System.out.println("No     : " + no);
                kontak.detailKontak();
            }

            int kembali = MainFunction.konfirmasi("Apakah anda ingin Kembali ?");
            if (kembali == 1) {
                isGoback = true;
            } else {
                isGoback = false;
            }
        }
    }

    public static void hapusKontak(ArrayList<Kontak> kontakList) {
        int noDelet = 0;
        for (var kontak : kontakList) {
            noDelet++;
            System.out.println("No     : " + noDelet);
            kontak.detailKontak();
        }
        System.out.println("Masukan no kontak yang akan di hapus : ");
        int delete = scanner.nextInt() - 1;
        int isYakin = MainFunction.konfirmasi("Apakah anda yakin?");

        if (isYakin == 1) {
            if (delete > kontakList.size()) {
                System.err.println("No tidak ada");
                System.out.println("Kontak gagal di hapus");
            } else {
                kontakList.remove(delete);
                System.out.println("Kontak berhasil di hapus");

            }
        }
    }
}
