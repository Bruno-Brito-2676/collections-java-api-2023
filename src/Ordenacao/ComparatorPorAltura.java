package Ordenacao;

import java.util.Comparator;

class ComparatorPorAltura implements Comparator<Pessoa> {
    ComparatorPorAltura() {
    }

    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}