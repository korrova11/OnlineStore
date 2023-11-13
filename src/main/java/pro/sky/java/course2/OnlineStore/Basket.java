package pro.sky.java.course2.OnlineStore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@SessionScope
@Component
public class Basket {
    //List<Employee> employeeList;
    // public EmployeeService(List<Employee> employeeList) {
    //    this.employeeList = employeeList;
    // }

    private ArrayList<Integer> basket;
    public Basket(ArrayList<Integer> basket) {
        this.basket = basket;
    }

    public void addInBasket(ArrayList<Integer> bask) {

        basket.addAll(bask);
    }
    public ArrayList<Integer> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Integer> basket) {
        this.basket = basket;
    }
}

