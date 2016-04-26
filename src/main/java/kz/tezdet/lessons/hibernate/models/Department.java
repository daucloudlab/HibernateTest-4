package kz.tezdet.lessons.hibernate.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department", catalog = "employee_db2")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId ;

    @Column(name = "dept_name")
    private String departmentName ;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees = new HashSet<Employee>();

    public Department(){}

    public Department(String departmentName, Set<Employee> employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
