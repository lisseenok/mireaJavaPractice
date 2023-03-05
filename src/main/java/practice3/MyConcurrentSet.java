package practice3;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MyConcurrentSet<E> implements Set<E> {
    private final Semaphore sem = new Semaphore(1);
    private final Set<E> set = new HashSet<>();

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        boolean a;
        try {
            sem.acquire();
            a = set.contains(o);
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    @Override
    public Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        Object[] a;
        try {
            sem.acquire();
            a = set.toArray();
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return a;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        try {
            sem.acquire();
            int pos = 0;
            for (E i : set) {
                a[pos] = (T) i;
                pos++;
            }

            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return a;
    }

    @Override
    public boolean add(E e) {

        try {
            sem.acquire();
            set.add(e);
            sem.release();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        return true;
    }


    @Override
    public boolean remove(Object o) {
        try {
            sem.acquire();
            set.remove(o);
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean a;
        try {
            sem.acquire();
            a = set.containsAll(c);
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean a;
        try {
            sem.acquire();
            a = set.addAll(c);
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a;
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        boolean a;
        try {
            sem.acquire();
            a = set.retainAll(c);
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean a;
        try {
            sem.acquire();
            a = set.removeAll(c);
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    @Override
    public void clear() {
        try {
            sem.acquire();
            set.clear();
            sem.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

