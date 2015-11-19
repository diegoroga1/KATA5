package kata5v2;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Pablo Alonso
 */
public class Histogram <T>{
    HashMap <T,Integer> map = new HashMap<>();

    public Integer get(Object o) {
        return map.get(o);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public void increment (T key){
        map.put(key, map.containsKey(key)? map.get(key)+1 : 1);
    }
    
}
