package edu.cmu.cs.cs214.rec04;

import java.util.Comparator;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntList extends SortedIntList {
    // the number of attempted element insertions
    private int totalAdded;

    public InheritanceSortedIntList() {
        totalAdded = 0;
    }

    /**
     * Gets the total number of attempted int insertions to the list since it
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return this.totalAdded;
    }

    @Override
    public boolean add(int num) {
        if(super.add(num)) {
            totalAdded += 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(IntegerList list) {
        if(super.addAll(list)) {
            //totalAdded += list.size();
            return true;
        }
        return false;
    }

}