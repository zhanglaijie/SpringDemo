package Declares.Components.Manually;

public class CustomerService {
	CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "CustomerService [dao=" + dao + "]";
	}
}
