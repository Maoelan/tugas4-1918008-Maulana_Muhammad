package com.example.tugas_recycleview;

public class Games {
    private String nama,genre,price;
    private int foto;
    public Games(String nama, String genre, String price, int foto){
        this.nama = nama;
        this.genre = genre;
        this.price = price;
        this.foto = foto;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public int getFoto(){
        return foto;
    }
    public void setFoto(int foto){
        this.foto = foto;
    }
}
