package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Payment;

import java.util.Set;
@Service
public interface PaymentService {

    Payment create(Payment payment);

    Payment read(int paymentId);

    Payment read(String s);

    Payment read(Integer paymentId);

    Payment update(Payment payment);

    boolean delete(int paymentId);

    boolean delete(String s, String paymentId);

    boolean delete(Integer paymentId);

    static Set<Payment> getAll() {
        return null;
    }


}
