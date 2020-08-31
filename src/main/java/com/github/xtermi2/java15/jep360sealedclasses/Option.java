package com.github.xtermi2.java15.jep360sealedclasses;

import java.util.Objects;

public abstract sealed class Option<T> {

    public abstract T get();

    public boolean isEmpty() {
//        TODO: this should work, shouldn't it?
//        return switch (this) {
//            case None -> true;
//            case Some -> false;
//        };
        return this instanceof None;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    private static final class None<T> extends Option<T> {
        private static final None<Object> NONE = new None<>();

        @Override
        public T get() {
            throw new NullPointerException();
        }
    }

    private static final class Some<T> extends Option<T> {
        private final T some;

        private Some(T some) {
            this.some = Objects.requireNonNull(some);
        }

        @Override
        public T get() {
            return some;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> Option<T> of(T nullable) {
        if (null == nullable) {
            return (Option<T>) None.NONE;
        } else {
            return new Some(nullable);
        }
    }
}
