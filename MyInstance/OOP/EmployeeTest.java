package MyInstance;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 35, "Software Engineer", 10000.0);

        System.out.println("员工信息:");
        System.out.println("姓名: " + employee.getName());
        System.out.println("年龄: " + employee.getAge());
        System.out.println("职务: " + employee.getPost());
        System.out.println("销售额: " + employee.getSalary());
        employee.work();

        // 修改员工信息
        employee.setAge(59);
        employee.setSalary(2000.0);
        System.out.println();

        System.out.println("更新后员工信息:");
        System.out.println("姓名: " + employee.getName());
        System.out.println("年龄: " + employee.getAge());
        System.out.println("职务: " + employee.getPost());
        System.out.println("销售额: " + employee.getSalary());
        employee.work();
    }
}
