package platforms.ui.mobile.ios;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import platforms.ui.mobile.ios.iOSPageObjects.iOSBaseScreen;
//import utils.DriverFactory;
//
//public class iOSPageFactoryObject extends DriverFactory {
//
//    AppiumDriver<MobileElement> iOSDriverApp = null;
//
//    iOSBaseScreen iOSBaseScreenLocators;
//
//
//    public iOSPageFactoryObject(AppiumDriver<MobileElement> iOSDriver) {
//        driver = iOSDriver;
//    }
//
//    public iOSBaseScreen getiOSBaseScreenLocators() {
//        if (iOSBaseScreenLocators == null)
//            iOSBaseScreenLocators = new iOSBaseScreenLocators(driver);
//        return iOSBaseScreenLocators;
//    }
//}
