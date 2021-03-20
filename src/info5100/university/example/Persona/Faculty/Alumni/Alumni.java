/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty.Alumni;

import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.Employers;
import info5100.university.example.Persona.StudentAccount;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author psrib
 */
public class Alumni {
String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    StudentProfile studentProfile;
    Employers emp;
   
    int promotions;
    int salaryRange;
    int gradutationYear;
    String position;
    static HashMap<String, Alumni> alumniDir;

    HashMap<String, Double> map = new HashMap();
               
    public HashMap<String, Alumni> getAlumniDir() {
        return alumniDir;
    }

//    public Alumni getAlumniDir(String id) {
//                System.out.println("ALm1 "+ alumniDir.);
//
//        return alumniDir.get(id);
//    }

    public void setAlumniDir(HashMap<String, Alumni> alumniDir) {
        
        this.alumniDir = alumniDir;
        System.out.println("ALm "+ alumniDir.size());
    }
    
       
    
    public StudentProfile getStudentProfile() {
        
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public Employers getEmp() {
        return emp;
    }

    public void setEmp(Employers emp) {
        this.emp = emp;
    }

    public int getPromotions() {
        return promotions;
    }

    public void setPromotions(int promotions) {
        this.promotions = promotions;
    }

    public int getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(int salaryRange) {
        this.salaryRange = salaryRange;
    }

    public int getGradutationYear() {
        return gradutationYear;
    }

    public void setGradutationYear(int gradutationYear) {
        this.gradutationYear = gradutationYear;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public double getAMG(){
        
       return getSalaryPoints() + getPromotionPoints() /2;
    }
    
    public double getSalaryPoints(){
         Double points =0.0;
         if(getSalaryRange()>70000 && getSalaryRange() <80000 ){
            points = 2.5;
        }else if(getSalaryRange()>= 80000 && getSalaryRange() <90000){
            points = 5.0;
        }else if(getSalaryRange()>= 90000 && getSalaryRange() < 130000){
            points = 7.5;
        }else if(getSalaryRange() >= 130000){
            points =10.0;
        }
       return points;
    }
    
    
    public double getPromotionPoints(){
        Double points =0.0;
         if(getPromotions() == 0){
            points = 2.5;
        }else if(getPromotions()==1){
            points = 5.0;
        }else if(getPromotions()==2){
            points = 7.5;
        }else if(getPromotions()==3){
            points = 10.0;
        }
       return points;
    }
   
}
