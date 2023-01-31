package dbStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StepDefinition extends DBUtils {

    List<Object> studentsTableId=new ArrayList<>();
    List<Object> studentData=new ArrayList<>();
    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        // Write code here that turns the phrase above into concrete actions
        createConnection();
    }

    @Then("Database baglantisikapatilir.")
    public void database_baglantisikapatilir() {
        // Write code here that turns the phrase above into concrete actions
        closeConnection();
    }


    @Given("Gelen listede {string}  dogrulanir.")
    public void gelenListedeDogrulanir(String id) {
        List<Object>intidList=new ArrayList<>();
      intidList=getColumnData("select * from students","id");

        Assert.assertTrue(intidList.toString().contains(id));
    }

    @Given("Students tablosundaki {string}ler yazdirilir.")
    public void studentsTablosundakiLerYazdirilir(String column_adı) {
        studentsTableId=getColumnData("select * from  students",column_adı);
        System.out.println(studentsTableId);
    }

    @And("{string} numarasi verilen studentin {string} güncellenir.")
    public void numarasiVerilenStudentinGüncellenir(String id, String city) throws SQLException {
        update("update students set city= '"+city+ "' where id="+ id);


    }



    @And("Students tablosundaki city ler yazdırılır.")
    public void studentsTablosundakiCityLerYazdırılır() {
        List<Object>cityList=new ArrayList<>();
        cityList=getColumnData("select * from students", "city");
        System.out.println(cityList);
    }
    @And("{string} guncellendigi dogrulanir.")
    public void guncellendigiDogrulanir(String city) {
        List<Object>cityList=new ArrayList<>();
        cityList=getColumnData("select * from students", "city");

        Assert.assertTrue(cityList.toString().contains(city));
    }
}
