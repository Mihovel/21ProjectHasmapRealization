public class KeyValue {

    static String key;
    static String value;

    public static void setKeyValue(String key, String value) {
        KeyValue.key = key;
        KeyValue.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static int getPos(int hashMapSize) {
        return key.hashCode() % hashMapSize;
    }

    @Override
    public String toString() {
        return "key: " + key + " " + "value: " + value;
    }

}
