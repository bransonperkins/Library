package library.libraryitems;

import java.util.ArrayList;

public class OverdueList<T extends LibraryItem> {
    ArrayList<T> overdueItems;

    OverdueList() {
        this.overdueItems = new ArrayList<>();
    }

    public void addOverdueItem(T item) {
        overdueItems.add(item);
    }

    public void removeOverdueItem(T item) {
        overdueItems.add(item);
    }
}
