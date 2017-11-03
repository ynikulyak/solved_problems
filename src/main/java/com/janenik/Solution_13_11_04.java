package com.janenik;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by jane on 9/10/16.
 */
public class Solution_13_11_04 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        ArrayList<String> listOfKeys = new ArrayList<>();
        while (true)
        {
            key = reader.readLine();
            if ("looser".equals(key) || "user".equals(key) || "coder".equals(key) || "proger".equals(key)) {
                listOfKeys.add(key);
            } else {
                break;
            }
        }

        //тут цикл по чтению ключей, пункт 1
        {
            //создаем объект, пункт 2

            for (String a : listOfKeys)
            {
                if ("user".equals(a))
                    person = new Person.User();
                if ("looser".equals(a))
                    person = new Person.Looser();
                if ("coder".equals(a))
                    person = new Person.Coder();
                if ("proger".equals(a))
                    person = new Person.Proger();
                doWork(person);
            }
        }

    }

    public static void doWork(Person person)
    {
        // пункт 3
        if (person instanceof Person.User)
            ((Person.User) person).live();
        if (person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        if (person instanceof Person.Looser)
            ((Person.Looser) person).doNothing();
        if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }

    public interface Person
    {
        public static class User implements Person
        {
            void live()
            {
                System.out.println("Usually I just live");
            }
        }

        public static class Looser implements Person
        {
            void doNothing()
            {
                System.out.println("Usually I do nothing");
            }
        }

        public static class Coder implements Person
        {
            void coding()
            {
                System.out.println("Usually I create code");
            }
        }

        public static class Proger implements Person
        {
            void enjoy()
            {
                System.out.println("Wonderful life!");
            }
        }
    }
}
