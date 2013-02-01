package kademlia;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Implementation of the Kademlia DHT.
 *
 * Kademlia is a distributed hash table with fairly good performance and, as it
 * functions as a regular hash table, Map is a good interface for it to
 * implement: even if some of the operations are unsuitable.
 *
 * For more information, see the Kademlia paper:
 * http://pdos.csail.mit.edu/~petar/papers/maymounkov-kademlia-lncs.pdf
 *
 * We do not permit null keys or values to be stored in this map.
 *
 * @author barrucadu
 */
public class Kademlia<K, V> implements Map<K, V> {

    @Override
    public boolean containsKey(Object o) {
        return get(o) != null;
    }

    /*
     * TODO: Implement all of the following methods.
     */
    @Override
    public V get(Object o) {
        if (o == null) {
            throw new NullPointerException("Keys cannot be null.");
        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("Keys cannot be null.");
        }

        if (v == null) {
            throw new NullPointerException("Values cannot be null.");
        }


        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V remove(Object o) {
        if (o == null) {
            throw new NullPointerException("Keys cannot be null.");
        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * The following methods I don't consider suitable for a DHT to implement,
     * as they require global knowledge of the system to function.
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Cannot get size of DHT.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Cannot get size of DHT.");
    }

    @Override
    public boolean containsValue(Object o) {
        throw new UnsupportedOperationException("Cannot look up keys by value in DHT.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Cannot clear DHT.");
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Cannot list keys in DHT.");
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException("Cannot list values in DHT.");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Cannot list entries in DHT.");
    }
}
