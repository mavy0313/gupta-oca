package chapter7;

import java.io.FileNotFoundException;

class DemoThrowsException {
    public void readFile(String file) throws NullPointerException, FileNotFoundException {
        if (file == null)
            throw new NullPointerException();
        boolean found = findFile(file);
        if (!found)
            throw new FileNotFoundException("Missing file");
        else {
//code to read file
        }
    }
    boolean findFile(String file) {
//code to return true if file can be located
        return true;
    }
}
