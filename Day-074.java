LRU Cache
Difficulty: HardAccuracy: 18.44%Submissions: 174K+Points: 8
Design a data structure that works like a LRU Cache. Here cap denotes the capacity of the cache and Q denotes the number of queries. Query can be of two types:

PUT x y: sets the value of the key x with value y
GET x: gets the value of key x if present else returns -1.
The LRUCache class has two methods get() and put() which are defined as follows.

get(key): returns the value of the key if it already exists in the cache otherwise returns -1.
put(key, value): if the key is already present, update its value. If not present, add the key-value pair to the cache. If the cache reaches its capacity it should remove the least recently used item before inserting the new item.
In the constructor of the class the capacity of the cache should be initialized.

class LRUCache {
    private static int capacity;
    private static LinkedHashMap<Integer, Integer> cache;
    LRUCache(int cap) {
        capacity = cap;
        cache = new LinkedHashMap<>(cap, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }
    public static int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    public static void put(int key, int value) {
        cache.put(key, value);
    }
}
