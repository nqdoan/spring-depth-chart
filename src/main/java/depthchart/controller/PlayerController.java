package depthchart.controller;

import depthchart.model.dao.PlayerRepository;
import depthchart.model.dto.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depthchart")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    //Get list of all players
    @CrossOrigin
    @GetMapping("/list")
    public List<Player> listPlayer(){
        return playerRepository.findAll();
    }
    //Display a chosen player
    /*
    @CrossOrigin
    @GetMapping("/pokemon/{id}")
    public Optional<Player> displayPlayer(@PathVariable(value = "id") Long pId){
        return playerRepository.findById(pId);
    }
    */


}