package bsu.rfe.java.group6.lab1.DMUKHOVSKIY.var5;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int i = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Burger")) {
                breakfast[i] = new Burger(parts[1]);
            }
            
            i++;
        }

        for (Food item : breakfast)
            if (item != null)
                item.consume();
            else
                break;
        PrintFood(breakfast);
        System.out.println("\nВсего хорошего!");

    }

    static void PrintFood(Food[] breakfast) {
        int Cheese = 0;
        int Apple = 0;
        int Burger = 0;
        for (Food item : breakfast) {
            if (item instanceof Cheese) {
                Cheese++;
                continue;
            }
            if (item instanceof Apple) {
                Apple++;
                continue;
            }
            if (item instanceof Burger) {
                Burger++;
                continue;
            }
        }
        System.out.println("\nКоличество: \n"+"Сыр=" + Cheese + "\n" + "Яблоко=" + Apple + "\n" + "Бургер=" + Burger);
    }
}








