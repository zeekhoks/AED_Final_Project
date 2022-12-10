/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic;

import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.school.BookAppointmentDirectory;
import businesslogic.school.LibraryBookDirectory;
import businesslogic.school.ParentDirectory;
import businesslogic.school.SchoolAdminDirectory;
import businesslogic.school.SchoolDirectory;
import businesslogic.school.StudentDirectory;
import businesslogic.school.SubjectDirectory;
import businesslogic.school.TeacherDirectory;

/**
 *
 * @author drashtibhingradiya
 */
public class EcoSystem {
    
    private static EcoSystem ecoSystem;
    
    private CityDirectory cityDirectory = new CityDirectory();
    private CommunityDirectory communityDirectory = new CommunityDirectory();
    private PersonDirectory personDirectory = new PersonDirectory();
    private SchoolDirectory schoolDirectory = new SchoolDirectory();
    private SchoolAdminDirectory schoolAdminDirectory = new SchoolAdminDirectory();
    private SubjectDirectory subjectDirectory = new SubjectDirectory();
    private BookAppointmentDirectory bookAppointmentDirectory = new BookAppointmentDirectory();

    public SubjectDirectory getSubjectDirectory() {
        return subjectDirectory;
    }

    public BookAppointmentDirectory getBookAppointmentDirectory() {
        return bookAppointmentDirectory;
    }

    public void setBookAppointmentDirectory(BookAppointmentDirectory bookAppointmentDirectory) {
        this.bookAppointmentDirectory = bookAppointmentDirectory;
    }

    public void setSubjectDirectory(SubjectDirectory subjectDirectory) {
        this.subjectDirectory = subjectDirectory;
    }
    private StudentDirectory studentDirectory = new StudentDirectory();
    private ParentDirectory parentDirectory = new ParentDirectory();
    private TeacherDirectory teacherDirectory = new TeacherDirectory();
    private LibraryBookDirectory libraryDirectory = new LibraryBookDirectory();
    
    private EcoSystem() {
        
    }

    public static EcoSystem getInstance() {
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

    public CityDirectory getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(CityDirectory cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(CommunityDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public SchoolDirectory getSchoolDirectory() {
        return schoolDirectory;
    }

    public void setSchoolDirectory(SchoolDirectory schoolDirectory) {
        this.schoolDirectory = schoolDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public ParentDirectory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ParentDirectory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public TeacherDirectory getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(TeacherDirectory teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }
   
    public LibraryBookDirectory getLibraryDirectory() {
        return libraryDirectory;
    }

    public void setLibraryDirectory(LibraryBookDirectory libraryDirectory) {
        this.libraryDirectory = libraryDirectory;
    }

    public SchoolAdminDirectory getSchoolAdminDirectory() {
        return schoolAdminDirectory;
    }

    public void setSchoolAdminDirectory(SchoolAdminDirectory schoolAdminDirectory) {
        this.schoolAdminDirectory = schoolAdminDirectory;
    }
    

}

    
//    
    
            
//    private static DB4OUtil dB4OUtil = DB4OUtil.getInstance();
//    private int tmp;
//
//    public DB4OUtil getdB4OUtil() {
//        return dB4OUtil;
//    }
//
//    public void setdB4OUtil(DB4OUtil dB4OUtil) {
//        this.dB4OUtil = dB4OUtil;
//    }
//
//    public int getTmp() {
//        return tmp;
//    }
//
//    public void setTmp(int tmp) {
//        this.tmp = tmp;
//    }
//    
//    
//    public EcoSystem() {
//        int tmp = 90;
//    }
//    
//    public static void main(String[] args){
//        EcoSystem ecosystem = dB4OUtil.retrieveSystem();
//        System.out.println("Inside main..");
//        ecosystem.setTmp(100);
//        
//        dB4OUtil.storeSystem(ecosystem);
////        dB4OUtil.retrieveSystem();
//        System.out.println("in sop  "+dB4OUtil.retrieveSystem().getTmp());
//    }

