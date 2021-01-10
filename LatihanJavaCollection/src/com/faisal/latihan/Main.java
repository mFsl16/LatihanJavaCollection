package com.faisal.latihan;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Kontak> kontakList;
    private static Scanner scanner;

    public static void main(String[] args) {
        kontakList = new ArrayList<>();
        kontakList.add(new Kontak("Faisal", "0989767665", "faisal@gmail.com"));
        kontakList.add(new Kontak("Yudha", "0897776656", "yudha@gmail.com"));
        kontakList.add(new Kontak("Ence", "08977665667", "ence@gmail.com"));
        System.out.println("Selamat Datang di Aplikasi Kontak dan Pesan");
        menuUtama();
    }

    public static void menuUtama() {
        System.out.println("\t\t1. Kontak");
        System.out.println("\t\t2. Pesan");
        System.out.println("\t\t3. Keluar");
        System.out.print("Masukan Pilihan Anda : ");
        scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                menuKontak();
                break;
            case 2:
                menuPesan();
                break;
            default:
                break;
        }
    }

    public static void menuKontak() {
        boolean isKembali = false;
        while (!isKembali) {
            System.out.println("\t\t1. Tambah Kontak");
            System.out.println("\t\t2. Lihat Kontak");
            System.out.println("\t\t3. Hapus Kontak");
            System.out.println("\t\t4. Cari Kontak");
            System.out.println("\t\t5. Kembali");
            System.out.print("Masukan Pilihan Anda : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    MainFunction.tambahKontak(kontakList);
                    break;
                case 2:
                    MainFunction.lihatKontak(kontakList);
                    break;
                case 3:
                    MainFunction.hapusKontak(kontakList);
                    break;
                case 4:
                    System.out.println("Masukan nama kontak : ");
                    String namaKontak = scanner.next();

                    for (var kontak : kontakList) {
                        if (kontak.cari(namaKontak)) {
                            kontak.detailKontak();
                        }
                    }
                    break;
                case 5:
                    isKembali = true;
                default:
                    break;
            }
        }
    }

    public static void menuPesan() {
        System.out.println("\t\t1. Lihat Pesan");
        System.out.println("\t\t2. Hapus Pesan");
        System.out.println("\t\t3. Kembali");
    }
}
