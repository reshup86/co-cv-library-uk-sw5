package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "dataForJob")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Accountant","Ealing Broadway","up to 1 mile","1500","2500","Per month","Part Time","Part Time Accountant jobs in Ealing Broadway"},
                {"Chemist","Luton","up to 7 miles","20000","35000","Per annum","Permanent","Permanent Chemist jobs in Leeds"},
                {"Developer","Milton Keynes","up to 10 miles","35000","70000","Per annum","Contract","Contract Developer jobs in Milton Keynes"},
                {"Teaching Assistant","Wembley","up to 5 miles","24000","50000","Per annum","Permanent","Permanent Teaching Assistant jobs in Wembley"},
                {"Receptionist","London","up to 2 miles","2000","5000","Per annum","Part Time","Part Time Receptionist jobs in London"}
        };
        return data;
    }
}
