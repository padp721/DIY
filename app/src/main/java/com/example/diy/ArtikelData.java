package com.example.diy;

import java.util.ArrayList;

public class ArtikelData {
    public static String[][] data = new String[][]{
            {"Kerajinan Tangan Motif Manik-manik Khas Suku Dayak Tamambalo", "Kompas.com", "02 Mei 2019", "https://asset.kompas.com/crop/315x29:1135x575/750x500/data/photo/2019/05/02/1821943996.jpg"},
            {"Peserta Pelatihan Kerajinan Tangan Diharapkan Jadi Penggerak Ekonomi Desa", "Tribun Jogja", "02 Mei 2019", "http://cdn2.tstatic.net/jogja/foto/bank/images/peserta-pelatihan-kerajinan-tangan-diharapkan-jadi-penggerak-ekonomi-desa.jpg"},
            {"Limbah Kulit Sagu Disulap Menjadi Berbagai Kerajinan Tangan", "Tribun Pekanbaru", "26 April 2019", "http://cdn2.tstatic.net/pekanbaru/foto/bank/images/bimbingan_teknis_pengolahan_limbah_kulit_sagu_di_desa_sungaitohor_kepulauan_meranti_riau.jpg"},
            {"Ekspor Produk Kerajinan Tangan RI Naik 4 Kali Lipat Dalam 20 Tahun", "detikFinance", "24 April 2019", "https://akcdn.detik.net.id/community/media/visual/2015/04/10/ebef226a-9223-4797-b243-8f30ea0423be_169.jpg?w=700&q=80"},
            {"Kerajinan Tangan Batok Kelapa dan Tulang Ikan Sumenep Madura Tembus Eropa", "Tribunnews", "23 April 2019", "http://cdn2.tstatic.net/tribunnews/foto/bank/images/jenis-aksesoris-garapan-perajin-milik-farida.jpg"},
            {"PKK Sunter Agung Ubah Sampah Kantong Plastik Jadi Kerajinan Tangan", "WartakotaLive.com", "25 April 2019", "http://cdn2.tstatic.net/wartakota/foto/bank/images/pkk-sunter.jpg"}
    };

    public static ArrayList<Artikel> getListData(){
        Artikel artikel = null;
        ArrayList<Artikel> list = new ArrayList<>();
        for (String[] aData : data) {
            artikel = new Artikel();
            artikel.setName(aData[0]);
            artikel.setRemarks(aData[1]);
            artikel.setTanggal(aData[2]);
            artikel.setPhoto(aData[3]);

            list.add(artikel);
        }

        return list;
    }
}