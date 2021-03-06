package libs;

import java.util.HashMap;

public class HashMapUnique<K, V> extends HashMap<K, V> {
    @Override
    public V put(K key, V value) throws IllegalArgumentException {
        if (this.containsKey(key)) {
            throw new IllegalArgumentException("element with key=" + key + " already exists");
        }
        return super.put(key, value);
    }
}
