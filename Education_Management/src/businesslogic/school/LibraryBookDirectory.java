/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class LibraryBookDirectory {
    private static ArrayList<Library> libraryDirectory;
    
    public LibraryBookDirectory() {
        libraryDirectory = new ArrayList<Library>();
    }

    public static ArrayList<Library> getLibraryDirectory() {
        return libraryDirectory;
    }

    public static void setLibraryDirectory(ArrayList<Library> libraryDirectory) {
        LibraryBookDirectory.libraryDirectory = libraryDirectory;
    }
    
    public static Library getBookByID(int bookID) {
        for(Library l : libraryDirectory) {
            if(l.getBookID() == bookID){
                return l;
            }
        }
        return null;
    }
    
    public static Library addBook(Library l) {
        libraryDirectory.add(l);
        return l;
    }
    
    public void deleteBook(Library l) {
        libraryDirectory.remove(l);
    }
}
