package site.io;

import site.Courses;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class CoursesBinReader implements ObjectReader<Courses> {

    private final ObjectInput objectInput;

    public CoursesBinReader(ObjectInput objectInput) {
        this.objectInput = objectInput;
    }

    public CoursesBinReader(InputStream inputStream) throws IOException {
        this((ObjectInput) new ObjectInputStream(inputStream));
    }

    @Override
    public Courses read() throws IOException, IllegalFormatException {
        try {
            return (Courses) objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IllegalFormatException("Films class cannot be found", e);
        }
    }

    @Override
    public void close() throws IOException {
        if (objectInput != null) {
            objectInput.close();
        }
    }
}