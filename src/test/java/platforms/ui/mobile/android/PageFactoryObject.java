package platforms.ui.mobile.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.android.AndroidPageObjects.*;

public class PageFactoryObject {

    public AppiumDriver<MobileElement> driver = null;

    AndroidBaseScreen baseScreenLocators;
    AndroidChatScreen chatScreenLocators;
    AndroidLoadCardScreen loadCardScreenLocators;
    AndroidOverviewScreen overviewScreenLocators;
    AndroidSubscribeScreen subscribeScreenLocators;
    AndroidTaskScreen taskScreenLocators;
    AndroidHeyNedPayScreen heyNedPayScreen;
    AndroidHeyNedSettingsScreen heyNedSettingsScreen;
    AndroidTaskManagementScreen taskManagementScreen;
    AndroidCreditCardChatRoutingScreen creditCardChatRoutingScreenLocation;

    public PageFactoryObject(AppiumDriver<MobileElement> androidDriver) {
        driver = androidDriver;
    }

    public AndroidBaseScreen getBaseScreenLocators() {

        if(baseScreenLocators == null) {
            baseScreenLocators = new AndroidBaseScreen(driver);
        }
        return baseScreenLocators;
    }

    public AndroidChatScreen getChatScreenLocators() {

        if(chatScreenLocators == null) {
            chatScreenLocators = new AndroidChatScreen(driver);
        }
        return chatScreenLocators;
    }

    public AndroidLoadCardScreen getLoadCardScreenLocators() {

        if(loadCardScreenLocators == null) {
            loadCardScreenLocators = new AndroidLoadCardScreen(driver);
        }
        return loadCardScreenLocators;
    }

    public AndroidOverviewScreen getOverviewScreenLocators() {

        if(overviewScreenLocators == null) {
            overviewScreenLocators = new AndroidOverviewScreen(driver);
        }
        return overviewScreenLocators;
    }

    public AndroidSubscribeScreen getSubscribeScreenLocators() {

        if(subscribeScreenLocators == null) {
            subscribeScreenLocators = new AndroidSubscribeScreen(driver);
        }
        return subscribeScreenLocators;
    }

    public AndroidTaskScreen getTaskScreenLocators() {

        if(taskScreenLocators == null) {
            taskScreenLocators = new AndroidTaskScreen(driver);
        }
        return taskScreenLocators;
    }

    public AndroidHeyNedPayScreen getHeyNedPayScreen() {

        if(heyNedPayScreen == null) {
            heyNedPayScreen = new AndroidHeyNedPayScreen(driver);
        }
        return heyNedPayScreen;
    }

    public AndroidHeyNedSettingsScreen getHeyNedSettingsScreen() {

        if(heyNedSettingsScreen == null) {
            heyNedSettingsScreen = new AndroidHeyNedSettingsScreen(driver);
        }
        return heyNedSettingsScreen;
    }

    public AndroidTaskManagementScreen getTaskManagementScreen() {

        if(taskManagementScreen == null) {
            taskManagementScreen = new AndroidTaskManagementScreen(driver);
        }
        return taskManagementScreen;
    }

    public AndroidCreditCardChatRoutingScreen getCreditCardChatRoutingScreenLocation() {

        if(creditCardChatRoutingScreenLocation == null) {
            creditCardChatRoutingScreenLocation = new AndroidCreditCardChatRoutingScreen(driver);
        }
        return creditCardChatRoutingScreenLocation;
    }
}
