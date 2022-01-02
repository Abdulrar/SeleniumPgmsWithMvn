package pagination;

public class pagination {

	public static void main(String[] args) {


		/*
		 
		 By obj = By.xpath("//table/tbody/tr/td[1]")

         By objTwo = By.xpath("//*[@title='Next Page']")
		 
		 
//Verify created Organization is present in the list 


boolean str = CustomKeywords.'customKeywords.commanFunctions.elementIsPresent'(objTwo)

if(!str == true){

	List<WebElement> AllData = webDriver.findElements(obj)
	println(AllData.size())
	
	for (WebElement names : AllData) {
		System.out.println("------>"+names.getText())
		String str = names.getText();
		
	   //if(names.getText().equals(orgName)){
		if(str.contains(orgName)){
			 KeywordUtil.logInfo("[--------Created " +orgName +" is exist in list------]")
		
		   break
			  
	   }else {
	   
	   KeywordUtil.markFailed("[--------Created " +orgName +" is not exist in list------]")
	   
	   }
		
	}
		
	
}else{

List<String> Allnames = new ArrayList<String>()
String strAttribute = WebUI.getAttribute(findTestObject('Object Repository/AdminOrgListPage/NextPageBtn'), 'class')
System.out.println("------> ---------- "+strAttribute)

while(!strAttribute.contains("disabled")){
	
	
	namesElements = webDriver.findElements(obj)
	
	for (WebElement namesElement : namesElements) {
		
		Allnames.add(namesElement.getText())

		KeywordUtil.logInfo("------> "+Allnames)
				
	   }
	
	WebUI.click(findTestObject('Object Repository/AdminOrgListPage/NextPageBtn'))
	
	strAttribute = WebUI.getAttribute(findTestObject('Object Repository/AdminOrgListPage/NextPageBtn'), 'class')
	
	}

   if(Allnames.contains(orgName)){
	 
   KeywordUtil.logInfo("[--------Created " +orgName +" is exist in list------]")
		  
   }else{
   
   KeywordUtil.markFailed("[--------Created " +orgName +" is not exist in list------]")
   
   }

}
		 
		 
		 
		 */
		
		

	}

}
