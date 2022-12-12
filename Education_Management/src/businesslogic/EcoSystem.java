/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic;

import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.MealManagement.MealPlanAdminDirectory;
import businesslogic.MealManagement.MealPlanDirectory;
import businesslogic.UniversityManagement.AppointmentDirectory;
import businesslogic.UniversityManagement.CourseAssignmentDirectory;
import businesslogic.UniversityManagement.CourseDirectory;
import businesslogic.UniversityManagement.ProfessorDirectory;
import businesslogic.UniversityManagement.StudentMealPlanDirectory;
import businesslogic.UniversityManagement.StudentUDirectory;
import businesslogic.UniversityManagement.UniversityAdminDirectory;
import businesslogic.UniversityManagement.UniversityDirectory;
import businesslogic.dormitory.FeesPaymentHistory;
import businesslogic.dormitory.LoginDetails;
import businesslogic.dormitory.RoomBookingHistory;
import businesslogic.dormitory.SalaryPaymentHistory;
import businesslogic.school.BookAppointmentDirectory;
//import businesslogic.school.LibraryBookDirectory;
//import businesslogic.school.ParentDirectory;
import businesslogic.school.SchoolAdminDirectory;
import businesslogic.school.SchoolDirectory;
import businesslogic.school.StudentDirectory;
import businesslogic.school.SchoolStudentMealPlanDirectory;
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
    private StudentDirectory studentDirectory = new StudentDirectory();
//    private ParentDirectory parentDirectory = new ParentDirectory();
    private TeacherDirectory teacherDirectory = new TeacherDirectory();
//    private LibraryBookDirectory libraryDirectory = new LibraryBookDirectory();
    private SchoolStudentMealPlanDirectory schoolStudentMealPlanDirectory = new SchoolStudentMealPlanDirectory();
    
    // university
    private PersonUDirectory personDirectoryRef = new PersonUDirectory();
    private UniversityDirectory universityDirectory = new UniversityDirectory();
    private UniversityAdminDirectory universityAdminDirectory = new UniversityAdminDirectory();
    private MealPlanDirectory mealPlanDirectoryRef = new MealPlanDirectory();
    private MealPlanAdminDirectory MealPlanAdminDirectory = new MealPlanAdminDirectory();
    
    private StudentUDirectory studentDirectoryRef = new StudentUDirectory();
    private ProfessorDirectory professorDirectoryRef = new ProfessorDirectory();
    private CourseDirectory courseDirectoryRef = new CourseDirectory();
    private CourseAssignmentDirectory courseAssignmentRef = new CourseAssignmentDirectory();
    private AppointmentDirectory appointmentDirectoryRef = new AppointmentDirectory();
    private CommunityDirectory communityDirectoryRef = new CommunityDirectory();
    private CourseAssignmentDirectory courseAssignment = new CourseAssignmentDirectory();
    private StudentMealPlanDirectory smp = new StudentMealPlanDirectory();
    
    
    // dormitory
//    private FeesPaymentHistory feesPaymentHistory = new FeesPaymentHistory();
//    private RoomBookingHistory roomBookingHistory = new RoomBookingHistory();
//    private SalaryPaymentHistory salaryPaymentHistory = new SalaryPaymentHistory();
//    private LoginDetails loginDetails = new LoginDetails();

    private EcoSystem() {
        
    }

    public static EcoSystem getInstance() {
        if(ecoSystem==null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
    
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

//    public ParentDirectory getParentDirectory() {
//        return parentDirectory;
//    }
//
//    public void setParentDirectory(ParentDirectory parentDirectory) {
//        this.parentDirectory = parentDirectory;
//    }

    public TeacherDirectory getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(TeacherDirectory teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }
   
//    public LibraryBookDirectory getLibraryDirectory() {
//        return libraryDirectory;
//    }
//
//    public void setLibraryDirectory(LibraryBookDirectory libraryDirectory) {
//        this.libraryDirectory = libraryDirectory;
//    }

    public SchoolAdminDirectory getSchoolAdminDirectory() {
        return schoolAdminDirectory;
    }

    public void setSchoolAdminDirectory(SchoolAdminDirectory schoolAdminDirectory) {
        this.schoolAdminDirectory = schoolAdminDirectory;
    }

    public UniversityDirectory getUniversityDirectory() {
        return universityDirectory;
    }

    public void setUniversityDirectory(UniversityDirectory universityDirectory) {
        this.universityDirectory = universityDirectory;
    }

    public UniversityAdminDirectory getUniversityAdminDirectory() {
        return universityAdminDirectory;
    }

    public void setUniversityAdminDirectory(UniversityAdminDirectory universityAdminDirectory) {
        this.universityAdminDirectory = universityAdminDirectory;
    }

    public SchoolStudentMealPlanDirectory getSchoolStudentMealPlanDirectory() {
        return schoolStudentMealPlanDirectory;
    }

    public void setSchoolStudentMealPlanDirectory(SchoolStudentMealPlanDirectory schoolStudentMealPlanDirectory) {
        this.schoolStudentMealPlanDirectory = schoolStudentMealPlanDirectory;
    }
    
    public MealPlanDirectory getMealPlanDirectoryRef() {
        return mealPlanDirectoryRef;
    }

    public void setMealPlanDirectoryRef(MealPlanDirectory mealPlanDirectoryRef) {
        this.mealPlanDirectoryRef = mealPlanDirectoryRef;
    }

    public MealPlanAdminDirectory getMealPlanAdminDirectory() {
        return MealPlanAdminDirectory;
    }

    public void setMealPlanAdminDirectory(MealPlanAdminDirectory MealPlanAdminDirectory) {
        this.MealPlanAdminDirectory = MealPlanAdminDirectory;
    }

    public PersonUDirectory getPersonDirectoryRef() {
        return personDirectoryRef;
    }

    public void setPersonDirectoryRef(PersonUDirectory personDirectoryRef) {
        this.personDirectoryRef = personDirectoryRef;
    }

//    public FeesPaymentHistory getFeesPaymentHistory() {
//        return feesPaymentHistory;
//    }
//
//    public void setFeesPaymentHistory(FeesPaymentHistory feesPaymentHistory) {
//        this.feesPaymentHistory = feesPaymentHistory;
//    }
//
//    public RoomBookingHistory getRoomBookingHistory() {
//        return roomBookingHistory;
//    }
//
//    public void setRoomBookingHistory(RoomBookingHistory roomBookingHistory) {
//        this.roomBookingHistory = roomBookingHistory;
//    }
//
//    public SalaryPaymentHistory getSalaryPaymentHistory() {
//        return salaryPaymentHistory;
//    }
//
//    public void setSalaryPaymentHistory(SalaryPaymentHistory salaryPaymentHistory) {
//        this.salaryPaymentHistory = salaryPaymentHistory;
//    }
//
//    public LoginDetails getLoginDetails() {
//        return loginDetails;
//    }
//
//    public void setLoginDetails(LoginDetails loginDetails) {
//        this.loginDetails = loginDetails;
//    }

    public StudentUDirectory getStudentDirectoryRef() {
        return studentDirectoryRef;
    }

    public void setStudentDirectoryRef(StudentUDirectory studentDirectoryRef) {
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

    public StudentMealPlanDirectory getSmp() {
        return smp;
    }

    public void setSmp(StudentMealPlanDirectory smp) {
        this.smp = smp;
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

