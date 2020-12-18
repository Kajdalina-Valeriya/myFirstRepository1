package bsu.rfe.java.group7.lab1.kaydalina.var6A;

public class Coffee extends Food {
    private String aroma;             // из-за создания нового поля нужно переопределить методы equals и toString

    public Coffee(String aroma)     // конструктор инициализации
    {
        super("Кофе");               // вызывает конструктор базового класса
        this.aroma = aroma;
    }

    public void consume()           // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " выпит");
    }

    public String getSize()   // возвращает значение Aroma
    {
        return aroma;
    }

    public void setSize(String aroma)  // изменение значения Aroma
    {
        this.aroma = aroma;
    }

    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString() + " аромата '" + aroma.toUpperCase() + "'";
    }
}
