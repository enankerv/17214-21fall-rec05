package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList implements IntegerList{
    // the number of attempted element insertions
    private int totalAdded;
    private SortedIntList a;

    public DelegationSortedIntList() {
        totalAdded = 0;
        a = new SortedIntList();
    }

    public boolean addAll(IntegerList list) {
        if(a.addAll(list)) {
            totalAdded += list.size();
            return true;
        }
        return false;
    }

    public boolean add(int num) {
        if(a.add(num)) {
            totalAdded += 1;
            return true;
        }
        return false;
    }

    public int get(int index){
        return a.get(index);
    }

    public boolean remove(int num){
        return a.remove(num);
    }

    public boolean removeAll(IntegerList list){
        return a.removeAll(list);
    }

    public int size(){
        return a.size();
    }


    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return totalAdded;
    }

}