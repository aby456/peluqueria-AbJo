package com.peluqueria.peluqueria.controllers;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.peluqueria.peluqueria.dto.NewReservacionDTO;
import com.peluqueria.peluqueria.dto.ReservacionDTO;
import com.peluqueria.peluqueria.services.ReservacionService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/reservacion")
public class ReservacionController {
    private final ReservacionService reserv;
    public ReservacionController(ReservacionService rsvr){
        this.reserv = rsvr;
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody NewReservacionDTO examDTO){
        try{
            ReservacionDTO result = reserv.create(examDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }catch(Exception e){

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> retrieve(@PathVariable("id") Long id){
        try {
            ReservacionDTO result = reserv.retrieve(id);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @GetMapping()
    public ResponseEntity<?> list(){
        try {
            List<ReservacionDTO> result = reserv.list();
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody ReservacionDTO reservacionDTO, @PathVariable("id") Long id){
        try {
            ReservacionDTO result = reserv.update(reservacionDTO,id);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        try {
            reserv.delete(id);
            return ResponseEntity.ok().body("reservory Delete");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }






}