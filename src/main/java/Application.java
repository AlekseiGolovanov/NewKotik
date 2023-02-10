import model.Kotik;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // конструктор с параметрами
        Kotik kotik1 = new Kotik("Vasya", 1, 2.5, 10, "Moor-Moor");// объект с параметрами
        System.out.println("Create kotik" + " " + kotik1.getName());
        Kotik.toCount();
        //коструктор без параметров
        Kotik kotik2 = new Kotik();
        kotik2.setName("Tom");
        kotik2.setWeight(5);
        kotik2.setAge(2);
        kotik2.setSatiety(5);
        kotik2.setSay("Myau-Myau");
        System.out.println("Create kotik" + " " + kotik2.getName());
        Kotik.toCount();

        Kotik player = kotik1; // переменная, позволяющая использовать разные объекты


        // текущее состояние кота
        kotik1.currentStatus();
        kotik2.currentStatus();

        // сканнер имени
        Scanner scan = new Scanner(System.in);// объект сканер
        System.out.println("\"Choose a cat\"  Vasya/Tom");

        String answer = scan.nextLine(); //текстовая переменная
        System.out.println(answer);
        //если ответ "yes" тогда игаем, при любом другом ответе кот уходит спать
        if (answer.equals("Vasya")) { //сравнение текстовой переменной с набранными текстом

            System.out.println("\"Hi! I'm a cat \"" + " " + player.getName());
        } else {
            player = kotik2;
            System.out.println("\"Hi! I'm a cat \"" + " " + player.getName());
        }

        // если котик не голоден он выполняет рандомные методы, иначе спит
        if (player.getSatiety()>0) {
            player.liveAnotherDay();
        }else{
            player.sleep();
        }
        // сколько создано котов
        System.out.println("Created " + player.getCount() + " kats");
        //сравнение голосов котов
        System.out.println( kotik1.getSay());
        System.out.println( kotik2.getSay());


        if (kotik1.getSay().equals(kotik2.getSay())) {
            System.out.println("The voices cats are the same");//голоса одинаковые
        } else {
            System.out.println("The voices cats are different");//голоса разные
        }
    }

}




