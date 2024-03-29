package css.tipcalculator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TipViewModel extends ViewModel {
    private CustomerTip tip = new CustomerTip();                  // instatiate the tip calculator


    void calculate(Double bill, Integer numPeople, boolean goodService){
        tip.calculate(bill, numPeople, goodService);
    }

    public Double getTotalTip() {
        return tip.getTotalTip();
    }

    public Double getTipPerPerson() {
        return tip.getTipPerPerson();
    }

}
