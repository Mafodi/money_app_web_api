Feature: Setup Pre Requisites

  Background:
    * def getCurrentTimeStamp =
    """
     function() {
      var SimpleDateFormat = Java.type('java.text.SimpleDateFormat');
      var sdf = new SimpleDateFormat('yyyy-MM-dd');
      var date = new java.util.Date();
      return sdf.format(date);
    }
    """

    * def getConvertedTimeStamp =
    """
     function() {
          var DateTime = Java.type('platforms.api.apiClasses.DateTime');
          var dateTime = new DateTime();
          return dateTime.ConvertedDateStamp();
        }
    """

    * def getDateTime =
      """
        function() {
          var DateTime = Java.type('platforms.api.apiClasses.DateTime');
          var dateTime = new DateTime();
          return dateTime.getTimeStamp();
        }
      """

    * def saveId =
      """
        function(arg1, arg2) {
          var KarateUtil = Java.type('za.co.nedbank.dfl.vas.platform.test.api.KarateUtil');
          var kUtil = new KarateUtil;
          return kUtil.saveIds(arg1, arg2);
        }
      """

    * def GUUIDGenerator =
    """
      function uuidv4() {
        return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
            var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
            return v.toString(16);
        });
      }
    """



    * def KarateUtil = Java.type('platforms.api.apiClasses.KarateUtil')
    * def GenerateUUID = Java.type('platforms.api.apiClasses.KarateUtil')



  Scenario: Test data needed
    * def VendorId = 5309
    * def TagContextsId = 72
    * def productSubTypeId = 33
    * def screenFlowId = 10617
    * def productStatusId = 41
    * def refRelationId1 = 11329
    * def refRelationId2 = 11354


  Scenario: Paths for All API Calls
    * def pathForActivityApp = '/v1/config/activities'
    * def pathForServicesAPI = '/v1/config/services'
    * def pathForProductTagApplication = '/v1/config/productTags'
    * def pathForBillingTypes = '/v1/config/billingTypes'
    * def pathForCreateProduct = '/v1/config/products'
    * def pathForCreateTag = '/v1/config/tags'
    * def pathForTagFilteredProduct = '/v1/config/tagfilteredproducts'
    * def pathForDeleteProductById = '/v1/config/products/'
    * def pathForDeleteMultipleProducts = '/v1/config/products'
    * def pathForDeleteTagById = '/v1/config/tags'
    * def pathForGetProductById = '/v1/config/products'
    * def pathForGetProductStatus = '/v1/config/productStatuses/'
    * def pathForScreenFlows = '/v1/config/screenflows'
    * def pathContexts = '/v1/config/tagContexts'
    * def pathForTagRelationships = '/v1/config/tagRelationships'
    * def pathForGetTags = '/v1/config/tags'
    * def pathForGetVendor = '/v1/config/vendors'
    * def pathForWorkFlows = '/v1/config/workflows'
    * def pathForWorkFlowSteps = '/v1/config/workflowSteps/'
    * def pathForUpdateTag = '/v1/config/tags'


