package top.laijie.spring.el.method.invocation;

import org.springframework.stereotype.Component;

@Component("priceBean")
public class Price {
	public double getSpecialPrice(){
		return new Double(99.99);
	}
}
