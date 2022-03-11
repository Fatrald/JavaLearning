package com.myapp.belajar.oop.bReference;


class Buku {
    String judul;
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("penulis\t: " + this.penulis);
    }
}


class ReferenceApp {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Belajar ABC","abjadul sukaimah");
        buku1.display();

        //menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println("lokasi\t: " + addressBuku1);

        //assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println("lokasi\t: " + addressBuku2);

        //karena buku1 dan buku2 pada referensi sama
        buku1.judul = "Study ABC";
        buku1.display();
        buku2.display();

        //memasukkan object kedalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address fungsi --> " + addressDataBuku);
        dataBuku.penulis = "abjadul maemunah";
    }
}