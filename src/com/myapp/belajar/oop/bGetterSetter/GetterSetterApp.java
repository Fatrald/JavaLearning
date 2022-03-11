package com.myapp.belajar.oop.bGetterSetter;

class Data {
    public Integer intPublic;
    private Integer intPrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    //read only
    public Integer getIntPrivate() {
        return intPrivate;
    }

    //write only
    public void setIntPrivate(Integer intPrivate) {
        this.intPrivate = intPrivate;
    }
}

class Lingkaran {
    private Double diameter;

    Lingkaran(Double diameter){
        this.diameter = diameter;
    }

    //setter
    public void setJari(Double jari){
        this.diameter = jari * 2;
    }

    //getter
    public Double getJari(){
        return this.diameter / 2;
    }

    //getter kompleks
    public Double getLuas(){
        Double luas;
        Double jari = this.diameter / 2;
        luas = (22/7) * jari * jari;
        return luas;
    }
}

public class GetterSetterApp {
    public static void main(String[] args) {
        Data object = new Data();

        //public
        object.intPublic = 10; //write
        System.out.println(object.intPublic); //read

        //private
        object.setIntPrivate(10); //write
        System.out.println(object.getIntPrivate()); //read

        //gabungan read writer getter setter
        Lingkaran lingkaran = new Lingkaran(14.0);

        System.out.println("jari - jari : " + lingkaran.getJari());
        lingkaran.setJari(63.0);
        System.out.println("jari - jari : " + lingkaran.getJari());
        lingkaran.setJari(7.0);
        System.out.println("luas lingkaran : " + lingkaran.getLuas());
    }
}
