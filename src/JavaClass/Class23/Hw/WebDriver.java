package JavaClass.Class23.Hw;
class TestHw2 {
    public static void main(String[] args) {
        WebDriver [] performMethods = {new ChromeDriver(), new FireFoxDriver()};
        for(WebDriver perform:performMethods) {
            perform.openBrowser();
            perform.maximizeWindow();
            perform.findElement();
            perform.closeBrowser();
        }
    }
}
public interface WebDriver {
    void openBrowser();
    void maximizeWindow();
    void findElement();
    void closeBrowser();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximize Chrome Browser Window");
    }
    @Override
    public void findElement() {
        System.out.println("Perform find Element in Chrome Browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open FireFox Browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox Browser Window");
    }
    @Override
    public void findElement() {
        System.out.println("Perform find Element in FireFox Browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox Browser");
    }
}