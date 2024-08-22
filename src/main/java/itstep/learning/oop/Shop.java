package itstep.learning.oop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<Product>();
        products.add( new Lamp("Philips", 60.0) ) ;
        products.add( new Pump("Pumper", 100) ) ;
    }

    public void run() {
        printProducts();
        System.out.println("-----------------MANUAL----------------------");
        printManualProducts();
        System.out.println("-----------------NON-MANUAL----------------------");
        printNonManualProducts();
    }

    private void printManualProducts() {
        for (Product product : products) {
            if( product instanceof Manual ) {
                System.out.println( product.getCard() );
            }
        }
    }

    private void printNonManualProducts() {
        for (Product product : products) {
            if( ! ( product instanceof Manual ) ) {
                System.out.println( product.getCard() );
            }
        }
    }

    private void printProducts() {
        for (Product product : products) {
            System.out.println( product.getCard() );
        }
    }
}

/*                (manufacturer)
Shop <>------------> Product
                        △           | Поліморфізм - існування одної
                      / | \         | сутності в різних формах
           Accumulator  |  Pump
           (capacity)  Lamp  (productivity)
                      (power)

Accumulator (manufacturer, capacity)
Lamp (manufacturer, power)
Pump (manufacturer, productivity)

Product [manufacturer, getManufacturer(), set()]
Lamp extends Product
Lamp [ [<manufacturer>, getManufacturer(), set()], power, set() ]

Д.З. Ввести до переліку сутностей програми
Accumulator (manufacturer, capacity)
Додати до колекції Products об'єкт цієї сутності, переконатись у
виведенні її картки.

Інтерфейси - класи (типи) які містять тільки абстрактні тільки публічні тільки методи
- контракти
- маркери

*/
