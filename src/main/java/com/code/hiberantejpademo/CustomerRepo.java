package com.code.hiberantejpademo;

//public interface CustomerRepo extends {
//}
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, String> {
}