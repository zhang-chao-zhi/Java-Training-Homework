package com.readandwrite;

import java.io.File;
import java.io.IOException;

public interface Read {
    void classicWay(File sourceFile) throws IOException;
    void coolerWay(File sourceFile) throws IOException;
}
