package bsu.rfe.java.group7.lab1.kaydalina.var6A;

public class Main {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int i = 0;

        for (String arg : args) {
            String[] parts = arg.split(("/")); //раздлеяем параметры ком строки
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Coffee")) {
                breakfast[i] = new Coffee(parts[1]);
            }
            i++;
        }
        int Apple=0;
        int Cheese =0;
        int Coffee=0;
        for (Food item: breakfast){
            if (item instanceof Apple){
                Apple++;
            }else if (item instanceof Cheese){
                Cheese++;
            }else if (item instanceof Coffee){
                Coffee++;
            }
        }

        System.out.println("Яблоки:"+Apple+"   Сыр:"+Cheese+"   Кофе:"+Coffee);


        System.out.println("Завтрак: ");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }

    }
}
