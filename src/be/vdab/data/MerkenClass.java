package be.vdab.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MerkenClass {

    private List<String> automerken;

    public MerkenClass() {
        automerken = Arrays.asList(Data.merken);
    }

    public void sorteer() {
        automerken.sort((m1, m2) -> m1.compareTo(m2));
    }

    public void keerOm() {
        automerken.sort((m1, m2) -> m2.compareTo(m1));
//        Collections.reverse(automerken);
    }

    @Override
    public String toString() {
        StringBuilder autolist = new StringBuilder();
        for (String merk : automerken) {
            autolist.append(merk).append(" ");
            }
        return autolist.toString();
    }
}
