/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentdb;

import java.util.List;
import model.DepEmpTable;
import model.Department;
import model.Employee;

/**
 *
 * @author User
 */
public class DepartmentReport {
    public static void main(String[] args){
        List<Employee> empList = DepEmpTable.findAllEmployee();
        System.out.println("All Employee (by ID)");
        System.out.println("--------------------");
        for(Employee emp : empList){
            System.out.print(emp);
            System.out.println("--------------------");
        }
        
        List<Department> depList = DepEmpTable.findAllDepartment();
        System.out.println();
        System.out.println("All Employee (by Department)");
        System.out.println("--------------------");
        for(Department dep : depList){
            System.out.print(dep);
            System.out.println("--------------------");
            for(Employee emp : empList){
                if(emp.getDepartmentid().equals(dep)){
                    System.out.print(emp);
                    System.out.println("--------------------");
                }
            }
            
        }
    }
}
