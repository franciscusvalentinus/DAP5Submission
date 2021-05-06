package com.uc.dicodingpemula5submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Anggota implements Parcelable {
    private String nama;
    private String detail;
    private int foto;
    private String role;

    public Anggota() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(detail);
        parcel.writeInt(foto);
        parcel.writeString(role);
    }

    protected Anggota(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        foto = in.readInt();
        role = in.readString();
    }

    public static final Creator<Anggota> CREATOR = new Creator<Anggota>() {
        @Override
        public Anggota createFromParcel(Parcel in) {
            return new Anggota(in);
        }

        @Override
        public Anggota[] newArray(int size) {
            return new Anggota[size];
        }
    };
}
