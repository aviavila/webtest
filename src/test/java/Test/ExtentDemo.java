package Test;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
    static ExtentTest test;
    static ExtentReports report;
    protected Object driver;
    public WebDriver getDriver() {

        return null;
    }

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        Thread.sleep(5000);
        WebDriver driver = null;
        driver.quit();

    }

    @Test
    @Order(1)
    public void testWelcomePage() {
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test0 = report.startTest("testWelcomePage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://play.euw.leagueoflegends.com/en_GB");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/a")).equals("play for free")) {
            test.log(LogStatus.PASS, "sign up success");
        } else {
            test.log(LogStatus.FAIL, "Test Failed captch found");
        }
        if (driver.getTitle().equals("Become a Legend")) {
            test.log(LogStatus.PASS, "info has found");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
        if (driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/ul/li[1]/a")).equals("privacy notice")) {
            test.log(LogStatus.PASS, "all class present info");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
        if (driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/ul/li[1]/a")).equals("privacy notice")) {
            test.log(LogStatus.PASS, "privacy notice");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
        if (driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/ul/li[2]/a")).equals("terms of service")) {
            test.log(LogStatus.PASS, "sign up success");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
        if (driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/ul/li[3]/a")).equals("cookie policy")) {
            test.log(LogStatus.PASS, "cookie policy");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(2)
    public void testHomePage(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test1 = report.startTest("testHomePage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(3)
    public void testChempionPage(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test2 = report.startTest("testChempionPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(4)
    public void testNewslist(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test3 = report.startTest("testPatchNotsPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(5)
    public void testPatchNotsPage(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test3 = report.startTest("testPatchNotsPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(6)
    public void testDiscoverListPage(){
    ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test4 = report.startTest("testDiscoverListPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(7)
    public void testEsportPage(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test5 = report.startTest("testEsportPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(8)
    public void testUniversPage(){
    ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test6 = report.startTest("testUniversPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(9)
    public void testRIOTGameShopPage(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test7 = report.startTest("testRIOTGameShopPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(10)
    public void testRIOTGameSupport(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test7 = report.startTest("testRIOTGameShopPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(11)
    public void testLanguagePage(){
        ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test9 = report.startTest("testLanguagePage");
        ExtentTest test8 = report.startTest("testRIOTGameSupportPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(12)
    public void testSignInPage(){
    ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test10 = report.startTest("testSignInPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(13)
    public void testPlayNowPage(){
    ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
      ExtentTest test11 = report.startTest("testPlayNowPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(14)
    public void testAccountListPage(){
    ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
        ExtentTest test12 = report.startTest("testAccountListPage");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @Test
    @Order(15)
    public void testDownMenuPage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVI\\Desktop\\אוטומציה 210120\\files\\jar\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://euw.leagueoflegends.com/en-gb/how-to-play/");
        if (driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/a/img")).equals("League")) {
            test.log(LogStatus.PASS, "Navigated to the specified URL");
        } else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }

    @AfterClass
    public static void endTest() {
        report.endTest(test);
        report.flush();
        
    }


    }
