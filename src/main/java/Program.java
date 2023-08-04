public class Program {
    /*
Задача:

a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можно использовать ArrayList;
d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
g. Не забываем про метод добавления фрукта в коробку.

Формат сдачи: ссылка на гитхаб проект

     */
    public static void main(String[] args) {
        // Initial
        Box<Apple> appleBox1= new Box<>("appleBox1");
        Box<Apple> appleBox2= new Box<>("appleBox2");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Box<Orange> orangeBox1 = new Box<>("orangeBox1");
        Box<Orange> orangeBox2 = new Box<>("orangeBox2");
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        appleBox1.addFruit(apple1);
        appleBox1.addFruit(apple2);
        appleBox1.addFruit(apple3);
        appleBox1.addFruit(apple4);
        appleBox2.addFruit(apple5);
        appleBox2.addFruit(apple6);
        appleBox2.addFruit(apple7); appleBox2.addFruit(apple8); appleBox2.addFruit(apple9);
        orangeBox1.addFruit(orange1);
        orangeBox2.addFruit(orange2); orangeBox2.addFruit(orange3);
        // getWeight and Print box
        System.out.println(appleBox1);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox1);
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2);
        System.out.println(orangeBox2.getWeight());
        System.out.println("=".repeat(20));
        // compare
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println(appleBox1.compare(appleBox1));
        System.out.println("=".repeat(20));
        //pour box
        appleBox1.pour(appleBox2);
        System.out.println(appleBox1);
        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println();
        orangeBox2.pour(orangeBox1);
        System.out.println(orangeBox1);
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2);
        System.out.println(orangeBox2.getWeight());




    }
}