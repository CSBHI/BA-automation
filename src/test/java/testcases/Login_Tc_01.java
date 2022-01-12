package testcases;

import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class Login_Tc_01 extends BaseClass{

    @Test
    public void loginTest(){
        BaseClass bs = new BaseClass();
        bs.setup();
        LoginPage Lp = new LoginPage();
        try {
            Lp.doSomething(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();

            if (driver.getTitle().equals(" Chemist at Play - India’s First Ceramides-Based Skincare Brand")) {
                System.out.println(driver.getTitle());
                Assert.assertTrue(true);
            }

                else
                {
                    Assert.assertTrue(false);
            }

            }
        }
        //BaseClass.tearDown();

    }
