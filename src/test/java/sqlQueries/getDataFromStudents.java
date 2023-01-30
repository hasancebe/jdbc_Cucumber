package sqlQueries;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class getDataFromStudents extends DBUtils {
    List<Object> studentsTableData=new ArrayList<>();

    @Given("Students tablosundaki {string} ler yazdırılır.")
    public void studentsTablosundakiLerYazdırılır(String istenenveri) {
        studentsTableData=getColumnData("select * from  students",istenenveri);
        System.out.println(studentsTableData.toString());

    }
}
