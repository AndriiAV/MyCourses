package site.filter;

public interface Predicate<T> {
    boolean apply(T elem);
}
