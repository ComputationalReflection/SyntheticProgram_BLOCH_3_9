package es.uniovi.reflection.bloch_3_9.noncompliant;

public class OnlyEqualsDifficult {

    public boolean equals(Object obj) {
        return false;
    }

    public int hashCode(int prev){
        return 0;
    }
}