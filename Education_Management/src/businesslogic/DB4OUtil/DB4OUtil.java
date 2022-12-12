/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.DB4OUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import businesslogic.ConfigureASystem;
import businesslogic.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;

/**
 *
 * @author jazibjavaid
 */
public class DB4OUtil {
    
    //private static final String FILENAME = Paths.get("eco.ser").toAbsolutePath().toString();// path to the data store
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }
    
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }
    
    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }
    
    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
     
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
       }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
    
//    public void storeObject(EcoSystem system) {
//        try {
//            File f = new File(FILENAME);
//            if (!f.isFile()) {
//                f.createNewFile(); // if file already exists will do nothing 
//            }
//            FileOutputStream newFile = new FileOutputStream(FILENAME);
//            ObjectOutputStream oos = new ObjectOutputStream(newFile);
//            oos.writeObject(system);
//            oos.close();
//            newFile.close();
//        } catch(Exception ex) {
//            System.out.print(ex.getMessage());
//        }
//    }
//    
//    
//    public EcoSystem retreiveObject() {
//        File f = new File(FILENAME);
//        if (f.isFile() && f.canRead()) {
//            try {
//                FileInputStream newFile = new FileInputStream(FILENAME);
//                ObjectInputStream oos = new ObjectInputStream(newFile);
//                EcoSystem ecoSystem = (EcoSystem)oos.readObject();
//                return ecoSystem;
//            } catch(Exception ex) {
//                System.out.print(ex.getMessage());
//                return null;
//            }
//        } else {
//            return ConfigureASystem.configure();
//        }
//    }
    
}


