/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class DepEmpTable {

    public static void insertDepartment(Department dep) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(dep);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void insertEmployee(Employee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(emp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static List<Department> findAllDepartment() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        List<Department> depList = (List<Department>) em.createNamedQuery("Department.findAll").getResultList();
        em.close();
        return depList;
    }

    public static Department findDepartmentByID(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        Department dep = (Department) em.createNamedQuery("Department.findByDepartmentid").setParameter("departmentid", id).getSingleResult();
        em.close();
        return dep;
    }
    
    public static List<Department> findDepartmentByName(String name){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        List<Department> depList = (List<Department>) em.createNamedQuery("Department.findByName").setParameter("name", name).getResultList();
        em.close();
        return depList;
    }
    
    public static List<Employee> findAllEmployee(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        List<Employee> empList = (List<Employee>) em.createNamedQuery("Employee.findAll").getResultList();
        em.close();
        return empList;
    }
    
    public static Employee findEmployeeByID(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        Employee emp = (Employee) em.createNamedQuery("Employee.findByEmployeeid").setParameter("employeeid", id).getSingleResult();
        em.close();
        return emp;
    }
    
    public static List<Employee> findEmployeeByName(String name){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        List<Employee> empList = (List<Employee>) em.createNamedQuery("Employee.findByName").setParameter("name", name).getResultList();
        em.close();
        return empList;
    }
    
    public static List<Employee> findEmployeeByJob(String job){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        List<Employee> empList = (List<Employee>) em.createNamedQuery("Employee.findByJob").setParameter("job", job).getResultList();
        em.close();
        return empList;
    }
    
    public static List<Employee> findEmployeeBySalary(int salary){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DepartmentdbPU");
        EntityManager em = emf.createEntityManager();
        List<Employee> empList = (List<Employee>) em.createNamedQuery("Employee.findBySalary").setParameter("salary", salary).getResultList();
        em.close();
        return empList;
    }
}
