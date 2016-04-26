package kz.tezdet.lessons.hibernate.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee", catalog = "employee_db2")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId ;

    @Column(name = "firstname")
    private String firstName ;
    @Column(name = "lastname")
    private String lastName ;
    @Column(name = "birth_date")
    private Date birthDate ;
    @Column(name = "cell_phone")
    private String cellPhone ;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department ;

    public Employee(){}

    public Employee(String firstName, String lastName, String cellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
    }

    public Employee(String firstName, String lastName,
                    Date birthDate, String cellPhone, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.cellPhone = cellPhone;
        this.department = department;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
