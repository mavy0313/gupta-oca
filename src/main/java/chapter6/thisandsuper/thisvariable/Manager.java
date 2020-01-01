package chapter6.thisandsuper.thisvariable;

class Manager implements Interviewer {
    @Override
    public String print() {
        return ("I am " + this);
    }
}
