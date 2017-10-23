package com.ridhoapps;

import javax.swing.JOptionPane;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        boolean quit = false;
        boolean invalid = false;
        int check;
        String nim;

        do {

            try {
                nim = JOptionPane.showInputDialog("Masukkan NIM Anda, (klik Cancel untuk Keluar)");

                if (nim.length() == 9) {
                    String fakultas = nim.substring(0, 2);
                    String jurusan = nim.substring(2, 4);
                    check = Integer.parseInt(jurusan);
                    if (fakultas == "11") {
                        if (check > 30 && check < 35) {
                            fakultas = "Teknik";
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
                                default:
                                    break;
                            }
                        } else {
                            invalid = true;
                        }
                    } else if (fakultas == "12") {
                        if (check == 35 || check == 36) {
                            fakultas = "Ekonomi";
                            switch (jurusan) {
                                case "35":
                                    jurusan = "Manajemen";
                                    break;
                                case "36":
                                    jurusan = "Akuntansi";
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            invalid = true;
                        }
                    } else if (fakultas == "13") {
                        if (check == 37) {
                            fakultas = "Hukum";
                            jurusan = "Ilmu Hukum";
                        } else {
                            invalid = true;
                        }
                    } else if (fakultas == "14") {
                        if (check == 38) {
                            fakultas = "Ilmu Kesehatan";
                            jurusan = "Ilmu Kesehatan";
                        } else {
                            invalid = true;
                        }
                    } else {
                        invalid = true;
                    }

                    if (invalid){
                        JOptionPane.showMessageDialog(null, "NIM yang anda Masukkan Invalid, silahkan ulangi kembali");
                    } else {
                        String a = "20";
                        String tahun = a.concat(nim.substring(4, 6));
                        String absen = nim.substring(6, 9);

                        JOptionPane.showMessageDialog(null, "NIM : " + nim + "\n" + "Tahun Angkatan : " + tahun + "\n" + "Fakultas : " + fakultas + "\n" + "Jurusan : " + jurusan + "\n" + "No. Absen : " + absen);

                        int ulangi = JOptionPane.showOptionDialog(null, "Ingin Mengulangi Proses ?", "Ulangi Proses", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

                        if (ulangi == 1)
                            quit = true;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "NIM yang anda Masukkan Invalid, silahkan ulangi kembali");
                }

            } catch (Exception e) {
                quit = true;
            }


        } while (quit == false);

    }
}