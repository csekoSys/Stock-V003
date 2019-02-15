
package stock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CASHREGISTERTYPES")
public class CashregisterType {
    
    @Id
    @GeneratedValue
    private int id;
    
}
