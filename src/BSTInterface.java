
public interface BSTInterface<Key extends Comparable<Key>, Value> {

	public void put(Key key, Value val);

    public boolean contains(Key key);

    public Value get(Key key);
}
