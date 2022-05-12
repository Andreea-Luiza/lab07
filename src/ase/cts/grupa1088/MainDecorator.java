package ase.cts.grupa1088;

import ase.cts.grupa1088.decorator.Masina;
import ase.cts.grupa1088.decorator.MasinaInteligentaDecorator;
import ase.cts.grupa1088.decorator.MasinaPersonala;

public class MainDecorator {
    public static void main(String args[]){
        Masina m=new MasinaPersonala();

        m.pornesteMotorul();

        Masina m2=new MasinaInteligentaDecorator(new MasinaPersonala());
        m2.pornesteMotorul();

    }
}