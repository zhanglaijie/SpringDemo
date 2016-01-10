package Auto.filter.Components.Manually;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
	@Autowired
	CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "CustomerService [dao=" + dao + "]";
	}
}
