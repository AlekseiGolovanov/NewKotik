package model;

import java.util.Scanner;

public class Kotik {
    private String name;//переменная "имя"0
    private int Age = 1;
    private double Weight;//переменная "вес"
    private static int count = 0;//переменная "количество животных"
    private int satiety = 5;// переменная "уровень сытости"
    private String say = "Myau";

    // конструктор с параметрами


    public Kotik(String name, int age, double weight, int satiety, String say) {
        this.name = name;
        this.Age = age;
        this.Weight = weight;
        this.satiety = satiety;
        this.say = say;
    }


    public Kotik() {   //конструктор без параметров
    }

    public static int getCount() {
        return count;
    } // геттер подсчета животных


    public String getName() {
        return name;
    }   //геттер "имя"


    public void setName(String name) {
        this.name = name;
    }  //сеттер "имя"


    public int getWeight() {
        return (int) Weight;
    } //геттер "вес"


    public void setWeight(int weight) {
        Weight = weight;
    }// сеттер вес



    public int getAge() {
        return Age;
    } //геттер "возраст"

    public void setAge(int age) {
        Age = age;
    } //сеттер "возраст"

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public int getSatiety() {
        return satiety;
    }

    //геттер "удовлетворенность"

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    } //сеттер "удовлетворенность"

    // медот создания цикла 24 итерации
    public void liveAnotherDay() {
        int i = 1; // индекс
        int H = 5; // количество методов действия кота
        while (i < 24) {
            int v = (int) (Math.random() * H + 1); // переменная рандомного числа
            i++;

            switch (v) {
                case 1:
                    ran();
                    break;
                case 2:
                    jump();
                    break;
                case 3:
                    play();
                    break;
                case 4:
                    chaseMouse();
                    break;
                case 5:
                    talk();
                    break;
            }
            toSatiety(); // метод проверки удовлетворенности
        }
    }
    // метод "кушать" увеличивает уровень сытости
    public void eat(int satiety) {
        this.satiety = satiety;
        this.satiety = this.satiety + 5;
    }
    //метод "кушать" принимает "сытость" и "еду"
    public void eat(int satiety, String food) {
        System.out.println("Thanks! I'm full! "  + getName() + " I ate meet");

    }
    //метод "кушать" запускает методы еды
    public void eat() {
        eat(this.satiety, "meet");
        eat(this.satiety);
    }

    //метод "играть", сытость уменьшилась на 1
    void play() {
        //if (this.satiety > 0) {
        System.out.println(getName() + " playing");// метод "играть"
        this.satiety = this.satiety - 1;

    }
    //метод "бегать", сытость уменьшилась на 1
    void ran() {
        // if (this.satiety > 0) {
        System.out.println(getName() + " running");//метод "бегать"
        this.satiety = this.satiety - 1;
    }
    //метод "говорить"
    void talk() {

        System.out.println(getName() + " say " + getSay());

    }
    //метод "спать", сытость увеличилась на 1

    public void sleep() {

        System.out.println(getName() + " sleeping");//метод "спать"
        this.satiety = this.satiety + 1;

    }
    //метод "прыгать", сытость уменьшилась на 1

    public void jump() {

        System.out.println(getName() + " jumping");//метод "прыгать"
        this.satiety = this.satiety - 1;
    }
    //метод "поймать мышь", сытость увеличилась на 2

    void chaseMouse() {
        System.out.println((name + " caught a mouse")); //метод ловить
        this.satiety = this.satiety -1;
    }
    // метод подсчета количества созданных животных

    public static void toCount() {
        count++;
    }
    // текущий статус животного
    public void currentStatus() {
        System.out.println("Kat " + " " + getName() + ": " + "Weight- " + getWeight() + ", Satiety - " + getSatiety() + ", Age " + getAge());// текщий истатус животного
        ;//добавить инфы о текущем состоянии

    }
    // текущая удовлетворенность
    void toSatiety() {
        if (this.satiety > 0) {
            System.out.println(" pleased\n");

        } else {
            System.out.println(" hungry");// показать уровень сытости
            eat();
            //System.out.println(getName() + " I ate meet");

        }
    }
}




