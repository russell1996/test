package tasks.tasks190224.hw1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    private final ArrayList<Object> things = new ArrayList<>();


    // реализуйте метод put()
    public void put(Object target) {
        if (target != null) {
            things.add(target);
        }
    }
    // реализуйте метод check()

    public boolean check(Object target) {
        if (target == null) {
            return false;
        }

        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}