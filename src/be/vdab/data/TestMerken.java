package be.vdab.data;

public class TestMerken {
    public static void main(String[] args) {
        MerkenClass merken = new MerkenClass();
        System.out.println(merken);
        merken.sorteer();
        System.out.println(merken);
        merken.keerOm();
        System.out.println(merken);
    }
}