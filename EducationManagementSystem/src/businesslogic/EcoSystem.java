/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic;

import businesslogic.MealManagement.MealPlanDirectory;
import businesslogic.UniversityManagement.AppointmentDirectory;
import businesslogic.UniversityManagement.CourseAssignmentDirectory;
import businesslogic.UniversityManagement.CourseDirectory;
import businesslogic.UniversityManagement.ProfessorDirectory;
import businesslogic.UniversityManagement.StudentDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zainabkhokawala
 */
public class EcoSystem {
    
    private static EcoSystem ecoSystem;
    
    private StudentDirectory studentDirectoryRef = new StudentDirectory();
    private ProfessorDirectory professorDirectoryRef = new ProfessorDirectory();
    private CourseDirectory courseDirectoryRef = new CourseDirectory();
    private CourseAssignmentDirectory courseAssignmentRef = new CourseAssignmentDirectory();
    private AppointmentDirectory appointmentDirectoryRef = new AppointmentDirectory();
    private PersonUDirectory personDirectoryRef = new PersonUDirectory();
    private CommunityDirectory communityDirectoryRef = new CommunityDirectory();
    private MealPlanDirectory mealPlanDirectoryRef = new MealPlanDirectory();
    private CourseAssignmentDirectory courseAssignment = new CourseAssignmentDirectory();
    
    private EcoSystem(){
    
    }
    
    public static EcoSystem getInstance(){
        if(ecoSystem==null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public StudentDirectory getStudentDirectoryRef() {
        return studentDirectoryRef;
    }

    public void setStudentDirectoryRef(StudentDirectory studentDirectoryRef) {
        this.studentDirectoryRef = studentDirectoryRef;
    }

    public ProfessorDirectory getProfessorDirectoryRef() {
        return professorDirectoryRef;
    }

    public void setProfessorDirectoryRef(ProfessorDirectory professorDirectoryRef) {
        this.professorDirectoryRef = professorDirectoryRef;
    }

    public CourseDirectory getCourseDirectoryRef() {
        return courseDirectoryRef;
    }

    public void setCourseDirectoryRef(CourseDirectory courseDirectoryRef) {
        this.courseDirectoryRef = courseDirectoryRef;
    }

    public CourseAssignmentDirectory getCourseAssignmentRef() {
        return courseAssignmentRef;
    }

    public void setCourseAssignmentRef(CourseAssignmentDirectory courseAssignmentRef) {
        this.courseAssignmentRef = courseAssignmentRef;
    }

    public AppointmentDirectory getAppointmentDirectoryRef() {
        return appointmentDirectoryRef;
    }

    public void setAppointmentDirectoryRef(AppointmentDirectory appointmentDirectoryRef) {
        this.appointmentDirectoryRef = appointmentDirectoryRef;
    }

    public PersonUDirectory getPersonDirectoryRef() {
        return personDirectoryRef;
    }

    public void setPersonDirectoryRef(PersonUDirectory personDirectoryRef) {
        this.personDirectoryRef = personDirectoryRef;
    }

    public CommunityDirectory getCommunityDirectoryRef() {
        return communityDirectoryRef;
    }

    public void setCommunityDirectoryRef(CommunityDirectory communityDirectoryRef) {
        this.communityDirectoryRef = communityDirectoryRef;
    }

    public CourseAssignmentDirectory getCourseAssignment() {
        return courseAssignment;
    }

    public void setCourseAssignment(CourseAssignmentDirectory courseAssignment) {
        this.courseAssignment = courseAssignment;
    }

    public MealPlanDirectory getMealPlanDirectoryRef() {
        return mealPlanDirectoryRef;
    }

    public void setMealPlanDirectoryRef(MealPlanDirectory mealPlanDirectoryRef) {
        this.mealPlanDirectoryRef = mealPlanDirectoryRef;
    }

    
    
}
