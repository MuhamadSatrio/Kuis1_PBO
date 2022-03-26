package com.tutorial;

import java.util.Scanner;

class pustakawan {
    //Atribut
    String nama;
    int idPustakawan;

    //Contructor
    pustakawan (String nama, int idPustakawan) {
        this.nama = nama;
        this.idPustakawan = idPustakawan;
    }

    //Method cetak data pustakawan
    void cetak(){
        System.out.println("<******************************************************>");
        System.out.println("Pustakawan yang bertanggung jawab: " + nama);
        System.out.println("Id: " + idPustakawan);
        System.out.println("<******************************************************>");
    }
}

class mahasiswa {
    //Atribut
    String nama, alamat;
    String NPM;

    //Method Memasukkan data diri pengunjung
    void dataDiri () {
        Scanner inputDataDiri = new Scanner(System. in );
        System.out.println ("<******************************************************>");
        System.out.println("Selamat datang di perpustakaan BERKAH JAYA");
        System.out.println("<******************************************************>");
        System.out.println ("Silahkan masukkan data diri pengunjung: ");
        System.out.println ("<******************************************************>");
        System.out.print   ("Masukkan Nama = ");
        nama = inputDataDiri.nextLine();
        System.out.print   ("Masukkan NPM = ");
        NPM = inputDataDiri.nextLine();
        System.out.println("Masukkan Alamat = ");
        alamat = inputDataDiri.next();
        System.out.println("<******************************************************>");
    }

    // Method Menampilkan data diri pengunjung
    void tampil (){
        System.out.println("\n\n<******************************************************>");
        System.out.println("Nama = " + nama);
        System.out.println("NPM = " + NPM);
        System.out.println("Alamat = " + alamat);
        System.out.println("<******************************************************>");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //objek pustakawan
        pustakawan data = new pustakawan("Dadang Subur", 123456);

        //objek mahasiswa
        mahasiswa dataPeminjam = new mahasiswa();

        dataPeminjam.dataDiri();

        //inisialisasi
        int dataPinjam, dataKembali;
        int harga, total_harga = 0, lama;

        while (true){
            System.out.println("Silahkan pilih keinginan anda ");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Pengembalian Buku");
            System.out.println("3. Selesai");
            System.out.print("Masukkan pilihan (angka) = ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                total_harga = 0;
                String judul_arr[] = new String[dataPinjam=20];
                String penulis_arr[] = new String[dataPinjam];

                System.out.println("Masukkan jumlah buku yang ingin dipinjam (angka): ");
                dataPinjam = input.nextInt();

                //Looping dengan syarat b kurang dari dataPinjam
                for (int b = 0; b < dataPinjam; b++) {
                    System.out.print("Masukan Judul Buku : ");
                    judul_arr[b] = input.next();
                    System.out.print("Penulis : ");
                    penulis_arr[b] = input.next();
                    System.out.println("lama peminjaman (hari) : ");
                    lama = input.nextInt();
                    harga = lama * 2000;
                    total_harga = total_harga + harga;
                }

                //Menampilkan data diri peminjam
                dataPeminjam.tampil();

                System.out.println("Total Biaya Pinjam           = " + total_harga);
                System.out.println("<******************************************************>");
                System.out.println("DAFTAR BUKU YANG DIPINJAM");
                System.out.println("<******************************************************>");

                //Looping cetak judul buku
                for (int b = 0; b < dataPinjam; b++) {
                    System.out.println("Judul Buku Ke : " + b + ": " + judul_arr[b]);
                }

                //Cetak data diri pustakawan
                data.cetak();
            }

            else if (pilihan == 2) {
                total_harga=0;
                String judulKembali_arr[] = new String[dataKembali=20];

                System.out.println("Masukkan jumlah buku yang ingin dikembalikan");
                dataKembali = input.nextInt();

                //Looping dengan syarat b kurang dari dataKembali
                for (int b = 0; b < dataKembali; b++) {
                    System.out.print("Masukan Judul Buku : ");
                    judulKembali_arr[b] = input.next();
                    System.out.println("lama peminjaman (hari) : ");
                    lama = input.nextInt();
                    harga = lama * 2000;
                    total_harga = total_harga + harga;
                }

                //Menampilkan data diri peminjam
                dataPeminjam.tampil();

                System.out.println("Total Biaya Pinjam           = " + total_harga);
                System.out.println("<******************************************************>");
                System.out.println("DAFTAR BUKU YANG DIKEMBALIKAN");
                System.out.println("<******************************************************>");

                //Looping cetak judul buku
                for (int b = 0; b < dataKembali; b++) {
                    System.out.println("Judul Buku Ke : " + b + ": " + judulKembali_arr[b]);
                }

                //Cetak data diri pustakawan
                data.cetak();
            }

            else {
                System.out.println ("\n\n<******************************************************>");
                System.out.println("Terimakasih Sudah Datang ke Perpustakaan Kami <3");
                System.out.println ("<******************************************************>\n");
                break;
            }

        }

    }
}