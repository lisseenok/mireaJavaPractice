package practice3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyConcurrentHashMap<K, V> implements Map<K, V> {

    private static final Lock lock = new ReentrantLock();

    private Map<K, V> map = new HashMap<>();

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        boolean containsKey;
        lock.lock();
        containsKey = map.containsKey(key);
        lock.unlock();
        return containsKey;
    }

    @Override
    public boolean containsValue(Object value) {
        boolean containsValue;
        lock.lock();
        containsValue = map.containsValue(value);
        lock.unlock();
        return containsValue;
    }

    @Override
    public V get(Object key) {
        lock.lock();
        V v = map.get(key);
        lock.unlock();
        return v;
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        V v = map.put(key, value);
        lock.unlock();
        return v;
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        V value = map.remove(key);
        lock.unlock();
        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set<K> keySet() {
        lock.lock();
        Set<K> s = map.keySet();
        lock.unlock();
        return s;
    }

    @Override
    public Collection<V> values() {
        lock.lock();
        Collection<V> c = map.values();
        lock.unlock();
        return c;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        lock.lock();
        Set<Entry<K, V>> s = map.entrySet();
        lock.unlock();
        return s;
    }
}
