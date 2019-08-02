import java.util.LinkedList;
import java.util.List;

public class ListOfKeyValue {

    static List<KeyValue> listOfKeyValue;

    public static LinkedList<KeyValue> createList() {
        return new LinkedList<>();
    }

    public static void addElementToList(KeyValue keyValue) {
        listOfKeyValue.add(keyValue);
    }

    public static int size() {
        return listOfKeyValue.size();
    }

}
