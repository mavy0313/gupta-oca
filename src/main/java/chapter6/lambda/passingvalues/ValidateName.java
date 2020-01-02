package chapter6.lambda.passingvalues;

class ValidateName implements Validate {
    @Override
    public boolean check(Emp emp) {
        return emp.getName().startsWith("P");
    }
}
