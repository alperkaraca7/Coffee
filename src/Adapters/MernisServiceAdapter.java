package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealCustomer(Customer customer)  {
		
		KPSPublicSoapProxy client = new  KPSPublicSoapProxy();
		
		try {
			try {
				return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityid()),customer.getFirstname().toUpperCase(),customer.getLastname().toUpperCase(),customer.getDateofbirth());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}
