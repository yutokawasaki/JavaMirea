package Lab7;

import java.util.ArrayList;

public class TestArrayList{

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Саша");
        people.add("Настя");
        people.add("Полина");
        people.add("Вика");
        people.add(0, "Ален"); // добавляем элемент по индексу 1

        System.out.println(people.get(0));// получаем 2-й объект
        people.set(0, "Ален брадяга"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList содержит %d элементов \n", people.size());
        for(String person : people){

            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Вика")){

            System.out.println("ArrayList содержит Вика");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Полина");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
}