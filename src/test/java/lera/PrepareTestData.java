package lera;

import java.util.ArrayList;

public class PrepareTestData {
    public ArrayList<Integer>  addItemsInList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
            System.out.println(i + " " + list);
        }
        return  list;

    }

    public void createListWithStringItem(ArrayList<Integer> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i).toString());
            System.out.println(i + " " + list1);


        }
    }
}
