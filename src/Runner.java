import by.gsu.pms.Employee;
import by.gsu.pms.Converter;

public class Runner {
    public static void main(String[] args) {


        Employee[] slaves = new Employee[7];

        slaves[0] = new Employee("Alexsandr Sovin", 4, 7);
        slaves[1] = new Employee("Hanna Kovich", 19, 19);
        slaves[3] = new Employee("Olga Ivanova", 33, 14);
        slaves[4] = new Employee("Evgeniy Steklov", 27, 3);
        slaves[5] = new Employee("Georgiy Lapin", 16, 6);
        slaves[6] = new Employee();


        for (Employee Employee : slaves) {
            if (Employee != null) {
                Employee.show();
            }
        }


        slaves[slaves.length-1].setTransport_cost(53);


        for (int emp_id = 0; emp_id < slaves.length; emp_id++) {
            int sum_of_durations = 0;
            if (slaves[emp_id] != null){
                sum_of_durations = slaves[emp_id].getNumber_of_days();
            } else {
                continue;
            }
            for (int nextemp_id = emp_id + 1; nextemp_id < slaves.length; nextemp_id++) {
                if (slaves[nextemp_id] != null
                        && slaves[emp_id].getAccount().equals(slaves[nextemp_id].getAccount())){

                    sum_of_durations += slaves[nextemp_id].getNumber_of_days();
                }
            }
            System.out.println("The employee "+slaves[emp_id].getAccount()+" was on a business trip "+sum_of_durations
                    + "day(days)");
        }


        for (Employee slave : slaves) {
            if (slave != null) {
                System.out.println(slave.to_string());
            }
        }


        int total_expenses = 0;
        for (Employee slave : slaves) {
            if (slave != null) {
                total_expenses += slave.get_total();
            }
        }
        System.out.println("Total expenses: " + total_expenses);

        int emp_numb = 0;
        float emp_total = 0;
        for (int i = 0; i < slaves.length; i++) {
            if (slaves[i] != null) {
                float total = slaves[i].get_total();
                if (total > emp_total){
                    emp_numb = i;
                    emp_total = total;
                }
            }
        }
        System.out.println("The largest expense on the receipt is " + emp_total + "br. and belongs to " +
                slaves[emp_numb].getAccount());


         System.out.println(Converter.convert(432, 2.15, 3));

    }
}

