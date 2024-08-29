package com.offerup.AccountsService.DatabaseAccessors;


import com.offerup.AccountsService.DataTransferObjects.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsDataBase extends MongoRepository<User, String> {

}
