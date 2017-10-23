package com.ridhoapps;

import javax.swing.JOptionPane;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        boolean quit = false;
        String nim;

        do {

            try {
                nim = JOptionPane.showInputDialog("Masukkan NIM Anda, (klik Cancel untuk Keluar)");

                if (nim.length() == 9) {
                    String fakultas = nim.substring(0, 2);
                    switch (fakultas) {
                        case "11":
                            fakultas = "Teknik";
                            break;
                        case "12":
                            fakultas = "Ekonomi";
                            break;
                        case "13":
                            fakultas = "Hukum";
                            break;
                        case "14":
                            fakultas = "Ilmu Kesehatan";
                            break;
                        default:
                            fakultas = "undefined";
                            break;
                    }
                    String jurusan = nim.substring(2, 4);
                    switch (jurusan) {
                        case "31":
                            jurusan = "Teknik Industri";
                            break;
                        case "32":
                            jurusan = "Teknik Mesin";
                            break;
                        case "33":
                            jurusan = "Teknik Komputer";
                            break;
                        case "34":
                            jurusan = "Teknik Informatika";
                            break;
                        case "35":
                            jurusan = "Manajemen";
                            break;
                        case "36":
                            jurusan = "Akuntansi";
                            break;
                        case "37":
                            jurusan = "Ilmu Hukum";
                            break;
                        case "38":
                            jurusan = "Ilmu Kesehatan";
                            break;
                        default:
                            jurusan = "undefined";
                            break;
                    }
                    String a = "20";
                    String tahun = a.concat(nim.substring(4, 6));
                    String absen = nim.substring(6, 9);


                    JOptionPane.showMessageDialog(null, "NIM : " + nim + "\n" + "Tahun Angkatan : " + tahun + "\n" + "Fakultas : " + fakultas + "\n" + "Jurusan : " + jurusan + "\n" + "No. Absen : " + absen);

                    int ulangi = JOptionPane.showOptionDialog(null, "Ingin Mengulangi Proses ?", "Ulangi Proses", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                    if (ulangi == 1)
                        quit = true;

                } else {
                    JOptionPane.showMessageDialog(null, "NIM yang anda Masukkan Invalid, silahkan ulangi kembali");
                }

            } catch (Exception e) {
                quit = true;
            }


        } while (quit == false);

    }
}