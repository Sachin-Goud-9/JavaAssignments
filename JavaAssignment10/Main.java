public class Main {
    public static void main(String[] args) {
        SList<Integer> sList = new SList<Integer>();
        SListIterator<Integer> sListIterator = list.Iterator();
        System.out.println(sList.toString());
        System.out.println(sListIterator.isEmpty());
        sListIterator.add(1);
        sListIterator.add(2);
        System.out.println(sList.toString());
        sListIterator.remove();
        System.out.println(sList.toString());
        sListIterator.add(3);
        sListIterator.add(4);
        sListIterator.add(5);
        System.out.println(sList.toString());
        sListIterator.remove();
        System.out.println(sListIterator.isEmpty());
        System.out.println(sList.toString());
    }
}
