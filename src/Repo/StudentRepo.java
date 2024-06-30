/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repo;

import sms.Objects.Student;

/**
 *
 * @author Shawn Arunjith
 */
public interface StudentRepo {
    
    public abstract String save(Student student);
    public abstract String update(Student student);
    public abstract String getStudent(int id);
    public abstract String deleteStudent(int id);
    
}
