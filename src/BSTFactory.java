/*Silvio Orozco 18282
 * Jose Castañeda 18161
 * HDT9
 * */
public class BSTFactory {
	//Se crea una instancia o de Red Black Tree o de Splay Tree
	public BSTInterface<String, String> create(String n){
        if (n.equals("RedBlack")){
            return new RedBlackTree<>();
        } else if (n.equals("Splay")){
            return new SplayTree<>();
        }
		return null;
    }

}
