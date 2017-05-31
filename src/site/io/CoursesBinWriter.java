package site.io;

import site.Courses;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CoursesBinWriter  implements ObjectWriter<Courses> {

    private final ObjectOutput objectOutput;

    public CoursesBinWriter(ObjectOutput objectOutput) {
        this.objectOutput = objectOutput;
    }

    public CoursesBinWriter(OutputStream outputStream) throws IOException {
        this((ObjectOutput) new ObjectOutputStream(outputStream));
    }

    @Override
    public void write(Courses films) throws IOException {
        objectOutput.writeObject(films);
    }

    @Override
    public void close() throws IOException {
        if (objectOutput != null) {
            objectOutput.close();
        }
    }
}