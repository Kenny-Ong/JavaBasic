package CodingAvenger.Project2;

public class Task4Test {
    public static void main(String[] args) {
        RemoteWebDriverInterface chrome = new ChromeDriver();
        RemoteWebDriverInterface firefox = new FirefoxDriver();
        RemoteWebDriverInterface safari = new SafariDriver();

        RemoteWebDriverInterface[] browser = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for (RemoteWebDriverInterface print : browser) {
            print.open();
            print.close();
            print.getTitle();
            print.getScreenshot();
            print.navigate();
            System.out.println("-------------------------------------");
        }
    }
}