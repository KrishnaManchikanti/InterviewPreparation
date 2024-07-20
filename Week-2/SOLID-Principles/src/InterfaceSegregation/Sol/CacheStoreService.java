package InterfaceSegregation.Sol;

public class CacheStoreService implements CacheStore{
    @Override
    public void AddKey() {
        System.out.println("key added");
    }

    @Override
    public void RemoveKey() {
        System.out.println("key removed");
    }

    @Override
    public void Evict() {
        System.out.println("evicted");
    }
}
