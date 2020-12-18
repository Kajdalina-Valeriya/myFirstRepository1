package bsu.rfe.java.group7.lab1.kaydalina.var6A;

public abstract class Food implements Consumable{
    private String name = null;

    public Food(String name)   // конструктор инициализации
    {
        this.name = name;
    }
    public boolean equals(Object arg0)         // перегружен метод сравнения
    {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food) arg0).name == null) return false;
        return name.equals(((Food) arg0).name);
    }

    public String toString()        // перегружен метод преобразования в строку
    {
        return name;
    }

    public String getName()        // возвращает имя
    {
        return name;
    }

    public void setName(String name)        // изменение имени
    {
        this.name = name;
    }
}
