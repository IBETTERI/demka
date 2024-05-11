package com.better.demka.repository;

import com.better.demka.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface UserReposi extends CrudRepository<Message, Long>{
}
