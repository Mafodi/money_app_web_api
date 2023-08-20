function() {   
  var env = karate.env; // get system property 'karate.env'
  if (!env) {
    env = 'QA';
  }
  var config = {
    HomeLoans_BaseURL : 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1',
    HomeLoans_xIbmClientId : 'ada1292d-01fa-4d52-a85d-3194c07d8414',
    VPN_proxy : 'http://10.74.11.24:3128',
    Internet_proxy : 'http://172.17.2.12:80',
    loginAuthURL : 'http://dev-nma.smas.nednet.co.za/tokenprovider/providers/login',
    InApp_Client_BaseUrl : 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/clientnotifications/v1',
    InApp_BackOffice_BaseUrl : 'https://api-qa.it.nednet.co.za/nedbank2/backofficenotifications/v1',

 }

  if (env == 'DEV') {
   config.HomeLoans_BaseURL =     'https://api-dev-int-pvt.it.nednet.co.za/nedbank/dev-intpvt/homeloansdigital/v1/';
   config.HomeLoans_xIbmClientId = '1009043d-8009-49ee-9fdb-bcd09dfc2960';
   config.VPN_proxy = 'http://10.74.11.24:3128';
   config.loginAuthURL =  'http://dev-nma.smas.nednet.co.za/tokenprovider/providers/login';
   config.InApp_BackOffice_BaseUrl = '';
   config,InApp_Client_BaseUrl = '';
  }
  else if (env == 'ETE') {
    config.HomeLoans_BaseURL = 'https://api-e.nedsecure.co.za/nedbankext/e2e-public/homeloansdigital/v1/';
    config.HomeLoans_xIbmClientId = 'c00e9cc9-760f-402b-8555-c83ae4d29e44';
    config.VPN_proxy = 'http://10.74.11.24:3128';
    config.loginAuthURL =  'http://dev-nma.smas.nednet.co.za/tokenprovider/providers/login';
    config.InApp_BackOffice_BaseUrl = '';
    config,InApp_Client_BaseUrl = '';
   }
  else if (env == 'QA'){
    config.HomeLoans_BaseURL = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/homeloansdigital/v1';
    config.HomeLoans_xIbmClientId = 'ada1292d-01fa-4d52-a85d-3194c07d8414';
    config.VPN_proxy = 'http://10.74.11.24:3128';
    config.loginAuthURL =  'http://dev-nma.smas.nednet.co.za/tokenprovider/providers/login';
    config.InApp_BackOffice_BaseUrl = 'https://api-qa.it.nednet.co.za/nedbank2/backofficenotifications/v1';
    config,InApp_Client_BaseUrl = 'https://nedmobile-api-q.nedsecure.co.za/nedbank/nedmobile/clientnotifications/v1';
    config.VasOpsConfig_BaseUrl = 'https://qa-config.vas.nednet.co.za/';
    config.VAS_OrderEngine_BaseURL = 'https://qa-order.vas.nednet.co.za/';
    config.VAS_ReferenceData_BaseURL = 'https://api-q.nedsecure.co.za/nedbank/referencedata/v1';
  }

  karate.log("Environment is ::: "+env+" Base URL is ::: "+ config.VasOpsConfig_BaseUrl);
  karate.configure('readTimeout', 6000000);
  karate.configure("connectTimeout", 50000);

  return config;
}