package platforms.ui.mobile.ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import platforms.ui.mobile.ios.iOSPageObjects.*;
import platforms.ui.mobile.ios.iOSPageObjects.DC_HeyJude.*;
import platforms.ui.mobile.ios.iOSPageObjects.DC_LiveChat.iOSLiveChatScreen;
import platforms.ui.mobile.ios.iOSPageObjects.DC_LiveChat.iOSUnauthChatScreen;

public class PageFactoryObject {

    public AppiumDriver<MobileElement> iOSDriver =  null;

    iOSSubscriptionScreen subscriptionLocators;
    iOSDataUsageScreen dataUsageScreenLocators;
    iOSProfileScreen profileScreenLocators;
    iOSProfileUpdateScreen profileUpdateScreenLocators;
    iOSTermsAndConditions termsAndConditionsScreenLocators;
    iOSHeyNedSettingsScreen heyNedSettingsScreenLocators;
    iOSPaymentCardScreen cardScreenLocators;
    iOSTaskCreationScreen taskCreationScreenLocators;
    iOSPaymentScreen paymentScreenLocators;
    iOSOverviewScreen overviewScreenLocators;
    iOSNedbankChatScreen chatScreenLocarors;
    iOSLoginScreen loginScreenLocatos;
    iOSUnauthChatScreen unauthChatScreen;
    iOSLiveChatScreen chatScreen;

    public PageFactoryObject(AppiumDriver<MobileElement> driver) {
        iOSDriver = driver;
    }

    public iOSLoginScreen getLoginScreenLocatos() {
        if (loginScreenLocatos == null)
            loginScreenLocatos = new iOSLoginScreen(iOSDriver);
        return loginScreenLocatos;
    }

    public iOSUnauthChatScreen getUnauthChatScreenLocatos() {
        if (unauthChatScreen == null)
            unauthChatScreen = new iOSUnauthChatScreen(iOSDriver);
        return unauthChatScreen;
    }

    public iOSLiveChatScreen getLiveChatScreenLocators() {
        if (chatScreen == null)
            chatScreen = new iOSLiveChatScreen(iOSDriver);
        return chatScreen;
    }

    public iOSNedbankChatScreen getChatScreenLocator() {
        if (chatScreenLocarors == null)
            chatScreenLocarors = new iOSNedbankChatScreen(iOSDriver);
        return chatScreenLocarors;
    }

    public iOSOverviewScreen getOverviewScreenLocator() {
        if (overviewScreenLocators == null)
            overviewScreenLocators = new iOSOverviewScreen(iOSDriver);
        return overviewScreenLocators;
    }

    public iOSSubscriptionScreen getSubscriptionScreenLocator() {
        if (subscriptionLocators == null)
            subscriptionLocators = new iOSSubscriptionScreen(iOSDriver);
        return subscriptionLocators;
    }

    public iOSDataUsageScreen getDataUsageScreenLocator() {
        if (dataUsageScreenLocators == null)
            dataUsageScreenLocators = new iOSDataUsageScreen(iOSDriver);
        return dataUsageScreenLocators;
    }

    public iOSProfileUpdateScreen getProfileUpdateScreenLocator() {
        if (profileUpdateScreenLocators == null)
            profileUpdateScreenLocators = new iOSProfileUpdateScreen(iOSDriver);
        return profileUpdateScreenLocators;
    }

    public iOSProfileScreen getProfileScreenLocatorscreen() {
        if (profileScreenLocators == null)
            profileScreenLocators = new iOSProfileScreen(iOSDriver);
        return profileScreenLocators;
    }

    public iOSTermsAndConditions getTnCScreenLocatorscreen() {
        if (termsAndConditionsScreenLocators == null)
            termsAndConditionsScreenLocators = new iOSTermsAndConditions(iOSDriver);
        return termsAndConditionsScreenLocators;
    }

    public iOSHeyNedSettingsScreen getHeyNedSettingScreen() {
        if (heyNedSettingsScreenLocators == null)
            heyNedSettingsScreenLocators = new iOSHeyNedSettingsScreen(iOSDriver);
        return heyNedSettingsScreenLocators;
    }

    public iOSPaymentCardScreen getPaymentCardScreen() {
        if (cardScreenLocators == null)
            cardScreenLocators = new iOSPaymentCardScreen(iOSDriver);
        return cardScreenLocators;
    }

    public iOSTaskCreationScreen getTaskCreationScreen() {
        if (taskCreationScreenLocators == null)
            taskCreationScreenLocators = new iOSTaskCreationScreen(iOSDriver);
        return taskCreationScreenLocators;
    }

    public iOSPaymentScreen getPaymentScreen() {
        if (paymentScreenLocators == null)
            paymentScreenLocators = new iOSPaymentScreen(iOSDriver);
        return paymentScreenLocators;
    }

}
