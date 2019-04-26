
public class BSTFactory {

	public BSTInterface<String, String> create(String n){
        if (n.equals("RedBlack")){
            return new RedBlackTree<>();
        } else if (n.equals("Splay")){
            return new SplayTree<>();
        }
		return null;
    }

}
