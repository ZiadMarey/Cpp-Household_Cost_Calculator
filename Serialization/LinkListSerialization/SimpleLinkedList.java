import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.*;

    public class SimpleLinkedList<E> implements Iterable<E> , Serializable   {
        private transient Entry head, tail; // transient means "don't serialize the class Entry"
        private int size;

        public SimpleLinkedList() {

        }

        public void prepend(E data) {
            head = new Entry(null, data, head);
            if (head.next != null) {
                head.next.previous = head;
            }
            if (tail == null) {
                tail = head;
            }
            size++;
        }

        public void append(E data) {
            tail = new Entry(tail, data, null);
            if (tail.previous != null) {
                tail.previous.next = tail;
            }
            if (head == null) {
                head = tail;
            }
            size++;
        }

        public E getFirst() {
            return head.data;
        }

        public E getLast() {
            return tail.data;
        }

        public E getAndRemoveFirst() {
            if (head == null) {
                throw new IllegalStateException();
            }
            E item = head.data;
            if (head.next == null) {
                tail = null;
            } else {
                head.next.previous = null;
            }
            head = head.next;
            size--;
            return item;
        }

        public E getAndRemoveLast() {
            if (tail == null) {
                throw new IllegalStateException();
            }
            E item = tail.data;
            if (tail.previous == null) {
                head = null;
            } else {
                tail.previous.next = null;
            }
            tail = tail.previous;
            size--;
            return item;
        }

        public int getSize() {
            return size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof SimpleLinkedList<?>)) {
                return false;
            }

            SimpleLinkedList<?> that = (SimpleLinkedList<?>) o;

            if (size != that.size) {
                return false;
            }

            Iterator<E> iter;
            Iterator<?> otherIter;
            iter = iterator();
            otherIter = that.iterator();

            while (iter.hasNext() && otherIter.hasNext()) {
                if (!iter.next().equals(otherIter.next())) {
                    return false;
                }
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = size;
            for (E element : this) {
                result = 31 * result + element.hashCode();
            }
            return result;
        }

        private class Entry  {
            E data;
            Entry previous, next;

            Entry(Entry previous, E data, Entry next) {
                this.previous = previous;
                this.data = data;
                this.next = next;
            }
        }

        // implementation of Iterable<E>, enables the class to be iterated via foreach

        public Iterator<E> iterator() {
            return new Iter();
        }

        private class Iter implements Iterator<E> , Serializable {

            public Iter() {

            }

            private Entry next = head;

            @Override
            public boolean hasNext() {
                return next != null;
            }

            @Override
            public E next() {
                if (next == null) {
                    throw new NoSuchElementException();
                }
                E data = next.data;
                next = next.next;
                return data;
            }
        }
    }

