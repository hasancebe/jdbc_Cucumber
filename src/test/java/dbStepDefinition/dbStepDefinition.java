package dbStepDefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

/*public class dbStepDefinition extends DBUtils {

    List<Object> studentsTableId=new ArrayList<>();
    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        // Write code here that turns the phrase above into concrete actions
        createConnection();

    }
    @Given("Kisiler tablosundaki {String}leri listeler.")
    public void kisiler_tablosundaki_leri_listeler(String id) {
        // Write code here that turns the phrase above into concrete actions
        studentsTableId=getColumnData("SELECT * FROM students",id);
        System.out.println(studentsTableId.toString());

    }
    @Given("Verilen {string} dogrulanir")
    public void verilen_dogrulanir(String string) {
        // Write code here that turns the phrase above into concrete actions

    }




    @Given("Database baglantisikapatilir.")
    public void database_baglantisikapatilir() {
        // Write code here that turns the phrase above into concrete actions
        closeConnection();

    }

}
/*@Given("Kisiler tablosundaki <{string}>leri listeler.")
    public void kisiler_tablosundaki_leri_listeler(String id) {
        // Write code here that turns the phrase above into concrete actions
        studentsTableId=getColumnData("SELECT * FROM students",id);
        System.out.println(studentsTableId.toString());



    }

    @Given("Verilen <{string}> dogrulanir")
    public void verilen_dogrulanir(String id) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(id);
        for (Object each: studentsTableId
             ) {
           if(each.equals(id)){
               System.out.println("girilen id mevcuttur" );
            System.out.println(id);}
        }*/