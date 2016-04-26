package kz.tezdet.lessons.hibernate.main;

import kz.tezdet.lessons.hibernate.models.Department;
import kz.tezdet.lessons.hibernate.models.Employee;
import kz.tezdet.lessons.hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory() ;
        Session session = sf.openSession() ;
        session.beginTransaction() ;

        Department department = new Department() ;
        department.setDepartmentName("Director");
        session.save(department) ;

        Employee emp1 = new Employee("Әлия", "Анарбекова", "111");
        Employee emp2 = new Employee("Дәулет", "Баймбетов", "222");

        emp1.setDepartment(department);
        emp2.setDepartment(department);

        session.save(emp1);
        session.save(emp2);

        session.getTransaction().commit();
        session.close();
    }
}
