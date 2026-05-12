package es.uniovi.reflection.bloch_3_9.noncompliant;

public class OnlyHashCodeDifficult {
    @Override
    public int hashCode() {
        return 0;
    }

    public boolean equals() {
        return false;
    }
}