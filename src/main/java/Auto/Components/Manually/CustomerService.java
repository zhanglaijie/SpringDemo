package Auto.Components.Manually;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dbc")
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
