package site.io;

import java.io.Closeable;
import java.io.IOException;

public interface ObjectWriter<T> extends Closeable {
    void write(T val) throws IOException;
}
