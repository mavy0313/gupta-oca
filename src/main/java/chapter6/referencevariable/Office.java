package chapter6.referencevariable;

class Office {
    public static void main(String[] args) {
        HRExecutive hr = new HRExecutive();
        hr.specialization = new String[] {"Staffing"};
        System.out.println(hr.specialization[0]);
        hr.name = "Pavni Gupta";
        System.out.println(hr.name);
        hr.conductInterview();

        Employee emp = new HRExecutive();
//        emp.specialization = new String[] {"Staffing"};
//        System.out.println(emp.specialization[0]);
        emp.name = "Pavni Gupta";
        System.out.println(emp.name);
//        emp.conductInterview();

        Interviewer interviewer = new HRExecutive();
//        interviewer.specialization = new String[] {"Staffing"};
//        System.out.println(interviewer.specialization[0]);
//        interviewer.name = "Pavni Gupta";
//        System.out.println(interviewer.name);
        interviewer.conductInterview();
    }
}
