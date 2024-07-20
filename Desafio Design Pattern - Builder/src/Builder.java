
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Add add = Add.builder()
			.name("José da Silva")
			.age(24)
			.natural_peron(true)
			.legal_peron(false);
		 
		 System.out.println(add);
	}

}
