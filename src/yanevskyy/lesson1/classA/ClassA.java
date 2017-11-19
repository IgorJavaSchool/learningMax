package yanevskyy.lesson1.classA;

/**
 * Created by MM on 19.11.2017.
 */
public class ClassA {
    String string;
    Integer integer;
    Long aLong;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassA classA = (ClassA) o;

        if (aLong != null ? !aLong.equals(classA.aLong) : classA.aLong != null) return false;
        if (integer != null ? !integer.equals(classA.integer) : classA.integer != null) return false;
        if (string != null ? !string.equals(classA.string) : classA.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = string != null ? string.hashCode() : 0;
        result = 31 * result + (integer != null ? integer.hashCode() : 0);
        result = 31 * result + (aLong != null ? aLong.hashCode() : 0);
        return result;
    }
}
