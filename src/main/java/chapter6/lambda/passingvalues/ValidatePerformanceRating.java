package chapter6.lambda.passingvalues;

class ValidatePerformanceRating implements Validate {
    @Override
    public boolean check(Emp emp) {
        return emp.getPerformanceRating() >= 5;
    }
}
