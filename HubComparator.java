package task;

import java.util.Comparator;

class HubComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof String){
            return Integer.compare(((String) o1).length(), ((String) o2).length());
        } else if (o1 instanceof Integer) {
            return Integer.compare((Integer) o1, (Integer) o2);
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}