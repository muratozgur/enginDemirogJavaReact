package abstracts;

import entities.Customer;

public interface ICustomerService {
	void save(Customer customer) throws Exception;//iki firma da bu fonksiyonu ister
}								//art�k //interface implemente eden her firma bu fonksiyonu kullanmak zorunda
								//iki firmayi da ayni veri tabanina kaydettigimizi varsayiyoruz