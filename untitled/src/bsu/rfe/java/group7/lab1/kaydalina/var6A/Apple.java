package bsu.rfe.java.group7.lab1.kaydalina.var6A;

public class Apple extends Food{
    private String size;             // из-за создания нового поля нужно переопределить методы equals и toString

    public Apple(String size)     // конструктор инициализации
    {
        super("Яблоко");               // вызывает конструктор базового класса
        this.size = size;
    }

    public void consume()           // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " съедено");
    }

    public String getSize()   // возвращает размер яблока
    {
        return size;
    }

    public void setSize(String aroma)  // изменение размера яблока
    {
        this.size = size;
    }

    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
