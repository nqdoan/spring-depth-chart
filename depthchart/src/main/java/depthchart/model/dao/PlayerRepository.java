package main.java.depthchart.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pokemonspring.model.dto.Player;

@Repository
public interface PlayerRepository extends JpaRepository {

}