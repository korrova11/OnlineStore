package pro.sky.java.course2.OnlineStore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope
public class BasketService {


    List<Integer> basket;

    public BasketService(List<Integer> bask) {
        this.basket = bask;
    }


    public void addInBasket(ArrayList<Integer> list) {

        basket.addAll(list);
    }


    public List<Integer> getBasket() {
        return basket;
    }
}
