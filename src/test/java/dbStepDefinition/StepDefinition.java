package dbStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class StepDefinition extends DBUtils {

    List<Object> studentsTableId=new ArrayList<>();
    List<Object> studentId=new ArrayList<>();
    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        // Write code here that turns the phrase above into concrete actions
        createConnection();
    }
    @Given("Students tablosundaki id ler yazdırılır.")
    public void students_tablosundaki_id_ler_yazdırılır() {
        // Write code here that turns the phrase above into concrete actions
        studentsTableId=getColumnData("select * from  students","id");
        System.out.println(studentsTableId.toString());

    }
    @Given("Glen listede {int} id nolu student kontrol edilir")
    public void glen_listede_id_nolu_student_kontrol_edilir(Integer id) {
        // Write code here that turns the phrase above into concrete actions
        for (Object each: studentId
             ) {
            if(id==Integer.parseInt(String.valueOf(each)))
                System.out.println("id mevcut");
        }

    }
    @Then("Database baglantisikapatilir.")
    public void database_baglantisikapatilir() {
        // Write code here that turns the phrase above into concrete actions
        closeConnection();
    }






    @Given("Glen listede {string}  nolu student kontrol edilir")
    public void glenListedeNoluStudentKontrolEdilir(String id) {
        for (Object each: studentId
        ) {
            Assert.assertEquals(each,id);
        }
    }
}
