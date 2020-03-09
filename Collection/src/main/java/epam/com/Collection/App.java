package epam.com.Collection;
public class App extends Arraylist
{
	public static void main( String[] args )
    {
        Arraylist<Integer> list=new Arraylist<Integer>();
        list.addElement(10);
        list.addElement(5);
        list.addElement(6);
        list.addElement(7);
        list.addElement(3);
        list.addElement(6);
        list.addElement(7);
        list.addElement(5);
        list.addElement(4);
        list.addElement(4);
        list.addElement(17);
        list.addElement(15);
        list.addElement(16);
        logger.info(list.getElement(6));
        list.delete(4);
        list.print();
    }
}