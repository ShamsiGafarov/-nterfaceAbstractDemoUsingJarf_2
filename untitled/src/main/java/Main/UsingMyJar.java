package Main;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.text.SimpleDateFormat;

public class UsingMyJar {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        baseCustomerManager.Save(new Customer(01103642,"Shamsi", "Gafarov",new SimpleDateFormat("01/06/1981"),"Turk"));

    }
}
