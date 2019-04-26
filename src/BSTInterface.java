/*Silvio Orozco 18282
 * Jose Casta�eda 18161
 * HDT9
 * */
public interface BSTInterface<Key extends Comparable<Key>, Value> {

	public void put(Key key, Value val);

    public boolean contains(Key key);

    public Value get(Key key);
}
