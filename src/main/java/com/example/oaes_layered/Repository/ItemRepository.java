package com.example.oaes_layered.Repository;

import com.example.oaes_layered.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
