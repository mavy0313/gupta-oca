package chapter7;

import java.io.FileNotFoundException;

class HandleExceptions {
    void method6() {
        try {}
        catch (Error e) {}
    }
    void method7() {
        try {}
        catch (Exception e) {}
    }
    void method8() {
        try {}
        catch (Throwable e) {}
    }
    void method9() {
        try {}
        catch (RuntimeException e) {}
    }
    void method10() {
//        try {}
//        catch (FileNotFoundException e) {} won't compile
//        A method can declare to throw any type of exception, checked or
//        unchecked, even if it doesn’t do so. But a try block can’t define a catch
//        block for a checked exception (other than Exception) if the try block
//        doesn’t throw that checked exception or use a method that declares to throw
//                that checked exception.
    }
}
