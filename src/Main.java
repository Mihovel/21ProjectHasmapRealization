public class Main {

    static ListOfKeyValue[] testingHashMap = new ListOfKeyValue[32];

    public static void addElementToHashMap(String key, String value) {

        int pos = KeyValue.getPos(testingHashMap.length);

        KeyValue element = new KeyValue();
        KeyValue.setKeyValue(key, value);

        if (testingHashMap[pos] != null) {
            testingHashMap[pos].addElementToList(element);
        } else {
            testingHashMap[pos].createList();
            testingHashMap[pos].addElementToList(element);
        }

    }

    public static void printHashMap() {

        for (int i = 0; i < testingHashMap.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(testingHashMap[i].toString());
            }

        }

    }

    public static void main(String[] args) {

        addElementToHashMap("q", "1");
        addElementToHashMap("w", "2");

        printHashMap();

    }

}
