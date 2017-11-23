package lesson1.task3;

/**
 * Created by MM on 19.11.2017.
 */
public class A {
    String string;
    Integer integer;
    Long aLong;

    /**
     * В сигнатуру вставляем именно Object, а не ClassA потому как метод будет не переопределён, а перегружен.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        /**
         * Если ссылки ссылаются на один и тот же объект, значит объекты равны
         */
        if (this == o) return true;
        /**
         * если объект равен null, значит сравниваемые объекты не равны т.к.
         * объект вызывающий данный метод не может быть null.
         * Так же если объекты относятся к разным класса, то они не равны при этом
         * instanceof использовать не рекоментуется т.к. разные классы унаследованые от одного интерфейса
         * будут возвращать true.
         */
        if (o == null || getClass() != o.getClass()) return false;

        /**
         * Если в предидущем сравнении классы оказались равны, то создадим новый объект
         * класса ClassA и присвоем ему ссылку на полученый объект.
         */
        A a = (A) o;

        /**
         * тут сравниваем переменные двух объектов каждую с каждой. Если у объекта есть числовые атрибуты то
         * их нужно сравнивать в перую очередь т.к. они сравниваются быстрее.
         * Так же обязательно необходимо сравнивать на null иначе можно получить исключение.
         */
        if (aLong != null ? !aLong.equals(a.aLong) : a.aLong != null) return false;
        if (integer != null ? !integer.equals(a.integer) : a.integer != null) return false;
        if (string != null ? !string.equals(a.string) : a.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        /**
         * При генерации числового значения необходимо обеспечить минимальное колличество коллизий
         * для это выбрано число 31 т.к. в некоторых случаях умножение может быть заменено сдвигом << а 31 в двоичной
         * системе выражается как 11111 соответственно при любом сдвиге будет обеспечено минимально число коллизий.
         */
        int result = string != null ? string.hashCode() : 0;
        result = 31 * result + (integer != null ? integer.hashCode() : 0);
        result = 31 * result + (aLong != null ? aLong.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "A{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                ", aLong=" + aLong +
                '}';
    }
}
