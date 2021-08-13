import org.springframework.beans.factory.FactoryBean;


public class CarImpl implements FactoryBean<Car> {
    private Car car;
	@Override
	public Car getObject() throws Exception {
		
		return car;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
