package InterfaceSegregation.Sol;

public interface CacheStore {
    public void AddKey();
    public void RemoveKey() ;
    public void Evict() ;
}
