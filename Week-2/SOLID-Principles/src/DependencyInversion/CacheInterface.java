package DependencyInversion;

public interface CacheInterface {
    public void addKey(String key, String value);
    public void removeKey(String Key);
    public void evictKey();
}
