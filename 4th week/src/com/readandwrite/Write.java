package com.readandwrite;

import java.io.File;
import java.io.IOException;

public interface Write {
    File createFile() throws IOException;
    void writeToFile(File targetFile) throws IOException;
}
