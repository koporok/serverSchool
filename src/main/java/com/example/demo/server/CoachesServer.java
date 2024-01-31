package com.example.demo.server;

import com.example.demo.dto.CoachesRequest;
import com.example.demo.entity.Coaches;
import com.example.demo.repository.CoachesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoachesServer {
    private final CoachesRepository coachesRepository;

    @Autowired
    public CoachesServer(CoachesRepository coachesRepository) {
        this.coachesRepository = coachesRepository;
    }

    public List<Coaches> getAllCoaches() {
        List<Coaches> coaches = new ArrayList<>();
        coachesRepository.findAll().forEach(coaches::add);
        return coaches;
    }

    public ResponseEntity<List<Coaches>> returnAllCoaches() {
        List<Coaches> all = coachesRepository.findAll();
        return ResponseEntity.ok(all);
    }

    public ResponseEntity<Coaches> deleteCoachesById(@PathVariable Long id) {
        try {
            if (coachesRepository.existsById(id)) {
                coachesRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Coaches> addCoachesToDatabase(@RequestBody Coaches coachesRequest) {
        try {
            Coaches coaches = new Coaches();
            coaches.setFull_name(coachesRequest.getFull_name());
            coaches.setContact_information(coachesRequest.getContact_information());
            coaches.setLogin(coachesRequest.getLogin());
            coaches.setInformation(coachesRequest.getInformation());

            coachesRepository.save(coaches);

            return ResponseEntity.status(HttpStatus.OK).body(coaches);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
