package dbStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;
import org.testng.asserts.SoftAssert;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StepDefinitionCompanies  extends DBUtils {

   List<Object>companiesData=new ArrayList<>();
    @Given("{string} tablosunun biligileri yazdirilir")
    public void tablosunun_biligileri_yazdirilir(String tablo_ismi) {
        // Write code here that turns the phrase above into concrete actions
       executeQuery(" select * from "+ tablo_ismi);




    }
    @Given("{string} tablosundaki {string} tablosu yazdirilir.")
    public void tablosundaki_tablosu_yazdirilir(String tabloismi, String sutunismi) {
        // Write code here that turns the phrase above into concrete actions
        companiesData= getColumnData("select * from "+ tabloismi, sutunismi);
        System.out.println(companiesData.toString());
    }





    @And("{string} companylerin oldugu kontrol edilir.")
    public void companylerinOlduguKontrolEdilir(String marka) {
        companiesData= getColumnData("select * from companies", "company_name");
      Assert.assertTrue(companiesData.contains(marka));

    }

    @And("{string} tablosunda personel sayisinin {int} den fazla oldugu test edilir")
    public void tablosundaPersonelSayisininDenFazlaOlduguTestEdilir(String sutunismi, int sayi) {
            SoftAssert softAssert=new SoftAssert();

            List<Object>personnelNumber=new ArrayList<>();
            personnelNumber=getColumnData("select * from companies",sutunismi);
            for (int i = 0; i < personnelNumber.size() ; i++) {
                int a=Integer.parseInt(String.valueOf(personnelNumber.get(i)));
                Assert.assertTrue(a>sayi);//,"100 den az personel sayısı olan company yok");
                //System.out.println(a);

            }
                    }

    @And("Company idsi {int} den fazla olan companyler yazdırılır")
    public void companyIdsiDenFazlaOlanCompanylerYazdırılır(int arg0) {

        companiesData= Collections.singletonList(getQueryResultList("select company_id from companies where company_id>1200"));
        Object[] array=companiesData.stream().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
    }
}



