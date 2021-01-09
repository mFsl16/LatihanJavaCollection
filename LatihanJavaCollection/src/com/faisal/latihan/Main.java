package com.faisal.latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Kontak> kontakList;
    private static Scanner scanner;

    public static void main(String[] args) {
        kontakList = new ArrayList<>();
        kontakList.add(new Kontak("Faisal", "0989767665", "faisal@gmail.com"));
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
                    System.out.print("\t\tMasukan Nama  : ");
                    String nama = scanner.next();
                    System.out.print("\t\tMasukan No Hp : ");
                    String noHp = scanner.next();
                    System.out.print("\t\tMasukan email : ");
                    String email = scanner.next();
                    System.out.println("\t\tApakan anda ingin menyimpan kontak ? ");
                    System.out.println("\t\t1. ya");
                    System.out.println("\t\t2. tidak");
                    System.out.print("Masukan Pilihan Anda : ");
                    int konfirm = scanner.nextInt();

                    if (konfirm == 1) {
                        kontakList.add(new Kontak(nama, noHp, email));
                        System.out.println("Kontak berhasil di simpan");
                    } else {
                        break;
                    }
                    break;
                case 2:
                    boolean isGoback = false;
                    while (!isGoback) {
                        for (var kontak : kontakList) {
                            kontak.detailKontak();
                        }
                        System.out.println("Apakah anda ingin kembali ?");
                        System.out.println("1. ya");
                        System.out.println("2. tidak");
                        int kembali = scanner.nextInt();
                        if (kembali == 1) {
                            isGoback = true;
                        } else {
                            isGoback = false;
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
