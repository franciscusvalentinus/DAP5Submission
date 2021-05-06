package com.uc.dicodingpemula5submission;

import java.util.ArrayList;

public class DataAnggota {
    private static String[] namaAnggota = {
            "Na Young",
            "Chung Ha",
            "Se Jeong",
            "Chae Yeon",
            "Kyul Kyung",
            "So Hye",
            "Yeon Jung",
            "Yoo Jung",
            "Mi Na",
            "Do Yeon",
            "So Mi"
    };

    private static String[] detailAnggota = {
            "Nayoung merupakan trainee dari Pledis Entertainment dan masuk dalam proyek grup bernama “Pledis Girlz”. Ia bergabung dengan Pledis sejak tahun 2010. Pendidikan: On Yang Middle School, Muhak All Girls High School, Dongduk Women’s University",
            "Ia pernah tinggal di Dallas, Texas selama kurang lebih 7 sampai 8 tahun sebelum akhirnya ia ke Korea untuk mengejar mimpinya menjadi penyanyi. Chungha pernah bekerja paruh waktu di toko hewan. Ia pernah mengikuti audisi YG Entertainment",
            "Saat final, ia menempati posisi 2 dibawah Jeon Somi (trainee dari JYP Entertainment). Panutanya adalah IU. Dalam suatu program, ia mengaku penggemar berat IU",
            "Chaeyeon lahr di Suncheon, Jeonnam, Korea Selatan. Chaeyeon sekolah di Sekolah Seni Pertunjukan Seoul (Seoul). Sebelum ikut program Produce 101 dan debut bersama I.O.I, Chaeyeon sudah terlebih dahulu debut bersama DIA pada tahun 2015 lalu",
            "Jie Qiong sekolah di School of Performing Arts Seoul (SOPA). Sebelumnya ia lulusan dari Shanghai Conservactory of Music. Ia di audisi oleh Pledis Entertainment sejak usianya masih 11 tahun",
            "Keluarga: Ayah, Ibu dan Adik. Sohye kini sekolah di Kyunggi Girls High School. Saat mengikuti Produce 101, ia dibawah agensi RedLine Entertainment. Namun sekarang ia dibawah S&P Entertainment",
            "Yeonjung merupakan traine dari Straship Entertainment. Sebelumnya ia pernah trainee di SM Entertainment. Ia juga pernah audisi untuk JYP Entertainment membawakan lagu Bad Guy dari penyanyi JOO",
            "Yoo Jung sebelumnya belajar di Seoul Music High School dan sekarang ia pindah ke SOPA. Ia menjalani pelatihan selama 4 tahun 7 bulan di Fantagio sebelum memulai debutnya. Dalam babak akhir, ia berada diposisi ke-3",
            "Mina sebelumnya sekolah di Sangji Girls’ High School dan sekarang belajar di SOPA. Dia adalah member Gugudan bersama dengan Sejeong. Hobinya yakni menonton drama dan pergi jalan-jalan sendirian",
            "Doyeon lulus dari Pyungwom Elementary School. Ia melanjutkan belajarnya di Sangji Girls High School. Namun kini ia pindah ke School of Performing Arts (SOPA). Dia berlatih di Fantagio selama satu tahun 5 bulan. Dia adalah anggota tertinggi di I.O.I",
            "Ayahnya bernama Matius Douma, Ibunya bernama Jeon Hee Sun dan adiknya bernama Evelyn Douma. Dia menempati posisi pertama dibabak akhir. Fancam BANG BANG Somi di Naver berhasil dintonton lebih dari sejuta kali hanya dalam waktu 5 hari. Meskpiun dia adalah maknae dia termasuk member tertinggi ketiga setelah Doyeon dan Nayoung"
    };

    private static String[] roleAnggota = {
            "Leader, Rap, Vocal, Lead Dancer",
            "Main Dancer, Vocal, Rap",
            "Main Vocal",
            "Vocal, Visual",
            "Vocal, Lead Dancer, Vocal",
            "Vocal, Rap",
            "Main Vocal",
            "Lead Rapper, Lead Vocal, Lead Dancer",
            "Rap, Vocal, Lead Dancer",
            "Vocal",
            "Maknae, Vocal, Rap, Face of the Group"
    };

    private static int[] fotoAnggota = {
            R.drawable.nayoung,
            R.drawable.chungha,
            R.drawable.sejeong,
            R.drawable.chaeyeon,
            R.drawable.kyulkyung,
            R.drawable.sohye,
            R.drawable.yeonjung,
            R.drawable.yoojung,
            R.drawable.mina,
            R.drawable.doyeon,
            R.drawable.somi
    };

    static ArrayList<Anggota> getListData() {
        ArrayList<Anggota> list = new ArrayList<>();
        for (int position = 0; position < namaAnggota.length; position++) {
            Anggota anggota = new Anggota();
            anggota.setNama(namaAnggota[position]);
            anggota.setDetail(detailAnggota[position]);
            anggota.setFoto(fotoAnggota[position]);
            anggota.setRole(roleAnggota[position]);
            list.add(anggota);
        }
        return list;
    }
}