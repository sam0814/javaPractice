package Z08_상속연습2;

public class CompanyTest {

	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany("삼성");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany(" 배달의 민족");
		DeliveryCompany yogiyo = new DeliveryCompany(" 요기요");
		
//		samsung.setCompanyName("삼성전자");
//		lg.setCompanyName("LG전자");
//		baemin.setCompanyName("배달의 민족");
//		yogiyo.setCompanyName("요기요");
		
		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		

	}

}
